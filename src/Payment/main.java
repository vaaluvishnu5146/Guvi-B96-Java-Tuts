package Payment;

public class main {
    public static void main(String[] args) {
        AdvancedUPIPayment advancedUPIPayment = new AdvancedUPIPayment();
        advancedUPIPayment.pay();
        advancedUPIPayment.cancelPayment();
        advancedUPIPayment.test();
    }
}
