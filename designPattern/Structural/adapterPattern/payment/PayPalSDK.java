package designPattern.Structural.adapterPattern.payment;

public class PayPalSDK {

    public String makePayment(double amount, String currency) {

        System.out.println("Processing payment via PayPal...");
        System.out.println(
            "PayPal processing: " + amount + " " + currency
        );

        return "PAYPAL-" + System.currentTimeMillis();
    }
}
