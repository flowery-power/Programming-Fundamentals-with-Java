import java.util.Scanner;

public class SimplePasswordReset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder password = new StringBuilder(scanner.nextLine());
        String command = scanner.nextLine();

        while (!command.equals("Done")) {
            String[] tokens = command.split("\\s+");

            switch (tokens[0]) {
                case "TakeOdd":
                    StringBuilder oddChars = new StringBuilder();
                    for (int i = 1; i < password.length(); i += 2) {
                        oddChars.append(password.charAt(i));
                    }
                    password = oddChars;
                    break;

                case "Cut":
                    int index = Integer.parseInt(tokens[1]);
                    int length = Integer.parseInt(tokens[2]);
                    password.delete(index, index + length);
                    break;

                case "Substitute":
                    String substring = tokens[1];
                    String substitute = tokens[2];
                    while (password.indexOf(substring) != -1) {
                        int startIndex = password.indexOf(substring);
                        int endIndex = startIndex + substring.length();
                        password.replace(startIndex, endIndex, substitute);
                    }
                    break;
            }

            command = scanner.nextLine();
        }

        System.out.println("Your password is: " + password);
    }
}
