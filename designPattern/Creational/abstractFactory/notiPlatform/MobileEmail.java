package designPattern.Creational.abstractFactory.notiPlatform;

public class MobileEmail implements IEmail{
    @Override 
    public void sendEmail(String message) {
        System.out.println("Mobile email: " + message);
    }

}
