package assignment4.Prob4;

public class Microwave implements ApplianceInterface {
    private final int powerLevel;

    public Microwave(int powerLevel) {
        this.powerLevel = powerLevel;
    }

    @Override
    public void performFunction() {
        System.out.println("Heating food at power level: " + powerLevel + ".");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}
