package designPattern.Creational.abstractFactory.notiPlatform;

public class WebSMS implements ISMS {

    public void sendSMS(String message) {
        System.out.println("Web SMS: " + message);
    }

}

