package JavaCoreBasics.HW8;

import java.util.PrimitiveIterator;

public enum Month {
    JANUARY(Season.WINTER, 30), FEBRUARY(Season.WINTER, 29), MARCH(Season.SPRING, 31),
    APRIL(Season.SPRING, 30), MAY(Season.SPRING, 31), JUNE(Season.SUMMER, 30),
    JULY(Season.SUMMER, 31), AUGUST(Season.SUMMER, 30), SEPTEMBER(Season.AUTUMN, 31),
    OCTOBER(Season.AUTUMN, 31), NOVEMBER(Season.AUTUMN, 30), DECEMBER(Season.WINTER, 31);

    private int day;
    private Season season;

    Month(Season season, int day) {
        this.season = season;
        this.day = day;
    }

    public static boolean ifContains(String month) {
        for (Month c : Month.values()) {
            if (c.name().equals(month)) {
                return true;
            }
        }
        return false;
    }
    public static void ifHaveMaonth(String month){
        if (ifContains(month.toUpperCase())) {
            System.out.println(month + " have in enum Season");
        } else System.out.println(month + " dosn't have in enum Season");
    }

    public static void getMonthFromSeasons(String season) {
        for (Month c : Month.values()) {
            if (c.getSeason().toString().equals(season)) {
                System.out.println(c.name());
            }
        }
    }

    public static void getMonthFromEqualsDay(String month) {

        if (ifContains(month)) {
            for (Month c : Month.values()) {
                if (c.getDay() == (Month.valueOf(month).getDay())) {
                    System.out.println(c.name());
                }
            }
        } else System.out.println(" this month doesn't exist");

    }

    public static void minNumberFromDay() {
        int minNumber = 100;
        for (Month c : Month.values()) {
            if (minNumber > c.getDay()) {
                minNumber = c.getDay();
            }
        }
        for (Month c : Month.values()) {
            if (c.getDay() == minNumber)
                System.out.println(c.name());
        }
    }

    public static void maxNumberFromDay() {
        int minNumber = 0;
        for (Month c : Month.values()) {
            if (minNumber < c.getDay()) {
                minNumber = c.getDay();
            }
        }
        for (Month c : Month.values()) {
            if (c.getDay() == minNumber)
                System.out.println(c.name());
        }
    }

    public static void parityDay() {
        System.out.println(" ");
        System.out.println("Parity month:");
        for (Month c : Month.values()) {
            if (c.getDay() % 2 == 0) {
                System.out.print(c.name() + " ");
            }
        }
        System.out.println(" ");
        System.out.println("Doesn't parity month:");
        for (Month c : Month.values()) {
            if (c.getDay() % 2 != 0) {
                System.out.print(c.name() + " ");
            }
        }
    }

    public static void parityDay(String month) {
        if (ifContains(month)) {
            Month selectedMonth = Month.valueOf(month);
            if (selectedMonth.getDay() % 2 == 0) {
                System.out.print(selectedMonth.name() + " is parity");
            } else {
                System.out.print(selectedMonth.name() + " doesn't parity");
            }
        } else System.out.println(" this month doesn't exist");
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public Season getSeason() {
        return season;
    }

    public void setSeason(Season season) {
        this.season = season;
    }
}
