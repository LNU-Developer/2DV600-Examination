/*
* Date: 2021-11-01.
* File Name: Days.Java
* Author: Rickard Marjanovic
*
*/
package Task1;

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * Class Description: A class to convert days from numbers to string, as well as
 * calculate future days when provided on base number and one future number
 *
 * @version 1, 2021-11-01
 * @author Rickard Marjanovic
 */

public class Days {

    private static String[] weekDays = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };

    public static void main(String[] args) throws Exception {
        try {
            Scanner reader = new Scanner(System.in);
            System.out.println("Enter today’s day: ");

            int today;
            boolean continueWithInput = true;
            do {
                today = reader.nextInt();
                if (today < 1 || today > 7) {
                    System.out.println("Invalid Input, please enter again");
                } else {
                    continueWithInput = false;
                }
            } while (continueWithInput);

            System.out.println("Enter the number of days after today for a future day: ");
            int future;
            continueWithInput = true;
            do {
                future = reader.nextInt();
                if (future < 0) {
                    System.out.println("Invalid Input, please enter again");
                } else {
                    continueWithInput = false;
                }
            } while (continueWithInput);
            reader.close();
            System.out.println("Today is " + getWeekdayString(today) + " and the future day is "
                    + getWeekdayString(calculateFutureDay(today, future)));

        } catch (InputMismatchException e) {
            System.out.println("Please only write numbers.");
        } catch (Exception e) {
            System.out.println("Some unexplained error has occured.");
        }
    }

    private static String getWeekdayString(int weekday) {
        return weekDays[weekday - 1];
    }

    private static int calculateFutureDay(int today, int future) {
        int sum = today + future;
        while (sum > 7) {
            sum = sum - 7;
        }
        return sum;
    }
}
