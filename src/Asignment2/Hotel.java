package Asignment2;

public final class Hotel {
//    Instance Fields: hotelName, nights, pricePerNight
//• Method: compute and return nights * pricePerNight

    private final String hotelName;
    private final int nights;
    private final int pricePerNight;

    public Hotel(String hotelName, int nights, int pricePerNight) {

        this.hotelName = hotelName;
        this.pricePerNight = pricePerNight;
        this.nights = nights;
    }

    public String getHotelName() {
        return hotelName;
    }

    public int getNights() {
        return nights;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }

    @Override
    public String toString() {
        return String.format("""
                Enter hotel name: %s
                Enter number of nights: %d
                Enter price per night: %d
                Total Hotel Cost: %.2f
                """, hotelName, nights, pricePerNight, totalCost());
    }

    public double totalCost() {
        return nights * pricePerNight;
    }
}
