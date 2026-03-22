package q3;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Payment[] payments = {
                new UPI(),

                new Wallet()
        };

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount: ₹");
        double amount = sc.nextDouble();

        System.out.println("=== Payments ===");
        for (Payment p : payments) {
            p.pay(amount);
        }

        sc.close();
    }
}