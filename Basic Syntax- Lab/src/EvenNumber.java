import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            number = Integer.parseInt(scanner.nextLine());

            if (number % 2 != 0) {
                System.out.println("Please write an even number.\n");
            }
        } while (number % 2 != 0);

        int absoluteValue = Math.abs(number);
        System.out.printf("The number is: %d%n", absoluteValue);
    }


}
