package HW_12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList();
        Scanner scanner = new Scanner(System.in);
        String str;
        do {
            str = scanner.nextLine().trim();
            if (!str.equals("break")) {
                list.add(str);
            }
        } while (!str.equals("break"));


        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("");

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).matches("^s.+")) {
                System.out.println(list.get(i));
            }

        }
        System.out.println("");

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).matches("^\\w{5,}"))
            System.out.println(list.get(i));
        }
    }
}
