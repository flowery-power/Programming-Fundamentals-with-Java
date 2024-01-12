import java.util.Scanner;

public class ExperienceGaining {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double experiance = Double.parseDouble(scanner.nextLine());
        int countBattles = Integer.parseInt(scanner.nextLine());
        double totalExperience = 0;


        for (int i = 1; i <= countBattles; i++) {
            double experianceEarnedPerBattle = Double.parseDouble(scanner.nextLine());


            if (i % 3 == 0) {
                experianceEarnedPerBattle += 0.15 * experianceEarnedPerBattle;
            }
            if (i % 5 == 0) {
                experianceEarnedPerBattle -= 0.1 * experianceEarnedPerBattle;
            }
            if (i % 15 == 0) {
                experianceEarnedPerBattle += 0.05 * experianceEarnedPerBattle;
            }


            totalExperience += experianceEarnedPerBattle;


            if (totalExperience >= experiance) {
                System.out.printf("Player successfully collected his needed experience for %d battles.",
                        i);
                return;
            }

        }

        double needed = experiance - totalExperience;
        System.out.printf("Player was not able to collect the needed experience %.2f more needed.", needed);


    }


}