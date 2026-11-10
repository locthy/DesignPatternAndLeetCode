package designPattern.Creational.abstractFactory.cloudProvider;

public class GCSCloudFactory implements  ICloudResourceFactory{
    @Override 
    public IFileStorageService createStorage() {
        return new GCSStorageService();
    }

    @Override 
    public INotificationService createNotification() {
        return new GCSNotificationService();
    }
}
