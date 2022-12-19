package dateprogram;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class DateClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            // String is of the format y-M-d or yyyy-MM-d
            System.out.println("Enter the date in yyyy-mm-dd : ");
            String string = "2021-08-14";

            // Using parse method to convert the string to LocalDate object
            LocalDate date = LocalDate.parse(string, DateTimeFormatter.ISO_DATE);
            checkEarlierDate(date);
            // Printing the date object
            System.out.println(date);
        } // If the String pattern is invalid
        catch (IllegalArgumentException e) {
            System.out.println("Exception: " + e);
        } // If the String was unable to be parsed.
        catch (DateTimeParseException e) {
            System.out.println("Exception: " + e);
        }
    }

    public static void checkEarlierDate(LocalDate date){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));
        if (date.equals(dtf.format(now))){
            System.out.println(date);
        }
    }

}
