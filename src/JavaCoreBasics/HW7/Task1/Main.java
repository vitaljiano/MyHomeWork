package JavaCoreBasics.HW7.Task1;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your many in deposit");
        int m = scanner.nextInt();
        System.out.println("Enter interest rate from Bank");
        float n = scanner.nextFloat();
        System.out.println("Enter max number year for deposit");
        int k = scanner.nextInt();

        System.out.println("Your contribution is equal to " + ((m*n)/100*k));
    }
}
