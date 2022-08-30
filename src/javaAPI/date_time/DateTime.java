package javaAPI.date_time;

import java.time.LocalDate;                 // import the LocalDate class
import java.time.LocalDateTime;             // import the LocalDateTime class
import java.time.LocalTime;                 // import the LocalTime class
import java.time.format.DateTimeFormatter;  // import the DateTimeFormatter class

class DateTime {
    public static void main(String[] args){
        DateTime x = new DateTime();
        x.date();
        x.time();
        x.dateTime();
        System.out.println();
        x.format();
    }

    // Get current date
    private void date(){
        LocalDate localDate = LocalDate.now();
        System.out.println("current date:\t\t" + localDate);
    }

    // Get current time
    private void time(){
        LocalTime localTime = LocalTime.now();
        System.out.println("current time:\t\t" + localTime);
    }

    // Get current date & time
    private void dateTime(){
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("current date&time:\t" + localDateTime);
    }

    // Format current date & time
    private void format(){
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("Before formatting:\t" + localDateTime);

        // change the date and time to a specified format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String formattedDate = localDateTime.format(formatter);
        System.out.println("After formatting:\t" + formattedDate);

        // ofPattern() method from DateTimeFormatter class
        // Display the date and time in different formats:
            // yyyy-MM-dd           "1988-09-29"
            // dd/MM/yyyy           "29/09/1988"
            // dd-MMM-yyyy       	"29-Sep-1988"
            // E, MMM dd yyy        "Thu, Sep 29 1988"
    }
}
