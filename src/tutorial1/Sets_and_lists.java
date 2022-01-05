package tutorial1;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.LinkedHashSet;
import java.util.ArrayList;
import java.util.LinkedList;

public class Sets_and_lists {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Set<Integer> t = new HashSet<Integer>();
        /*
        What is the difference between HashSet, TreeSet and LinkedHashSet?
        HashSet is a collection of unique elements.
        TreeSet is a collection of elements in sorted order.
        LinkedHashSet is a collection of elements in the order of insertion.
         */
        t.add(5);
        t.add(7);
        t.add(5);
        t.add(9);
        t.add(-8); // -8 will show before 9

        boolean x = t.contains(0); // check if contains 0

        t.remove(9);
        // t.clear(); // clear all elements
        boolean y = t.isEmpty(); // check if empty
        int z = t.size(); // return size

        System.out.println(t);
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        ArrayList<Integer> a = new ArrayList<Integer>();
        /*
        ArrayList is a dynamic array.
        It can grow and shrink as needed.
        It is slower than an array.
         */
        /*
        What is the difference between ArrayList and LinkedList?
        ArrayList uses a dynamic array.
        LinkedList uses a doubly linked list.
        ArrayList is slower since array manipulation is slower.
        LinkedList is faster being node based.
         */
        a.add(1);
        a.add(2);
        a.add(1);
        a.add(2);
        a.add(1);
        a.add(2);
        a.get(0); // get element at index 0
        a.set(1, 5); // replaces the element at index 1 with 5
        a.subList(1, 3); // get elements within a certain range

        System.out.println(a.subList(1, 3));
    }
}
