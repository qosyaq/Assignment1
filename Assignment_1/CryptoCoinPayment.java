package Software_Design_Patterns.Assignment_1;

public class CryptoCoinPayment implements PaymentStrategy {
    String address;

    public CryptoCoinPayment(String address) {
        this.address = address;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Paid by MetaMsk");
    }
}
