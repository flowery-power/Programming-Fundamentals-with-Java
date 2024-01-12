import java.util.Scanner;

public class GuineaPig {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double foodInGrams = Double.parseDouble(scanner.nextLine()) * 1000; // преобразуване в грамове
        double hayInGrams = Double.parseDouble(scanner.nextLine()) * 1000;// преобразуване в грамове
        double coverInGrams = Double.parseDouble(scanner.nextLine()) * 1000;// преобразуване в грамове
        double pigWeightInGrams = Double.parseDouble(scanner.nextLine()) * 1000;// преобразуване в грамове

        for (int day = 1; day <= 30; day++) {
            //всеки ден яде по 300 грама
            foodInGrams -= 300;


            //всеки втори ден, сменя сеното
            if (day % 2 == 0) {
                //сено = 5% от останалата храна
                double neededHay =0.05 * foodInGrams;
                hayInGrams -= neededHay;
            }

            //wseki rteti den -> smenq pokriwaloto
            if (day % 3 == 0) {
                //нужното покривало за смяна;
                double coverNeeded = pigWeightInGrams / 3;
                coverInGrams -= coverNeeded;
            }

            //проверка дали някой от консумативите е свършил
            if (foodInGrams <= 0 || hayInGrams <=0 || coverInGrams <=0 ){
                System.out.println("Merry must go to the pet store!");
                return; // прекратява цялата програма
            }



        }
        //проверка и 30-те дни

        System.out.printf("Everything is fine! Puppy is happy! Food: %.2f, Hay: %.2f, Cover: %.2f.",
                foodInGrams/1000,hayInGrams/1000,coverInGrams/1000);


    }
}
