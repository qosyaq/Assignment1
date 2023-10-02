package Software_Design_Patterns.Assignment_1;

public class creditCardPayment implements PaymentStrategy{
    String cardNum;
    String fullName;
    public creditCardPayment(String cardNum, String fullName){
        this.cardNum = cardNum;
        this.fullName = fullName;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Paid by CreditCard");
    }
}
