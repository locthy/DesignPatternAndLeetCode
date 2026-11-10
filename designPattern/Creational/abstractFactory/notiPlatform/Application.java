package designPattern.Creational.abstractFactory.notiPlatform;

public class Application {  
    private final IEmail email;
    private final ISMS sms;

    public Application(IPlatformFactory platformFactory) {
        this.email = platformFactory.getEmail();
        this.sms = platformFactory.getSMS();
    }

    public void sendEmail(String message) {
        email.sendEmail(message);
    }

    public void sendSMS(String message) {
        sms.sendSMS(message);
    }
}
