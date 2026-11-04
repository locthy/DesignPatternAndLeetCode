package designPattern.Structural.adapterPattern.Celsius;

public class LocalCelsius implements ITemperature {
    
    @Override 
    public double getTemperature() {
        // System.out.println("Return: " + temperature + " Celsius degree");
        return 25.0;
    }
}
