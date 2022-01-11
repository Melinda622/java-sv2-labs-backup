package exceptionclass.bank;

public class InvalidAccountNumberBankOperationException extends InvalidBankOperationException{

    private String accountNumber;

    public InvalidAccountNumberBankOperationException(String message) {
        super(message);
    }

    public InvalidAccountNumberBankOperationException(String message, Throwable cause, String accountNumber) {
        super(message, cause);
        this.accountNumber = accountNumber;
    }

    public InvalidAccountNumberBankOperationException(String message, Throwable cause) {
        super(message, cause);
    }
}
