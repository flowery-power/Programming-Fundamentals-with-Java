import java.util.Scanner;

public class RefactorSpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());

        for (int number = 1; number <= count; number++) {
            int currentNumber = number;
            int sumOfDigits = 0;

            while (currentNumber > 0) {
                int digit = currentNumber % 10;
                sumOfDigits += digit;
                currentNumber /= 10;
            }

            boolean isSpecial = (sumOfDigits == 5) || (sumOfDigits == 7) || (sumOfDigits == 11);
            System.out.printf("%d -> %s%n", number, isSpecial);
        }

    }
}
