package designPattern.Creational.abstractFactory.cloudProvider;

public class SNSNotificationService implements INotificationService{
    @Override 
    public void sendNotification(String message) {
        System.out.println("AWS SNS: " + message);
    }
}
