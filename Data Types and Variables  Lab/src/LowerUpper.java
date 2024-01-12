import java.util.Scanner;

public class LowerUpper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        char charInput = input.charAt(0); // Get the first character from the input

        if (Character.isUpperCase(charInput)) {
            System.out.println("upper-case");
        } else if (Character.isLowerCase(charInput)) {
            System.out.println("lower-case");
        }
    }
}