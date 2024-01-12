import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int totalPassengers = 0;

        // Create an array to store the passenger count for each wagon
        int[] wagonPassengers = new int[n];

        for (int i = 0; i < n; i++) {
            int passengers = scanner.nextInt();
            wagonPassengers[i] = passengers;
            totalPassengers += passengers;
        }

        // Print the train configuration
        for (int i = 0; i < n; i++) {
            System.out.print(wagonPassengers[i]);
            if (i < n - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
        System.out.println(totalPassengers);
    }
}
