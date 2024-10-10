package Lab_Week1;

import java.util.Deque;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListLab {
    public static void main(String[] args) {
        LinkedList<String> List1 = new LinkedList<>();
        List1.add("Kay");
        List1.add("Jay");
        List1.add("May");
        List1.add("Fay");
        // This sets up the basic linked list with the 4 names Kay, Jay, May, and Fay.
        addRay(List1); // Call to a function that adds "Ray" after the name "May"
        System.out.println(List1); // Print the list to the console
        RemoveJay(List1); // Call to a function that removes the name "Jay"
        System.out.println(List1); // Print the list to the console
    }

    public static void addRay(LinkedList<String> list) {
        ListIterator<String> it = list.listIterator(); // ListIterator to go through the list
        while (it.hasNext()) {
            String name = it.next(); // Get the next name in the list
            if (name.equals("May")) { // If the name is "May", add "Ray" after it
                it.add("Ray"); // Add "Ray" after "May"
            }
        }
    }

    public static void RemoveJay(LinkedList<String> list) {
        ListIterator<String> it = list.listIterator(); // ListIterator to go through the list
        while (it.hasNext()) {
            String name = it.next(); // Get the next name in the list
            if (name.equals("Jay")) { // If the name is "Jay", remove it
                it.remove(); // Remove "Jay"
            }
        }
    }

    public static void ListFromBeginning(LinkedList<String> list) {
        ListIterator<String> it = list.listIterator(); // ListIterator to go through the list
        while (it.hasNext()) {
            String name = it.next(); // Get the next name in the list
            System.out.println(name); // Print the name to the console
        }
    }

}