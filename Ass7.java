/*
 Write a Java Program to find difference in two dates
 */
package ass7;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Ass7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Start Date (dd/mm/yyyy): ");
        String sDate1 = sc.next();
        System.out.println("Enter Second Date (dd/mm/yyyy): ");
        String sDate2 = sc.next();
        Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);
        Date date2 = new SimpleDateFormat("dd/MM/yyyy").parse(sDate2);
        long diffInMillies = Math.abs(date1.getTime() - date2.getTime());
        long diffInDaysTotal = (diffInMillies / (1000 * 60 * 60 * 24));

        long diffInDays = (diffInDaysTotal % 360) % 30;
        long diffInMonths = (diffInDaysTotal % 360) / 30;
        long diffInYears = (diffInDaysTotal / 360);

        System.out.println("Difference in Dates =\t" + diffInYears + " years" + "   " + diffInMonths + " months" + "   " + diffInDays + " days");
    }

}
