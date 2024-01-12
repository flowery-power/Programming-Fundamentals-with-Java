import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PhoneShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> phonesList = Arrays.stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());

        String commands = scanner.nextLine();
        while (!commands.equals("End")) {



            String[] commandParts = commands.split(" - ");
            String commandName = commandParts[0];
            String product = commandParts[1];

            switch (commandName) {
                case "Add":
                    if (!phonesList.contains(product)){
                        phonesList.add(product);
                    }
                    break;
                case "Remove":
                    if (phonesList.contains(product)){
                        phonesList.remove(product);
                    }
                    break;
                case "Bonus phone":
                    String[] bonusParts = commandParts[1].split(":");
                    String existingProduct = bonusParts[0];
                    String newProduct = bonusParts[1];

                    if (phonesList.contains(existingProduct)){
                        int indexProduct = phonesList.indexOf(existingProduct);
                        phonesList.add(indexProduct + 1, newProduct);
                    }
                    break;
                case "Last":

                    if (phonesList.contains(product)){
                        phonesList.remove(product);
                        phonesList.add(product);
                    }
                    break;


        }
        commands = scanner.nextLine();

    }
        System.out.println(phonesList.stream().collect(Collectors.joining(", ")));


    }
}



