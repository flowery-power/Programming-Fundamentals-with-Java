import java.util.Scanner;

public class SortNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int threeNum = Integer.parseInt(scanner.nextLine());

        int [] numbers = {firstNum, secondNum, threeNum};

        int maxNumber = Integer.MIN_VALUE;
        int minNumber = Integer.MIN_VALUE;



        for (int i = 0; i < 3; i++){
            if (numbers[i]>maxNumber){
                maxNumber = numbers[i];
            }
            if (numbers[i]<minNumber){
                minNumber = numbers[i];
            }
        }
        System.out.println(maxNumber);
        System.out.println(firstNum+secondNum+threeNum-minNumber-maxNumber);
        System.out.println(minNumber);




    }
}
