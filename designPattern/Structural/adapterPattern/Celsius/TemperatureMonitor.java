package designPattern.Structural.adapterPattern.Celsius;

public class TemperatureMonitor {
    public void displayTemperature(ITemperature censor) {
        double temperature = censor.getTemperature();
        System.out.printf("Temperature: %.2f °C%n", temperature);
    }
}
