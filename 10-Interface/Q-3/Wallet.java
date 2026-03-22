package q3;

public class Wallet implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Wallet: Deducted ₹" + amount);
    }
}