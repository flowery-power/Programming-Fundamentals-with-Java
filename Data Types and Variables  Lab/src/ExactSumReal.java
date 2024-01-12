import java.util.Scanner;

public class ExactSumReal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int getNumber = Integer.parseInt(scanner.nextLine());
        int x;
        int total = 0;
        for (x=1;x <= getNumber;x++) {
            total += x;
        }
        System.out.println(total);

    }
}
