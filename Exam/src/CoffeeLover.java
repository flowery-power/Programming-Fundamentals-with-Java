import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import static java.lang.System.*;

public class CoffeeLover {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        List<String> coffesList = Arrays.stream(scanner.nextLine().split(" "))
                .collect(Collectors.toList());


        int numCommands = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numCommands; i++) {
            String[] commandParts = scanner.nextLine().split(" ");
            String command = commandParts[0];

            switch (command) {
                case "Include":
                    String product = commandParts[1];
                    coffesList.add(product);
                    break;
                case "Remove":
                    String removeType = commandParts[1];
                    int numberOfCoffees = Integer.parseInt(commandParts[2]);
                    if ("first".equals(removeType)) {
                        for (int j = 0; j < numberOfCoffees && !coffesList.isEmpty(); j++) {
                            coffesList.remove(0);
                        }
                    } else if ("last".equals(removeType)) {
                        int size = coffesList.size();
                        for (int j = 0; j < numberOfCoffees && !coffesList.isEmpty(); j++) {
                            coffesList.remove(size - 1);
                            size--;
                        }
                    }
                    break;

                case "Prefer":
                    int index1 = Integer.parseInt(commandParts[1]);
                    int index2 = Integer.parseInt(commandParts[2]);
                    if (index1 >= 0 && index1 < coffesList.size() && index2 >= 0 && index2 < coffesList.size()) {
                        String temp = coffesList.get(index1);
                        coffesList.set(index1, coffesList.get(index2));
                        coffesList.set(index2, temp);
                    }
                    break;

                case "Reverse":
                    int left = 0;
                    int right = coffesList.size() - 1;
                    while (left <right) {
                        String temp = coffesList.get(left);
                        coffesList.set(left, coffesList.get(right));
                        coffesList.set(right, temp);
                        left++;
                        right--;
                    }
                    break;




            }

        }
        System.out.println("Coffees: ");
        System.out.println(String.join(" ", coffesList));
    }

}



