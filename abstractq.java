import java.util.Scanner;

abstract class Payment {
    public abstract void pay(double amount);
}

class CreditCard extends Payment {
    public void pay(double amount) {
        System.out.println("Payment of ₹" + amount + " done via Credit Card.");
    }
}
class UPI extends Payment {
    public void pay(double amount) {
        System.out.println("Payment of ₹" + amount + " done via UPI.");
    }
}

public class abstractq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String method = sc.nextLine().trim().toLowerCase();

        double amount = sc.nextDouble();

        Payment payment;

        if (method.equals("credit")) {
            payment = new CreditCard();
        } else if (method.equals("upi")) {
            payment = new UPI();
        } else {
            System.out.println("Invalid payment method.");
            sc.close();
            return;
        }

        payment.pay(amount);

        sc.close();
    }
}
