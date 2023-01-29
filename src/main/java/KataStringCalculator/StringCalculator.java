package KataStringCalculator;

public class StringCalculator {

    public static int add(String number) {
        if (number.equals("")){
            return 0;
        } else {
            int result = Integer.parseInt(number);
            return result;
        }
    }
}
