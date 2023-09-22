package testesjava;

public class TemperaturaCelsius {
    private double celsius;
    private double fahrenheit;

    public TemperaturaCelsius(double celsius) {
        this.celsius = celsius;
    }

    public double converteCelsiusParaFahrenheit() {
        fahrenheit = (celsius * 1.8) + 32;
        return fahrenheit;
    }
}