package designPattern.Structural.adapterPattern.payment;

public class StripeAdapter implements IPaymentProcessor {
    private final StripeSDK stripe;

    public StripeAdapter(StripeSDK stripe) {
        this.stripe = stripe;
    }

    @Override 
    public PaymentResult processPayment(PaymentRequest request) {
        String orderId = request.getOrderId();
        String currency = request.getCurrency();
        long amount = (long)  request.getAmount();

        String message = stripe.createCharge(amount, currency);

        return new PaymentResult(true, orderId, message);
    }
}
