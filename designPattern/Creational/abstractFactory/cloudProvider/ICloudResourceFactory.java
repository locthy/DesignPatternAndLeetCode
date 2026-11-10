package designPattern.Creational.abstractFactory.cloudProvider;

public interface ICloudResourceFactory {
    IFileStorageService createStorage();
    INotificationService createNotification();
}
