package assignment4.Prob4;

public class ApplianceTest {
    public static void main(String[] args) {
        ApplianceInterface[] appliances = {
                new WashingMachine(7),
                new Refrigerator(4),
                new Microwave(800)
        };

        for (ApplianceInterface app : appliances) {
            System.out.println(app);
            app.performFunction();
        }
    }
}
