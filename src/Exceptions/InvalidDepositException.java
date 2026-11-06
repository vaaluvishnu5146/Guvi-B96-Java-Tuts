package Exceptions;

public class InvalidDepositException extends RuntimeException {
    int amount;
    public InvalidDepositException(String message, int amount) {
        super(message);
        this.amount = amount;
    }
}
