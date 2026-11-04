package designPattern.Structural.adapterPattern.payment;

public class PaymentResult {
    private boolean success;
    private String transactionId;
    private String message;

    public PaymentResult(boolean success, String transactionId, String message) {
        this.success = success;
        this.transactionId = transactionId;
        this.message = message;
    }

    public boolean getSuccess() {
        return success;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public String getMessage() {
        return message;
    }

    @Override 
    public String toString() {
        String result = "";
        if(success) {
            result = "success";
        } else {
            result = "failed";
        }
        return "Transaction id: " + transactionId + " " + result + " " + message;
    }
}
