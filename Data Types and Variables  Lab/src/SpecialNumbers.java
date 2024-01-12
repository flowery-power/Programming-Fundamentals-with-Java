import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int num = 1; num <= n; num++) {
            boolean isSpecial = checkSpecial(num);
            System.out.printf("%d -> %s%n", num, isSpecial);
        }
    }

    static boolean checkSpecial(int num) {
        int sumOfDigits = 0;
        int currentNum = num;

        while (currentNum > 0) {
            int digit = currentNum % 10;
            sumOfDigits += digit;
            currentNum /= 10;
        }

        return sumOfDigits == 5 || sumOfDigits == 7 || sumOfDigits == 11;




    }
}
