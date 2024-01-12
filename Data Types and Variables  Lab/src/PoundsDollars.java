import java.util.Scanner;

public class PoundsDollars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double amountInPounds = Double.parseDouble(scanner.nextLine());

        double exchangeRate = 1.36;

        double amountInDollars = amountInPounds * exchangeRate;

        System.out.printf("%.3f%n", amountInDollars);
    }
}