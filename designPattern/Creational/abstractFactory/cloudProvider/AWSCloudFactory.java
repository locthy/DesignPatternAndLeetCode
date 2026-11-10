package designPattern.Creational.abstractFactory.cloudProvider;

public class AWSCloudFactory implements ICloudResourceFactory {
    
    @Override 
    public IFileStorageService createStorage() {
        return new S3StorageService();
    }

    @Override 
    public INotificationService createNotification() {
        return new SNSNotificationService();
    }
}
