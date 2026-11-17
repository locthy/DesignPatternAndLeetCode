package designPattern.Creational.factoryMethod.transport;

public class Main {
    public static void main(String[] args) {
        String packages = "Mai Thi";
        Application app = new ShipApplication();
        app.deliver(packages);

        app = new TruckApplication();
        app.deliver("Thien Loc");
    }
}
