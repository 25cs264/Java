class Payment {
    void makePayment(double amount) {
        System.out.println("Payment Amount: Rs." + amount);
    }
    void makePayment(double amount, String method) {
        System.out.println("Payment Amount: Rs." + amount);
        System.out.println("Payment Method: " + method);
    }
    void makePayment(double amount, String method, String receiver) {
        System.out.println("Payment Amount: Rs." + amount);
        System.out.println("Payment Method: " + method);
        System.out.println("Receiver: " + receiver);
    }
}
class UPIPayment extends Payment {
    @Override
    void makePayment(double amount) {
        System.out.println("UPI Payment Successful");
        System.out.println("Payment Amount: Rs." + amount);
    }
}
public class Exp_5 {
    public static void main(String[] args) {
        UPIPayment upi = new UPIPayment();
        System.out.println("----- Method Overloading -----");
        upi.makePayment(1000.0);
        System.out.println();
        upi.makePayment(1500.0, "UPI");
        System.out.println();
        upi.makePayment(2000.0, "UPI", "Rahul");
        System.out.println("\n----- Method Overriding -----");
        Payment payment = new UPIPayment();
        payment.makePayment(2500.0);
    }
}
