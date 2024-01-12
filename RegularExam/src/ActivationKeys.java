import java.util.Scanner;

public class ActivationKeys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String activationKey = scanner.nextLine();
        String command = scanner.nextLine();

        while (!command.equals("Generate")) {
            String[] tokens = command.split(">>>");

            switch (tokens[0]) {
                case "Contains":
                    String substring = tokens[1];
                    System.out.println(activationKey.contains(substring)
                            ? activationKey + " contains " + substring
                            : "Substring not found!");
                    break;

                case "Flip":
                    int startIndex = Integer.parseInt(tokens[2]);
                    int endIndex = Integer.parseInt(tokens[3]);
                    activationKey = flipCase(activationKey, tokens[1], startIndex, endIndex);
                    System.out.println(activationKey);
                    break;

                case "Slice":
                    int sliceStart = Integer.parseInt(tokens[1]);
                    int sliceEnd = Integer.parseInt(tokens[2]);
                    activationKey = activationKey.substring(0, sliceStart) + activationKey.substring(sliceEnd);
                    System.out.println(activationKey);
                    break;
            }

            command = scanner.nextLine();
        }

        System.out.println("Your activation key is: " + activationKey);
    }

    private static String flipCase(String input, String caseType, int startIndex, int endIndex) {
        String substringToChange = input.substring(startIndex, endIndex);
        String modifiedSubstring = caseType.equals("Upper") ? substringToChange.toUpperCase() : substringToChange.toLowerCase();
        return input.substring(0, startIndex) + modifiedSubstring + input.substring(endIndex);
    }
}
