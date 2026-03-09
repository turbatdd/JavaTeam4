package assignment2.Prob3;

import java.util.Scanner;

public class Prob3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean isFinish = false;

        while (!isFinish) {

            try {
                System.out.println("""
                        Enter F for Flight Booking
                        Enter H for Hotel Booking
                        Enter C for Car Rental
                        """);

                String menu = sc.nextLine().toLowerCase();

                do {

                    System.out.println("Your keyword is incorrect");
                    System.out.println("""
                            Enter F for Flight Booking
                            Enter H for Hotel Booking
                            Enter C for Car Rental
                            """);

                    menu = sc.nextLine().toLowerCase();
                } while (menu.isEmpty() && (!menu.toLowerCase().equals("f") || !menu.toLowerCase().equals("h") || !menu.toLowerCase().equals("c")));


                switch (menu) {
                    case "f":
                        System.out.println("Enter origin");
                        String origin = sc.nextLine();

                        System.out.println("Enter destination");
                        String dest = sc.nextLine();

                        System.out.println("Enter distance in km");
                        int distance = sc.nextInt();
                        sc.nextLine();

                        System.out.println("Enter average speed (km/h)");
                        int speed = sc.nextInt();
                        sc.nextLine();

                        Flight fl = new Flight(origin, dest, distance);
                        System.out.println(fl.toString(speed));

                        break;
                    case "h":
                        System.out.println("Enter hotel name");
                        String hotelName = sc.nextLine();

                        System.out.println("Enter number of nights");
                        int nights = sc.nextInt();
                        sc.nextLine();

                        System.out.println("Enter price per night");
                        int pricePer = sc.nextInt();
                        sc.nextLine();

                        Hotel hot = new Hotel(hotelName, nights, pricePer);
                        System.out.println(hot.toString());

                        break;
                    case "c":
                        System.out.println("Enter car model");
                        int carModel = sc.nextInt();
                        sc.nextLine();

                        System.out.println("Enter number of days");
                        int days = sc.nextInt();
                        sc.nextLine();

                        System.out.println("Enter rate per day");
                        int ratePerDay = sc.nextInt();
                        sc.nextLine();

                        System.out.println("Enter miles per day");
                        int milesPerDay = sc.nextInt();
                        sc.nextLine();

                        Car theCar = new Car(carModel, days, ratePerDay, milesPerDay);
                        System.out.println(theCar.toString());
                        break;
                    default:
                }

                System.out.println("Do you want to continue (y/n):\n");
                String yesOrNo = sc.nextLine().toLowerCase();

                if (yesOrNo.equals("n")) {
                    isFinish = true;
                    System.out.println("Thank you see you later");
                    break;
                }

                do {
                    System.out.println("Your keyword is incorrect");
                    System.out.println("Do you want to continue (y/n):\n");
                    yesOrNo = sc.nextLine().toLowerCase();
                } while (!yesOrNo.equals("y") && !yesOrNo.equals("n"));


            } catch (Exception e) {
                System.out.println(e.toString());
            }
        }

    }
}
