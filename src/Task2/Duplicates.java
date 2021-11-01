/*
* Date: 2021-11-01.
* File Name: Days.Java
* Author: Rickard Marjanovic
*
*/

package Task2;

import java.util.*;

/**
 * Class Description: A class to find out if a list has any duplicates
 *
 * @version 1, 2021-11-01
 * @author Rickard Marjanovic
 */

public class Duplicates {
    public static void main(String[] args) {
        ArrayList<String> test = new ArrayList<String>();
        test.add("a");
        test.add("b");
        test.add("c");
        System.out.println(hasDuplicates(test));
        test.add("a");
        System.out.println(hasDuplicates(test));
    }

    static public boolean hasDuplicates(ArrayList<String> list) {
        Set<String> distinctStrings = new HashSet<>(); // O(1)
        if (list.size() > 0) // O(1)
            for (int i = 0; i < list.size(); i++) { // O(n)
                distinctStrings.add(list.get(i)); // O(1)
                if (distinctStrings.size() != 1 + i) // O(1)
                    return true; // O(1)
            }
        return false; // O(1)
    }
}

// I'm using the properties of the hashset create an as effective time
// complexity as possible. Since Hashset doesn't allow any duplicate instances I
// figured that the current size of the hashset would differ from the original
// lists current index + 1 if there were any duplicates (e.g. hashset didn't add
// the duplicate value).

// Best case we find the duplicate on the first try giving us O(2) (we need to
// add one value to be able to compare the next). Worst case we need to iterate
// through the whole loop (e.g. if no duplicates were found), giving us the time
// complexity of O(n);