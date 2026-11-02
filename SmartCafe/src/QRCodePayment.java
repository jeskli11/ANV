public class QRCodePayment implements PaymentStrategy{
    public QRCodePayment(){}

    public String pay(int amount, int table) {
        return "Customer want to pay " + amount + " using QR Code (table " + table + ")";
    }
}
