package Payment;

public class CashPayment implements Payment {
    @Override
    public void pay() {
        System.out.println("Paying with cash");
    }
}
