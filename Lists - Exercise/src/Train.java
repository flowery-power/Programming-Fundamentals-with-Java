import java.util.Scanner;
import java.util.Arrays;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputNumbers = scanner.nextLine().split(" ");


        int[] numbers = Arrays.stream(inputNumbers)
                .mapToInt(Integer::parseInt)
                .toArray();
        String commands = scanner.nextLine();


        while(!commands.equals("end")){
            String [] commandType = commands.split(" ");

        }




    }
}
