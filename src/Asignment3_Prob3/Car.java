package Asignment3_Prob3;

public class Car {

    private final int carModel;
    private final int days;
    private final int ratePerDay;
    private final int milesPerDay;

    public int getCarModel() {
        return carModel;
    }

    public int getDays() {
        return days;
    }

    public int getRatePerDay() {
        return ratePerDay;
    }

    public int getMilesPerDay() {
        return milesPerDay;
    }

    public Car(int carModel, int days, int ratePerDay, int milesPerDay) {
        this.carModel = carModel;
        this.days = days;
        this.ratePerDay = ratePerDay;
        this.milesPerDay = milesPerDay;
    }

    public double totalRentalCost() {
        return days * ratePerDay;
    }

    public double totalMilesAllowed() {
        return days * milesPerDay;
    }

    @Override
    public String toString() {
        return String.format("""
                Enter car model: %d
                Enter number of days: %d
                Enter rate per day: %d
                Enter miles per day: %d
                Total Rental Cost: %.2f
                Total Miles Allowed: %.2f
                """, this.carModel, this.days, this.ratePerDay, this.milesPerDay, this.totalRentalCost(), this.totalMilesAllowed());
    }
}
