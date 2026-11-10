package designPattern.Creational.abstractFactory.notiPlatform;

public class Main {
    public static void main(String[] args) {
        String platformType = "Mobile";
        String message = "I did it!!";
        IPlatformFactory platformFactory;

        if("Web".equals(platformType)) {
            platformFactory = new WebFactory();
        } else if("Mobile".equals(platformType)) {
            platformFactory = new MobileFactory();
        } else {
            return;
        }

        Application app = new Application(platformFactory);
        app.sendEmail(message);
        app.sendSMS(message);

    }
}
