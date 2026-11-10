package designPattern.Creational.abstractFactory.notiPlatform;

public class MobileFactory implements IPlatformFactory{
    public IEmail getEmail() {
        return new MobileEmail();
    }

    public ISMS getSMS() {
        return new MobileSMS();
    }
}
