import java.util.Scanner;

public class CharsString {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            char char1 = scanner.nextLine().charAt(0);
            char char2 = scanner.nextLine().charAt(0);
            char char3 = scanner.nextLine().charAt(0);

            String combinedString = "" + char1 + char2 + char3;
            System.out.println(combinedString);
        }

    }
}
