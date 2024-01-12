import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ShoppingList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //списък с продукти
        List<String> productsList = Arrays.stream(scanner.nextLine().split("!")) //[Tomatoes!Potatoes!Bread!]
                .collect(Collectors.toList());//{masiv "Tomatoes", "Potatoes", "Bread"}

        String commands = scanner.nextLine();
        while (!commands.equals("Go Shopping!")) {
                //1. command = "Urgent {product}".split (" ") -> ["Urgent, "{product}"]
                //2. command = "Unnecessary {product}".split (" ") -> ["Unnecessary, "{product}"]
                //3. command = "Correct {product} {newProduct}".split (" ") -> ["Correct, "{product}","{Newproduct}"]
                //4. command = "Rearrange {product} ".split (" ") -> ["Rearrange, "{product}"]


            String[] commandParts = commands.split(" ");
            String commandName = commandParts[0]; // за да вземем 1 елемент на 0 - "Urgent", "Unnecessary","Correct","Rearrange"
            String product = commandParts[1];


            switch (commandName) {
                case "Urgent":
                    if (!productsList.contains(product)){
                        productsList.add(0,product); //add добавя на определено място в списъка
                    }
                    break;
                case "Unnecessary":
                    if (productsList.contains(product)){
                        productsList.remove(product);
                    }
                    break;
                case "Correct":
                    String newProduct = commandParts[2];

                    if (productsList.contains(product)){
                        int indexProduct = productsList.lastIndexOf(product); // с този индек е къде се намира продукта в списъка
                        productsList.remove(product);
                        productsList.add(indexProduct,newProduct);

                    }
                    break;
                case "Rearrange":

                    if (productsList.contains(product)){
                        productsList.remove(product);
                        productsList.add(product); // add bez index го добавя на края на списъка тук се иска разместване!
                    }
                    break;
            }
            commands = scanner.nextLine();
            //отпечатам продуктите в списъка(, ) ->  { "Tomatoes", "Potatoes", "Bread"}
        }
        System.out.println(productsList.toString() // "[Tomatoes, Potatoes, Bread]"
                .replace("[", "")// "Tomatoes, Potatoes, Bread]"
                .replace("]", ""));//"Tomatoes, Potatoes, Bread"

        // tova raboti za vsi4ki tipove spisuci, числа, дробни, текст , от вс тип.
    }
                //лист от текстове -> раборти ссамо  String.Join , НЕ РАБОТ И С ЧИСЛА
                //System.out.printLn(String.join(", ", productsList)); - samo za spisuk ot tekstove!
}
