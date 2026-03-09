package assignment4.Prob2;

public class SensorTest {
    void main() {
        Sensor[] arr = {
                new LightSensor(100, "Garden"),
                new TemperatureSensor(32.5, "Living room"),
                new SoundSensor(50.0, "Bedroom"),
                new TemperatureSensor(38.0, "Kitchen"),
                new LightSensor(90.0, "Bedroom")
        };

        for (Sensor p : arr) {
            System.out.println(p);
        }
    }
}
