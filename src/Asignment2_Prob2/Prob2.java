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
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your event name");
        String name = sc.next();

        System.out.println("Enter your event Date /Eg.2002-01-22/");
        String date = sc.next();

        System.out.println("Enter your event Time /Eg.01:33/");
        String dateTime = sc.next();
        String dateStr = date + "T" + dateTime + "Z";

        dateStr = "2026-05-02T03:40";

        LocalDate rawDate = LocalDate.parse(dateStr, dtf);


        LocalDate theDate = LocalDate.parse(dateStr, dtf);
        Period pr = Period.between(LocalDate.now(), theDate);

        System.out.println("Day of Week: " + theDate.getDayOfWeek());
        System.out.println("Is Leap Year: " + theDate.isLeapYear());
        System.out.println("Event date and now Date: " + pr.getYears() + " years, " + pr.getMonths() + " months, " + pr.getDays() + " days");

        ZoneId currentZone = ZoneId.systemDefault();
        System.out.println("Your current timezone: " + currentZone.toString());
        System.out.println("Select Your zone by Index\n" + Arrays.toString(sampleZone));

        int zoneIndex = sc.nextInt();

        DateTimeFormatter dtfNice = DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy @ HH:mm [VV]");


//        String formatted = theDate.atZone(sampleZone[zoneIndex]).format(dtfNice);

//        System.out.println(formatted);


    }

}
