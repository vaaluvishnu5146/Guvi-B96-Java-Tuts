package Exceptions;

public class main {
    public static void main(String[] args) {
        Account vishnu = new Account(1000);

        // Get available balace
        System.out.println(vishnu.getAvailableBalance());

        // 2 Time Deposit
        try {
            // Deposit
            vishnu.depositMoney(500);
            System.out.println("After deposit = " + vishnu.getAvailableBalance());

            // 2nd negative deposit
            vishnu.depositMoney(-500);
            System.out.println("After 2nd deposit = " + vishnu.getAvailableBalance());
        } catch (InvalidDepositException e) {
            System.out.println("InvalidDepositException: " + e.getMessage() + " Amount: " + e.amount);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
