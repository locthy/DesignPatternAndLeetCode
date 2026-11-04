package designPattern.Structural.adapterPattern.payment;

public class PayPalAdapter implements IPaymentProcessor{
    private final PayPalSDK paypal;

    public PayPalAdapter(PayPalSDK paypal) {
        this.paypal = paypal;
    }

    @Override
    public PaymentResult processPayment(PaymentRequest request) {
        String orderId = request.getOrderId();
        String currency = request.getCurrency();
        double amount =   request.getAmount();

        String message = paypal.makePayment(amount, currency);

        return new PaymentResult(true, orderId, message);
    }
}
