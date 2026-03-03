package Assignment4.Prob2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public interface Sensor {
    public final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh:mm a");

    String getSensorType();

    double getReading();

    String getLocation();

    LocalDateTime getLastUpdated();

    String performAction();

    String toString();
}
