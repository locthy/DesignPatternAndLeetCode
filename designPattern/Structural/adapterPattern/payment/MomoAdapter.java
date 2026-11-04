package designPattern.Structural.adapterPattern.payment;

import java.math.BigDecimal;

public class MomoAdapter implements IPaymentProcessor{
    private final MomoSDK momSDK;

    public MomoAdapter(MomoSDK momoSDK) {
        this.momSDK = momoSDK;
    }
    @Override 
    public PaymentResult processPayment(PaymentRequest request) {
        String orderId = request.getOrderId();
        String currency = request.getCurrency();
        long amount =  (long) request.getAmount();

        boolean result = momSDK.pay(orderId, amount);
        return new PaymentResult(result, orderId, "");
    }
}
