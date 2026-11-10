package designPattern.Creational.abstractFactory.notiPlatform;

public interface IPlatformFactory {
    IEmail getEmail();
    ISMS getSMS();
}
