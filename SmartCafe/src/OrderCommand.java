public class OrderCommand implements Command {
    private final OrderSubject subject;
    private final String order;

    public OrderCommand(OrderSubject subject, String order) {
        this.subject = subject;
        this.order = order;
    }

    @Override
    public void execute() {
        subject.notifyAll(order);
    }
}