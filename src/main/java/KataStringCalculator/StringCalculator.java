package KataStringCalculator;

public class StringCalculator {

    public static int add(String number) {
        if (number.equals("")){
            return 0;
        } else if (number.contains(",")) {
            int result = 0;
            for (String num : number.split(",")) {
                result += Integer.parseInt(num);
            }
            return result;
        } else {
            return Integer.parseInt(number);
        }
    }
}
