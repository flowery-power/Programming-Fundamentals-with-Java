import java.util.Scanner;

public class CenturiesMinutesWrite {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int centuries = Integer.parseInt(scanner.nextLine());

        int years = centuries * 100;
        int days = years * 365 + years / 4; // Taking into account leap years
        int hours = days * 24;
        long minutes = (long) hours * 60;

        System.out.printf("%d centuries = %d years = %d days = %d hours = %d minutes",
                centuries, years, days, hours, minutes);


    }
}
