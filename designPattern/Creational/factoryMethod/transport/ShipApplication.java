package designPattern.Creational.factoryMethod.transport;

public class ShipApplication extends Application {
    @Override
    protected Transport createTransport() {
        return new Ship();
    }
}
