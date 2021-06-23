import java.util.ArrayList;

public class StringCalculator {
    public static int add(final String numbers) {
        int returnValue = 0;
        ArrayList<Integer> nums = new ArrayList<>();
        String[] numbersArray = numbers.split(",|\n");
        for (String number : numbersArray) {
            if (!number.trim().isEmpty()) {
                int number1K = Integer.parseInt(number.trim());
                returnValue += Integer.parseInt(number.trim());
                if (number1K < 0) {
                    nums.add(number1K);
                } else if (number1K <= 1000) {

                    returnValue += number1K;
                }
            }
        }
        if (nums.size() > 0) {
            throw new RuntimeException("Cannot use negatives");
        }
        return returnValue;
    }
}