package designPattern.Structural.adapterPattern.Celsius;

public class KelvinAdapter implements ITemperature{
    private final Kelvin kelvin;

    public KelvinAdapter(Kelvin kelvin) {
        this.kelvin = kelvin;
    }

    public double getTemperature() {
        return kelvin.getTemperatureKelvin()-273.15;
    }
}
