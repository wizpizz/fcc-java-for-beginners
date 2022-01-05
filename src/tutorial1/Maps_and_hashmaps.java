package tutorial1;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.LinkedHashMap;

public class Maps_and_hashmaps {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Map m = new HashMap();
        /*
        What is the difference between HashMap, TreeMap and LinkedHashMap?
        HashMap is a hash table, which is a data structure that stores key-value pairs.
        TreeMap is a red-black tree, which is a data structure that stores key-value pairs in alsorted order.
        LinkedHashMap is a hash table, which is a data structure that stores key-value pairs in the order in which they were inserted.
        HashMap is faster than TreeMap since it doesn't need to sort the data.
        TreeMap is slower than HashMap since it needs to sort the data.
        TreeMat is more flexible than HashMap, but all the elements in the TreeMap must be of the same type.
        LinkedHashMap is similar to TreeMap, but it stores the keys in the order in which they were inserted.
         */
        m.put("tim", 5);
        m.put("joe", "x");
        m.put(11, 999);
        m.put(11, 998); // overwrites the previous value
        m.containsValue("x"); // checks if the value is in the map
        m.containsKey(11); // checks if the key is in the map
        m.get(5); // doesn't crash but returns null because 5 is a value not a key
        m.values(); // returns a collection of values in no particular order
        m.clear(); // removes all the elements from the map

        System.out.println(m);

        Map m2 = new TreeMap();
        m2.put("tim", 5);
        m2.put("joe", "x");
        m2.put("a", "b");

        System.out.println(m2);
    }
}
