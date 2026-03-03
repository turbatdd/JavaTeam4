package Assignment4.Prob2;

import java.time.LocalDateTime;

public class TemperatureSensor implements Sensor {
    private double temperature;
    private Location location;
    private LocalDateTime lastupdated;

    TemperatureSensor(double temperature, Location location) {
        this.temperature = temperature;
        this.location = location;
    }

    @Override
    public String getSensorType() {
        return "Temperature Sensor";
    }

    @Override
    public double getReading() {
        return temperature;
    }

    @Override
    public String getLocation() {
        return location.toString();
    }

    @Override
    public LocalDateTime getLastUpdated() {
        lastupdated = LocalDateTime.now();
        return lastupdated;
    }

    @Override
    public String performAction() {
        if (temperature > 30)
            return "Turn on the Heater.";
        return "Temperature is within the normal range.";
    }

    @Override
    public String toString() {
        return String.format("""
                Sensor Type: %s
                Reading: %.1f
                Location: %s
                Last Updated: %s
                Action: %s
                """, getSensorType(), getReading(), getLocation(), getLastUpdated().format(DATE_FORMAT1), performAction());
    }
}
