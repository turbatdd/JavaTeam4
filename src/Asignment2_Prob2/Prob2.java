package Asignment2_Prob2;

import java.text.DateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Prob2 {

    void main() {
        String[] sampleZone = {"America/Panama", "America/Chicago", "America/Indiana/Indianapolis", "America/Santiago", "America/Phoenix"};
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm");
        DateTimeFormatter dtfNice = DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy @ HH:mm [VV]");


        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter your event name");
            String name = sc.nextLine();

            System.out.println("Enter your event Date /Eg.2002-01-22/");
            String date = sc.nextLine();

            System.out.println("Enter your event Time /Eg.01:33/");
            String dateTime = sc.nextLine();
            String dateStr = date + "T" + dateTime;

//        dateStr = "2026-05-02T03:40";

            LocalDateTime localDateTime = LocalDateTime.parse(dateStr, dtf);
            LocalDate theDate = localDateTime.toLocalDate();
            Period pr = Period.between(LocalDate.now(), theDate);

            ZoneId currentZone = ZoneId.systemDefault();
            ZonedDateTime zonedDate = localDateTime.atZone(currentZone);
            ZonedDateTime curZonedDate = LocalDateTime.now().atZone(currentZone);

            String strDateReport = getDateReport(name, currentZone.toString(), zonedDate.format(dtfNice), theDate.getDayOfWeek().toString(), theDate.isLeapYear(), curZonedDate.format(dtfNice), pr.getYears(), pr.getMonths(), pr.getDays());

            System.out.println(strDateReport);

            boolean isFinish = false;

            do {
                System.out.println("Do you want to change timezone Y/N ?");
                String yesOrNo = sc.next().toLowerCase();

                if (yesOrNo.equals("y")) {
                    for (int i = 0; i < sampleZone.length; i++) {
                        System.out.println("\n" + (i + 1) + ". " + sampleZone[i]);
                    }
                    System.out.println("Please enter your zone number");
                    int zoneIndex = sc.nextInt();

                    System.out.println("Your selected timezone is: " + sampleZone[zoneIndex - 1]);

                    ZoneId selectedZone = ZoneId.of(sampleZone[zoneIndex - 1]);
                    ZonedDateTime converted = zonedDate.withZoneSameInstant(selectedZone);

                    System.out.println("Selected timezone is: " + selectedZone);
                    System.out.println("Selected timezone Date is: " + converted.format(dtfNice));
                } else {
                    isFinish = true;
                    System.out.println("Thank you see you later");

                    break;
                }
            } while (!isFinish);
        } catch (Exception e) {
            System.out.println("Datetime is incorrect.");
        }


    }

    public String getDateReport(String name, String timeZone, String date, String dayOfWeek, boolean isLeap, String nowDate, int difYears, int difMonths, int difDays) {
        return String.format("""
                Event name: %s
                Your current timezone: %s
                Your event date: %s
                Day of week: %s
                Is leap year: %s
                Now date: %s
                Now date and event date difference: %d-Years %d-Months %d-Days
                """, name, timeZone, date, dayOfWeek, isLeap, nowDate, difYears, difMonths, difDays);

    }

}
