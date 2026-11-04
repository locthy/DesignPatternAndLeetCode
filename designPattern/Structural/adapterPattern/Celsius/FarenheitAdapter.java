package designPattern.Structural.adapterPattern.Celsius;

public class FarenheitAdapter implements ITemperature{
    private final Farenheit farenheit;

    public FarenheitAdapter(Farenheit farenheit) {
        this.farenheit = farenheit;
    }

    public double getTemperature() {
        return (farenheit.getTemperatureFerenheit()-32)*5/9;
    }
}
