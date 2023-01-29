package KataStringCalculator;

import java.util.ArrayList;
import java.util.List;

public class StringCalculator {
    public static int add(String number) {
        if (number.equals("")) {
            return 0;
        }

        String delimeter = "[,\n]";
        if (number.startsWith("//")){
          int index = number.indexOf("//") +2;
          delimeter = number.substring(index, index + 1);
          number = number.substring(number.indexOf("\n") + 1);
          delimeter = "[" + delimeter + "\n]";
        }

        int result = 0;
        List<Integer> negativeNumbers = new ArrayList<>();

        for (String num : number.split(delimeter)) {
            try {
                int checkValidNum = Integer.parseInt(num);
                if (checkValidNum < 0){
                    negativeNumbers.add(checkValidNum);
                }
                result += checkValidNum;
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
