package Banking;

public class Account {
    private String customerName;

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerDOB() {
        return customerDOB;
    }

    public void setCustomerDOB(String customerDOB) {
        this.customerDOB = customerDOB;
    }

    public String getCustomerPostalCode() {
        return customerPostalCode;
    }

    public void setCustomerPostalCode(String customerPostalCode) {
        this.customerPostalCode = customerPostalCode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getBalance() {
        return balance;
    }

    private void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    private String customerEmail;
    private String customerDOB;
    private String customerPostalCode;
    private String phoneNumber;
    private double balance;
    private boolean isActive;

    public Account(String customerName, String customerEmail, String customerDOB, String customerPostalCode, String phoneNumber, double balance, boolean isActive) {
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerDOB = customerDOB;
        this.customerPostalCode = customerPostalCode;
        this.phoneNumber = phoneNumber;
        this.balance = balance;
        this.isActive = isActive;
    }

    public double withdrawMoney(double amount) {
        if (amount <= this.balance) {
            this.setBalance(this.balance -= amount);
        }
        return this.balance;
    }

    public void depositMoney(double amount) {
        this.balance += amount;
    }

}
