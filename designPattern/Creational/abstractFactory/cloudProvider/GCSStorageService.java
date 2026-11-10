package designPattern.Creational.abstractFactory.cloudProvider;

public class GCSStorageService implements IFileStorageService{
    @Override 
    public void uploadFile(String fileName, byte[] data) {
        System.out.println("GCS Storage: " + fileName + " " + data);
    }
}
