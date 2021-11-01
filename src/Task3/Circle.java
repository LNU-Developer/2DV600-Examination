/*
* Date: 2021-11-01.
* File Name: Days.Java
* Author: Rickard Marjanovic
*
*/

package Task3;

/**
 * Class Description: A class to create and calculate circles area
 *
 * @version 1, 2021-11-01
 * @author Rickard Marjanovic
 */

public class Circle implements Shape {
    int r;

    public Circle(int radius) {
        if (radius < 0)
            r = 0;
        else
            r = radius;
    }

    public double getRadius() {
        return r;
    }

    public void setRadius(int radius) {
        if (radius < 0)
            r = 0;
        else
            r = radius;
    }

    public double area() {
        return r * r * Math.PI;
    }
}
