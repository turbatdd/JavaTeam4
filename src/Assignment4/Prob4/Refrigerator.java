package Assignment4.Prob4;

public class Refrigerator implements ApplianceInterface {
    private int temperature;

    public Refrigerator(int temperature) {
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    @Override
    public void performFunction() {
        System.out.println("Cooling items at temperature: " + temperature + "°C.");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}
