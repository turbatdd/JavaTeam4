package Asignment3_Prob3;

public final class Flight {
    //    origin, destination, distanceKm
    private final String origin;
    private final String destination;
    private final double distanceKm;

    public Flight(String origin, String destination, double distanceKm) {
        this.origin = origin;
        this.destination = destination;
        this.distanceKm = distanceKm;
    }

    public String getOrigin() {
        return origin;
    }

    public String getDestination() {
        return destination;
    }

    public double getDistanceKm() {
        return distanceKm;
    }

    public String toString(int speed) {
        return String.format("""
                Your origin: %s
                Your destination: %s
                Your distance in km: %s
                Your average speed: %d
                Estimated Flight Time: %.2f hours
                """, origin, distanceKm, distanceKm, speed, this.computeFlightTime(speed));
    }


    public double computeFlightTime(double avgSpeed) {
        return this.distanceKm / avgSpeed;
    }
}
