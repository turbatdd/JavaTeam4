package Assignment4.Prob4;

public class WashingMachine implements ApplianceInterface {
    private final int loadCapacity;

    public WashingMachine(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void performFunction() {
        System.out.println("Starting wash cycle with load capacity: " + loadCapacity + " kg.");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}
