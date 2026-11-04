package designPattern.Structural.adapterPattern.payment;


public class PaymentRequest {
    private String orderId;
    private String currency;
    private double amount;

    public PaymentRequest(String orderId, String currency, double amount) {
        this.orderId = orderId;
        this.currency = currency;
        this.amount = amount;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getCurrency() {
        return currency;
    }

    public double getAmount() {
        return amount;
    }
}
