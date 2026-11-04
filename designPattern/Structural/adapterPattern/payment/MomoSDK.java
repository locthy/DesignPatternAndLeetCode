package designPattern.Structural.adapterPattern.payment;

public class MomoSDK {

    public boolean pay(String orderId, long amountVND) {

        System.out.println("Processing payment via Momo...");
        System.out.println(
            "Momo processing: " + amountVND + " VND"
        );
        return true;
    }
}