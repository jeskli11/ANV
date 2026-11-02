public class CreditCardPayment implements PaymentStrategy {
    public CreditCardPayment(){}

    public String pay(int amount, int table) {
        return "Customer want to pay " + amount + " using Credit Card (table " + table + ")";
    }
}
