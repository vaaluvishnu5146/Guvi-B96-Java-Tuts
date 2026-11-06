package Exceptions;

class Account {
    private int balance;

    Account(int balance) {
        this.balance = balance;
    }

    private int getBalance() {
        return balance;
    }

    private void setBalance(int balance) {
        this.balance = balance;
    }


    int withdrawMoney (int amount) throws Exception {
        if (this.getBalance() < amount) {
            throw new Exception("Insufficient Balance");
        }
        this.setBalance(this.getBalance() - amount);
        return amount;
    }

    void depositMoney(int amount) throws InvalidDepositException {
        if(amount <= 0) {
            throw new InvalidDepositException("Invalid amount", amount);
        }
        this.setBalance(this.getBalance() + amount);
    }

    int getAvailableBalance() {
        return this.getBalance();
    }

}
