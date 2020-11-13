package HW_11.Task2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter valid email");
        Scanner scanner = new Scanner(System.in);
        Pattern pattern = Pattern.compile("@gmail.com");
        String str = scanner.nextLine();
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()){
            System.out.println(str);
        }else {
            System.out.println("Matcher don't find!");
        }
    }
}
