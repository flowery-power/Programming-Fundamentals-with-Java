import java.util.Scanner;

public class ConvertMetersKilometers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double num1 = Integer.parseInt(scanner.nextLine());

        double formula = num1/ 1000;

        System.out.printf("%.2f",formula);


    }
}
