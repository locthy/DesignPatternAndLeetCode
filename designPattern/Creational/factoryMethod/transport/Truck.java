package designPattern.Creational.factoryMethod.transport;

public class Truck implements Transport {

    public void delivery(String packages) {
        System.out.println("Truck delivery: " + packages);
    }
}
