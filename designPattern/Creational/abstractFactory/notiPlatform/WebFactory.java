package designPattern.Creational.abstractFactory.notiPlatform;

public class WebFactory implements IPlatformFactory{

    public IEmail getEmail( ) {
        return new WebEmail();
    }

    public ISMS getSMS( ) {
        return new WebSMS();
    }
}
