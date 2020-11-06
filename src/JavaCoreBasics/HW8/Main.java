package JavaCoreBasics.HW8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the month");
        Scanner scanner = new Scanner(System.in);
        String enterMonth = scanner.nextLine().toUpperCase();
        System.out.println("Enter season");
        String enterSeason = scanner.nextLine().toUpperCase();

        System.out.println("Verify if exist month ");
        Month.ifHaveMaonth(enterMonth);

        System.out.println("Selected months of equals days ");
        Month.getMonthFromEqualsDay(enterMonth);
        System.out.println(" Min  days of months");
        Month.minNumberFromDay();
        System.out.println("Max days of months");
        Month.maxNumberFromDay();
        System.out.println("Verify month by parity of days ");
        Month.parityDay(enterMonth);
        Month.parityDay();

        Season.nextSeason(enterSeason);
        System.out.println("Selected months of season");
        Month.getMonthFromSeasons(enterSeason);

    }

}

