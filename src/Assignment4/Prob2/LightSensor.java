package Assignment4.Prob2;

import java.time.LocalDateTime;

public class LightSensor implements Sensor {
    private double lightlevel;
    private Location location;
    private LocalDateTime lastupdated;

    LightSensor(double lightlevel, Location location) {
        if (lightlevel < 0) {
            throw new IllegalArgumentException("Light level is negative");
        }

        this.lightlevel = lightlevel;
        this.location = location;
    }

    @Override
    public String getSensorType() {
        return "Light Sensor";
    }

    @Override
    public double getReading() {
        return lightlevel;
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
        if (lightlevel > 100)
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
