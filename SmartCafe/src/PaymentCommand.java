public class PaymentCommand implements Command {
    private final OrderSubject subject;
    private final Checkout checkout;
    private final int amount;
    private final int table;

    public PaymentCommand(OrderSubject subject, Checkout checkout, int amount, int table) {
        this.subject = subject;
        this.checkout = checkout;
        this.amount = amount;
        this.table = table;
    }

    @Override
    public void execute() {
        String result = checkout.processPayment(amount, table);
        subject.notifyAll(result);
    }
}