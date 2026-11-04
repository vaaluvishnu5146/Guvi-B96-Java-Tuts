package Payment;

public class AdvancedUPIPayment extends UPIPayment {
    @Override
    public void pay() {
        super.pay();
        System.out.println("Paying with advanced UPI like BHIM UPI");
    }

    @Override
    public void cancelPayment() {
        super.cancelPayment();
        System.out.println("cancel BHIM UPI");
    }

    public void test() {
        System.out.println("Testing");
    }
}
