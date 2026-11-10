package designPattern.Creational.abstractFactory.notiPlatform;

public class WebEmail implements IEmail{


    public void sendEmail(String message) {
        System.out.println("Web email: " + message);
    }

}
