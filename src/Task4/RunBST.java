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
        IntBST binaryTree = new IntBST();
        binaryTree.add(1);
        binaryTree.add(10);
        binaryTree.add(15);
        binaryTree.add(20);
        binaryTree.add(5);
        binaryTree.add(6);
        binaryTree.add(2);
        System.out.println("Test"); // Was not able to run and test this code properly as I had some issues with
                                    // Java package handling in the end.
        System.out.println(binaryTree.contains(6));
        System.out.println(binaryTree.contains(100));
    }
}
