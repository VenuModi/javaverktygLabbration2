package KataStringCalculator;

public class StringCalculator {

    public static int add(String number) {
        if (number.equals("")){
            return 0;
        } else if (number.contains(",")) {
            String[] arr = number.split(",");
            int num1 = Integer.parseInt(arr[0]);
            int num2 = Integer.parseInt(arr[1]);
            int result = num1 + num2;
            return result;
        } else {
            int singleNumber = Integer.parseInt(number);
            return singleNumber;
        }
    }
}
