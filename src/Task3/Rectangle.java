/*
* Date: 2021-11-01.
* File Name: Days.Java
* Author: Rickard Marjanovic
*
*/

package Task3;

/**
 * Class Description: A class to create and calculate a reactangles area
 *
 * @version 1, 2021-11-01
 * @author Rickard Marjanovic
 */
public class Rectangle implements Shape {
    int w;
    int h;

    public Rectangle(int height, int width) {
        if (height < 0)
            h = 0;
        else
            h = height;

        if (width < 0)
            w = 0;
        else
            w = width;
    }

    public double getHeight() {
        return h;
    }

    public double getWidth() {
        return w;
    }

    public void setHeight(int height) {
        if (height < 0)
            h = 0;
        else
            h = height;
    }

    public void setWidth(int width) {
        if (width < 0)
            w = 0;
        else
            w = width;
    }

    public double area() {
        return h * w;
    }

}
