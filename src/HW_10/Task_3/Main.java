package HW_10.Task_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter words (in English):");
        Scanner scanner = new Scanner(System.in);
        Scanner scanN = new Scanner(System.in);
        List<String> str = new ArrayList<>();
        int n = 1;
        do {
            str.add(scanner.nextLine());
            System.out.println("Do you write same word again? " +
                    "\n Так-1" +
                    "\n Ні-0");
           n = scanN.nextInt();
        } while (n != 0);

        for (int i = 0; i < str.size(); i++) {
            if (str.get(i).startsWith("a") && str.get(i).length() % 2 == 0)
                System.out.println(str.get(i));
        }
    }
}
