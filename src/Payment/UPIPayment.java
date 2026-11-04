package Payment;

public class UPIPayment implements Payment {
    @Override
    public void pay() {
        System.out.println("Paying with UPI");
    }

    public void cancelPayment() {
        System.out.println("Cancelling UPI payment");
    }
}
