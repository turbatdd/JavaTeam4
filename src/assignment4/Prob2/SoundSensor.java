package assignment4.Prob2;

import java.time.LocalDateTime;

public class SoundSensor implements Sensor {
    private final double soundLevel;
    private final String location;
    private LocalDateTime lastUpdated;

    SoundSensor(double soundLevel, String location) {
        if (soundLevel < 0) {
            throw new IllegalArgumentException("Sound level is negative");
        }

        this.soundLevel = soundLevel;
        this.location = location;
    }

    @Override
    public String getSensorType() {
        return "Sound Sensor";
    }

    @Override
    public double getReading() {
        return soundLevel;
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
        if (soundLevel > 70)
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
                """, getSensorType(), getReading(), getLocation(), getLastUpdated().format(DATE_FORMAT1), performAction());
    }
}
