package Asignment2.Prob3;

public record Flight(String origin, String destination, int distanceKm) {
    //    origin, destination, distanceKm

    private double computeFlightTime(double avgSpeed) {
        return this.distanceKm / avgSpeed;
    }

    public String toString(int speed) {
        return String.format("""
                Your origin: %s
                Your destination: %d
                Your distance in km: %d
                Your average speed: %d
                Estimated Flight Time: %.2f hours
                """, this.origin, this.distanceKm, this.distanceKm, speed, this.computeFlightTime(speed));
    }
}
