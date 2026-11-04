package designPattern.Structural.adapterPattern.payment;

public interface IPaymentProcessor {
    PaymentResult processPayment(PaymentRequest request);
}   
