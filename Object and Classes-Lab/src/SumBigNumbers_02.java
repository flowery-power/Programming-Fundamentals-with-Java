import java.math.BigInteger;
import java.util.Scanner;

public class SumBigNumbers_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the first big number as a string
        System.out.print("Enter the first big number: ");
        String num1Str = scanner.nextLine();

        // Input the second big number as a string
        System.out.print("Enter the second big number: ");
        String num2Str = scanner.nextLine();

        // Convert the input strings to BigIntegers
        BigInteger num1 = new BigInteger(num1Str);
        BigInteger num2 = new BigInteger(num2Str);

        // Calculate the sum
        BigInteger sum = num1.add(num2);

        // Print the result
        System.out.println("Sum: " + sum);
    }
}
