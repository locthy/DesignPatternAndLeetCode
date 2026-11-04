package designPattern.Structural.adapterPattern.payment;

public class Main {
    public static void main(String[] args) {
        PaymentRequest request = new PaymentRequest("1466", "VND", 124422.0);
        PaymentRequest paypalRequest = new PaymentRequest("121", "USD", 35466323.0);
        PaymentRequest stripeRequest = new PaymentRequest("3255", "Euro", 313322.0);
        MomoSDK momo = new MomoSDK();
        IPaymentProcessor paymentProcess = new MomoAdapter(momo);

        OrderService order = new OrderService();
        order.performProcess(paymentProcess, request);

        PayPalSDK paypal = new PayPalSDK();
        IPaymentProcessor paypalPayment = new PayPalAdapter(paypal);
        order.performProcess(paypalPayment, paypalRequest);

        StripeSDK stripe = new StripeSDK();
        IPaymentProcessor stripePayment = new StripeAdapter(stripe);
        order.performProcess(stripePayment, stripeRequest);
    }
}
