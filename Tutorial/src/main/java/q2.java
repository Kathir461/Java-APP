interface Payment {
    void pay(double amount);
}
class CreditCardPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Payment of Rs." + amount +
                " made using Credit Card.");
    }
}
class UPIPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Payment of Rs." + amount +
                " made using UPI.");
    }
}
class NetBankingPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Payment of Rs." + amount +
                " made using Net Banking.");
    }
}
public class q2 {
    public static void main(String[] args) {
        Payment payment;
        payment = new CreditCardPayment();
        payment.pay(1500.0);
        payment = new UPIPayment();
        payment.pay(750.0);
        payment = new NetBankingPayment();
        payment.pay(2000.0);
    }
}