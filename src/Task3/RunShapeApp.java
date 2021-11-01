/*
* Date: 2021-11-01.
* File Name: Days.Java
* Author: Rickard Marjanovic
*
*/

package Task3;

/**
 * Class Description: A class to test out the functionality of the circle &
 * recangle class
 *
 * @version 1, 2021-11-01
 * @author Rickard Marjanovic
 */

public class RunShapeApp {
    public static void main(String[] args) {
        Circle c = new Circle(4); // Radius of 4
        Rectangle r = new Rectangle(4, 3); // Height = 4, Width = 3
        ShowArea(c);
        ShowArea(r);
    }

    public static void ShowArea(Shape s) {
        double area = s.area();
        System.out.println("The area of the shape is " + area);
    }

}
