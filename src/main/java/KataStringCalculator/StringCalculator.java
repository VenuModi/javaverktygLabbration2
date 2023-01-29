package KataStringCalculator;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class StringCalculator {
    public static int add(String number) {
        if (number.equals("")) {
            return 0;
        }

        String delimeter = "[,\n]";
        if (number.startsWith("//")){
          int index = number.indexOf("//") +2;
          String customPatterns = number.substring(index, number.indexOf("\n", index));
          if (customPatterns.startsWith("[") && customPatterns.endsWith("]")){
              customPatterns = customPatterns.substring(1, customPatterns.length()-1);
              delimeter = Pattern.quote(customPatterns);
          } else {
              delimeter = "[" + Pattern.quote(customPatterns) + "\n]";
          }
          number = number.substring(number.indexOf("\n") + 1);
        }

        int result = 0;
        List<Integer> negativeNumbers = new ArrayList<>();

        for (String num : number.split(delimeter)) {
            try {
                int checkValidNum = Integer.parseInt(num);
                if (checkValidNum < 0){
                    negativeNumbers.add(checkValidNum);
                } else if (checkValidNum < 1001) {
                    result += checkValidNum;
                }
            }catch (NumberFormatException e){
                System.out.println("String contains negative numbers");
            }
        }

        if (!negativeNumbers.isEmpty()){
            throw new IllegalArgumentException("Negatives not allowed: " + negativeNumbers.toString());
        }
        return result;
    }
}
