package designPattern.Creational.factoryMethod.transport;

public class Ship implements Transport {
    public void delivery(String packages) {
        System.out.println("Ship deliver: " + packages);
    }
}
