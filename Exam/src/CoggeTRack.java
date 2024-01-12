//public class CoggeTRack {
//}
//import java.util.ArrayList;
//        import java.util.Arrays;
//        import java.util.List;
//        import java.util.Scanner;
//
//public class CoffeeTracker {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        // Read the initial list of coffees
//        List<String> coffeesList = new ArrayList<>(Arrays.asList(scanner.nextLine().split(" ")));
//
//        // Read the number of commands
//        int numCommands = Integer.parseInt(scanner.nextLine());
//
//        // Process commands
//        for (int i = 0; i < numCommands; i++) {
//            String[] commandParts = scanner.nextLine().split(" ");
//            String command = commandParts[0];
//
//            switch (command) {
//                case "Include":
//                    String coffeeToAdd = commandParts[1];
//                    coffeesList.add(coffeeToAdd);
//                    break;
//                case "Remove":
//                    String removeType = commandParts[1];
//                    int numberOfCoffees = Integer.parseInt(commandParts[2]);
//                    if ("first".equals(removeType)) {
//                        for (int j = 0; j < numberOfCoffees && !coffeesList.isEmpty(); j++) {
//                            coffeesList.remove(0);
//                        }
//                    } else if ("last".equals(removeType)) {
//                        int size = coffeesList.size();
//                        for (int j = 0; j < numberOfCoffees && !coffeesList.isEmpty(); j++) {
//                            coffeesList.remove(size - 1);
//                            size--;
//                        }
//                    }
//                    break;
//                case "Prefer":
//                    int index1 = Integer.parseInt(commandParts[1]);
//                    int index2 = Integer.parseInt(commandParts[2]);
//                    if (index1 >= 0 && index1 < coffeesList.size() && index2 >= 0 && index2 < coffeesList.size()) {
//                        String temp = coffeesList.get(index1);
//                        coffeesList.set(index1, coffeesList.get(index2));
//                        coffeesList.set(index2, temp);
//                    }
//                    break;
//                case "Reverse":
//                    int left = 0;
//                    int right = coffeesList.size() - 1;
//                    while (left < right) {
//                        String temp = coffeesList.get(left);
//                        coffeesList.set(left, coffeesList.get(right));
//                        coffeesList.set(right, temp);
//                        left++;
//                        right--;
//                    }
//                    break;
//            }
//        }
//
//        // Print the manipulated list
//        System.out.print("Coffees: ");
//        System.out.println(String.join(" ", coffeesList));
//    }
//}
