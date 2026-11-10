package designPattern.Structural.adapterPattern.payment;

import java.math.BigDecimal;

public class OrderService {

    public void performProcess(IPaymentProcessor paymentProcess, PaymentRequest request) {
        System.out.println("-----------------------------------------------");
        
        System.out.println("Process payment ....");
        
        System.out.println(paymentProcess.processPayment(request));

        

    }
}
