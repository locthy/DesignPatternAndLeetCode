package designPattern.Structural.adapterPattern.Celsius;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n========== FAHRENHEIT SENSOR ==========");
        TemperatureMonitor monitor = new TemperatureMonitor();

        Farenheit censor = new Farenheit();
        ITemperature adapter = new FarenheitAdapter(censor);
        
        monitor.displayTemperature(adapter);

        System.out.println("\n========== Kelvin SENSOR ==========");
        Kelvin kelvinCensor = new Kelvin();

        ITemperature kelvinAdapter = new KelvinAdapter(kelvinCensor);
        monitor.displayTemperature(kelvinAdapter);
    }
}
