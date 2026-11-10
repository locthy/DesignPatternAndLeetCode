package designPattern.Creational.abstractFactory.cloudProvider;

public class Application {
    private final IFileStorageService fileStorageService;
    private final INotificationService notificationService;

    public Application(ICloudResourceFactory cloudResourceFactory) {
        this.fileStorageService = cloudResourceFactory.createStorage();
        this.notificationService = cloudResourceFactory.createNotification();
    }

    public void sendNotification(String message) {
        notificationService.sendNotification(message);
    }

    public void uploadFile(String fileName, byte[] data) {
        fileStorageService.uploadFile(fileName, data);
    }
}
