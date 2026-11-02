public class CashPayment implements PaymentStrategy {
    public CashPayment(){}

    public String pay(int amount, int table) {
        return "Customer want to pay " + amount + " with Cash (table " + table + ")";
    }
}
