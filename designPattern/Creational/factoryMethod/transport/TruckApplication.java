package designPattern.Creational.factoryMethod.transport;

public class TruckApplication extends Application {
    @Override
    protected Transport createTransport() {
        return new Truck();
    }
}
