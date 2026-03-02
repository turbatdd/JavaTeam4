package Assignment2.Prob3;

public record Hotel(String hotelName, int nights, int pricePerNight) {
    @Override
    public String toString() {
        return String.format("""
                Enter hotel name: %s
                Enter number of nights: %d
                Enter price per night: %d
                Total Hotel Cost: %.2f
                """, this.hotelName, this.nights, this.pricePerNight, this.totalCost());
    }

    private double totalCost() {
        return this.nights * this.pricePerNight;
    }
}
