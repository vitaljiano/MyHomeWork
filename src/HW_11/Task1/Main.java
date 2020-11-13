package HW_11.Task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter word");
        Scanner scanner = new Scanner(System.in);
        String str;
        String[] result = new String[5];
        boolean matches = false;
        int j = 0;
        while (result[4] == null) {
            str = scanner.nextLine();
            matches = str.matches("^a.+");
            if (matches) {
                result[j] = str;
                j++;
            }
        }
        for (int k = 0; k < result.length; k++) {
            System.out.println(result[k]);
        }


    }
}
