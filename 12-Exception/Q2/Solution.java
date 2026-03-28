import java.util.Scanner;
import java.util.InputMismatchException;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception");
        } catch (InputMismatchException e) {
            System.out.println("Input Mismatch Exception");
        }

        sc.close();
    }
}