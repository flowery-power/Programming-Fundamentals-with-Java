import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int capacity = 255;
        int totalLiters = 0;

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i < n; i++) {
            int litersToAdd = Integer.parseInt(scanner.nextLine());


            if (totalLiters + litersToAdd > capacity) {
                System.out.println("Insufficient capacity!");
            } else {
                totalLiters += litersToAdd;
            }
        }

        System.out.println(totalLiters);


    }
}
