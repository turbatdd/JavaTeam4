package Assignment4.Prob2;

import java.time.LocalDateTime;

public class SensorTest {
    void main() {
        Sensor[] arr = {
                new LightSensor(100, Location.GARDEN),
                new TemperatureSensor(32.5, Location.LIVING_ROOM),
                new SoundSensor(50.0, Location.BEDROOM),
                new TemperatureSensor(38.0, Location.KITCHEN),
                new LightSensor(90.0, Location.BEDROOM)
        };

        for (Sensor p : arr) {
            System.out.println(p);
        }
    }
}
