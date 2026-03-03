package Assignment4.Prob2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SoundSensor implements Sensor {
    private double soundlevel;
    private Location location;
    private LocalDateTime lastupdated;

    SoundSensor(double soundlevel, Location location) {
        this.soundlevel = soundlevel;
        this.location = location;
    }

    @Override
    public String getSensorType() {
        return "Sound Sensor";
    }

    @Override
    public double getReading() {
        return soundlevel;
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
        if (soundlevel > 70)
            return "Turn on noise cancellation";
        return "Sound level is within the normal range.";
    }

    @Override
    public String toString() {
        return String.format("""
                Sensor Type: %s
                Reading: %.1f
                Location: %s
                Last Updated: %s
                Action: %s
                """, getSensorType(), getReading(), getLocation(), getLastUpdated().format(dtf), performAction());
    }
}
