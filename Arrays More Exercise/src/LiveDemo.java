import java.util.Scanner;

import static java.awt.SystemColor.text;

public class LiveDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        pritnHello();
        pritnBye();
        pritText("Tsvety");

        String inputline= scanner.nextLine();
    }

    public static void  pritnHello(){
        System.out.println("Hello");
    }

    public static void  pritnBye(){
        System.out.println("Bye");
    }

    public static void  pritText(String text){
        System.out.println(text);
    }





}
