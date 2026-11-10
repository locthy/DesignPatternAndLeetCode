package designPattern.Creational.abstractFactory.cloudProvider;

public class S3StorageService implements IFileStorageService{
    @Override 
    public void uploadFile(String fileName, byte[] data) {
        System.out.println("AWS S3 Storage : " + fileName + " " + data);
    }
}
