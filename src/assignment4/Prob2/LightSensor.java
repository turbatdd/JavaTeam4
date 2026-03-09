package assignment4.Prob2;

import java.time.LocalDateTime;

public class LightSensor implements Sensor {
    private final double lightLevel;
    private final String location;
    private LocalDateTime lastUpdated;

    LightSensor(double lightLevel, String location) {
        if (lightLevel < 0) {
            throw new IllegalArgumentException("Light level is negative");
        }

        this.lightLevel = lightLevel;
        this.location = location;
    }

    @Override
    public String getSensorType() {
        return "Light Sensor";
    }

    @Override
    public double getReading() {
        return lightLevel;
    }

    @Override
    public String getLocation() {
        return location.toString();
    }

    @Override
    public LocalDateTime getLastUpdated() {
        lastUpdated = LocalDateTime.now();
        return lastUpdated;
    }

    @Override
    public String performAction() {
        if (lightLevel > 100)
            return "Light is sufficient";

        return "Light level is too low! Turning on the lights.";
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
