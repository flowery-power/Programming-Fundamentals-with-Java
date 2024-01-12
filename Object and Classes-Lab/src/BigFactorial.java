import java.math.BigInteger;
import java.util.Scanner;

public class BigFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        // Check if the number is within the valid range
        if (number < 0 || number > 1000) {
            return;
        }

        // Calculate the factorial
        BigInteger factorial = calculateFactorial(number);

        // Print the result
        System.out.println(factorial);
    }

    private static BigInteger calculateFactorial(int n) {
        BigInteger result = BigInteger.ONE;

        for (int i = 1; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }

        return result;
    }
}
