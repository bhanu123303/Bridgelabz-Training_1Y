package q3;

public class UPI implements Payment {
    public void pay(double amount) {
        System.out.println("UPI: Paid ₹" + amount);
    }
}