/*
* Date: 2021-11-01.
* File Name: Days.Java
* Author: Rickard Marjanovic
*
*/

package Task2;

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * Class Description: A class to find the nth number of the fibonaci list
 *
 * @version 1, 2021-11-01
 * @author Rickard Marjanovic
 */

public class Fibonacci {

    public static void main(String[] args) throws Exception {
        try {
            Scanner reader = new Scanner(System.in);
            System.out.println("Enter which index you want from the Fibonacci numbers");
            int index = reader.nextInt();
            reader.close();
            if (index < 0)
                throw new InputMismatchException();

            System.out.println("The " + index + "th index of the Fibonnaci numbers is " + fib(index));

        } catch (InputMismatchException e) {
            System.out.println("Please only write positive numbers.");
        } catch (Exception e) {
            System.out.println("Some unexplained error has occured.");
        }
    }

    private static int fib(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }
}