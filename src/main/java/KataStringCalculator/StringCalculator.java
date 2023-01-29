package KataStringCalculator;

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
        for (String num : number.split(delimeter)) {
            result += Integer.parseInt(num);
        }
        return result;
    }
}
