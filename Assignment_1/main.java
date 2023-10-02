package Software_Design_Patterns.Assignment_1;

public class main {
    public static void main(String[] args) {
        Product product1 = new Product("T-shirt", 12.99, 3);
        Product product2 = new Product("Shirt", 9.99, 1);

        ShoppingCart cart = new ShoppingCart();
        cart.addProduct(product1);
        cart.addProduct(product2);

        System.out.println("Cart Total: $" + cart.calculateTotalPrice());

        PaymentStrategy creditCardPayment = new creditCardPayment("1234-5678-9012-3456", "John Doe");
        PaymentStrategy CryptoCoinPayment = new CryptoCoinPayment("QRTGBN1476NMJLP765");


        cart.setPaymentStrategy(creditCardPayment);

        cart.checkout();
    }
}
