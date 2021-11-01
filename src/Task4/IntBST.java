/*
* Date: 2021-11-01.
* File Name: Days.Java
* Author: Rickard Marjanovic
*
*/

package Task4;

/**
 * Class Description: A class to create a BST tree, as well as adding the
 * possibility to add new nodes to the BST as well to check if any node exists
 * or note.
 *
 * @version 1, 2021-11-01
 * @author Rickard Marjanovic
 */

public class IntBST {

    private BST root = null;

    public void add(int n) {
        if (root == null)
            root = new BST(n);
        else
            root.add(n);
    }

    public boolean contains(int n) {
        if (root == null)
            return false;
        else
            return root.contains(n);
    }

    private class BST {
        int value;
        BST left = null;
        BST right = null;

        BST(int val) {
            value = val;
        }

        void add(int n) {
            BST node = new BST(n); // I create the node that is supposed to be inserted
            BST previous = null; // I need to keep a flag of the previous node in order to be able to add to that
                                 // reference later

            // I'm starting from root but creating a temp value that I can traverse with new
            // values as I go along
            BST temp = root;

            // Comparing element to be inserted with the root node
            while (temp != null) {
                // If element to be inserted is less than the root node, I traverse left
                if (temp.value > n) {
                    previous = temp;
                    temp = temp.left;
                    // Otherwise I tranverse the right
                } else if (temp.value < n) {
                    previous = temp;
                    temp = temp.right;
                }
            }
            // When there are no more nodes to tranverse I insert the value into the
            // previous nodes tree, either left or right.
            if (previous.value > n)
                previous.left = node; // Adding to root through the reference handling i did above.
            else
                previous.right = node; // Adding to root through the reference handling i did above.
        }

        boolean contains(int n) {
            BST temp = root;
            // Traverse the tree while there are nodes
            while (temp != null) {
                // Check if the value is the same as the searched value
                if (temp.value == n)
                    return true;
                // If element to be searched for is less than the root node, I traverse left
                if (root.value > n)
                    temp = temp.left;
                // Otherwise I tranverse the right
                else if (temp.value < n)
                    temp = temp.right;
            }
            // When we have traversed the whole tree but not found a match we return false.
            return false;
        }
    }
}