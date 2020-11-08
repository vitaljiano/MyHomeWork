package JavaCoreBasics.HW8;

public enum Season {
    SPRING, SUMMER, AUTUMN, WINTER;

    public static boolean ifContainsSeasons(String season) {
        for (Season c : Season.values()) {
            if (c.name().equals(season)) {
                return true;
            }
        }
        return false;
    }

    public static void nextSeason(String season) {

        if (ifContainsSeasons(season)) {

            Season obSeson = Season.valueOf(season);
            Season[] arr = Season.values();
            int next = 0;
            int before = 0;
            if (obSeson.ordinal() + 1 > arr.length - 1 && obSeson.ordinal() - 1 > 0) {
                next = 0;
                before = obSeson.ordinal() - 1;
            } else if (obSeson.ordinal() + 1 > 0 && obSeson.ordinal() - 1 < 0) {
                next = obSeson.ordinal() + 1;
                before = arr.length - 1;
            } else {
                next = obSeson.ordinal() + 1;
                before = obSeson.ordinal() - 1;
            }
            System.out.println(" ");
            System.out.println("Next season: " + arr[next]);
            System.out.println("Before season: " + arr[before]);
        } else {
            System.out.println("this season doesn't exist");
        }
    }
}

