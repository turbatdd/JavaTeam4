package assignment4.Prob2;

import java.time.LocalDateTime;

public class TemperatureSensor implements Sensor {
    private final double temperature;
    private final String location;
    private LocalDateTime lastUpdated;

    TemperatureSensor(double temperature, String location) {
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
        return location;
    }

    @Override
    public LocalDateTime getLastUpdated() {
        lastUpdated = LocalDateTime.now();
        return lastUpdated;
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
