public class Checkout {
    private PaymentStrategy strategy;

    public Checkout(PaymentStrategy paymentStrategy) {
        strategy = paymentStrategy;
    }

    public void setStrategy(PaymentStrategy paymentStrategy) {
        strategy = paymentStrategy;
    }

    public String processPayment(int amount, int table) {
        return strategy.pay(amount, table);
    }
}
