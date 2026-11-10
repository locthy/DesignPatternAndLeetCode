package designPattern.Creational.abstractFactory.notiPlatform;

public class MobileSMS implements ISMS {

    public void sendSMS(String message) {
        System.out.println("Mobile SMS: " + message);
    }

}
