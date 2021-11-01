/*
* Date: 2021-11-01.
* File Name: Days.Java
* Author: Rickard Marjanovic
*
*/

package Task4;

/**
 * Class Description: A class to test out the BST functionality
 *
 * @version 1, 2021-11-01
 * @author Rickard Marjanovic
 */

public class RunBST {
    public static void main(String[] args) throws Exception {
        IntBST tree = new IntBST();
        tree.add(1);
        tree.add(10);
        tree.add(15);
        tree.add(20);
        tree.add(5);
        tree.add(6);
        tree.add(2);
        System.out.println("Test");
        System.out.println(tree.contains(6));
        System.out.println(tree.contains(100));
    }
}
