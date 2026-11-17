package designPattern.Creational.factoryMethod.transport;

public abstract class Application {
    protected abstract Transport createTransport();

    public void deliver(String packages) {
        Transport transport = createTransport();
        transport.delivery(packages);
    }
}
