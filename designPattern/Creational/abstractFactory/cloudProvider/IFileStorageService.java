package designPattern.Creational.abstractFactory.cloudProvider;

public interface IFileStorageService {
    public void uploadFile(String fileName, byte[] data);
}
