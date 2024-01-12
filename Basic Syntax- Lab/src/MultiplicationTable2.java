import java.util.Scanner;

public class MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int multiplier = Integer.parseInt(scanner.nextLine());

        if (multiplier <= 10) {
            for (int times = multiplier; times <= 10; times++) {
                int product = multiplier * times;
                System.out.printf("%d X %d = %d%n", multiplier, times, product);
            }
        } else {
            int product = multiplier * 10;
            System.out.printf("%d X %d = %d%n", multiplier, 10, product);
        }

    }
}
