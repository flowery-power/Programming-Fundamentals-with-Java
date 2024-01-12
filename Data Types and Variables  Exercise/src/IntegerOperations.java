import java.util.Scanner;

public class IntegerOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        int firstNum = Integer.parseInt(scanner.nextLine());
        int secoundNum = Integer.parseInt(scanner.nextLine());
        int thurdNum = Integer.parseInt(scanner.nextLine());
        int fourNum = Integer.parseInt(scanner.nextLine());


        int total = (firstNum + secoundNum) / thurdNum * fourNum;
        System.out.println(total);





    }
}
