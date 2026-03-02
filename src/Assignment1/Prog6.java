package Assignment1;

import java.util.Scanner;

public class Prog6 {
    void main() {
        Scanner sc = new Scanner(System.in);
        String yesOrNo = "Y";
        boolean isFinish = false;

        do {
            System.out.println("Enter user type (R/C/I): ");
            String userType = sc.next().toLowerCase();
            System.out.println("Enter units consumed");
            int consume = sc.nextInt();

            float result = switch (userType) {
                case "r" -> 0.12f * consume;
                case "c" -> 0.20f * consume;
                case "i" -> 0.35f * consume;

                default -> 0.0f;
            };

            String r = String.format("""
                    === Electricity Bill ===
                    User Type: %s
                    Units: %d
                    Bill Amount: $%.2f
                    Do you want to calculate another bill? (y/n): 
                    """, userType.toUpperCase(), consume, result);
            System.out.println(r);

            yesOrNo = sc.next().toLowerCase();

            if (yesOrNo.equals("n")) {
                System.out.println("Goodbye! Thanks for using the Electricity Bill Generator.");
                isFinish = true;
            }
        } while (!isFinish);
    }
}
