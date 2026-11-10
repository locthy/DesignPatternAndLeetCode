package designPattern.Creational.abstractFactory.cloudProvider;

public class GCSNotificationService implements INotificationService{
    public void sendNotification(String message) {
        System.out.println("GCS Notification: " + message);
    }
}
