package designPattern.Structural.adapterPattern.payment;

public class StripeSDK {

    public String createCharge(long amountInCents, String currency) {

        System.out.println("Processing payment via Stripe...");
        System.out.println(
            "Stripe processing: " + amountInCents + " " + currency
        );
        return "STRIPE-" + System.currentTimeMillis();
    }
}