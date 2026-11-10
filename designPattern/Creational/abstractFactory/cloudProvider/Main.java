package designPattern.Creational.abstractFactory.cloudProvider;

public class Main {
    public static void main(String[] args) {
        String cloudProvider = "GCS";
        ICloudResourceFactory cloudResource;

        if("AWS".equals(cloudProvider)) {
            cloudResource = new AWSCloudFactory();
        } else {
            cloudResource = new GCSCloudFactory();
        }

        Application app = new Application(cloudResource);

        byte[] test = {7, 8, 5, 8, 99};
        app.uploadFile("TopGod1st.txt", test);

        app.sendNotification("Gui thong bao den cho ban");
    }
}
