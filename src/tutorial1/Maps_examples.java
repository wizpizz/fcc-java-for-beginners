package tutorial1;
import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;

public class Maps_examples {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Map m = new HashMap();
        String str = "hello my name is tim and i am cool";

        for (char x:str.toCharArray()) {
            if (m.containsKey(x)) {
                int old = (int) m.get(x);
                m.put(x, old+1);
            }
            else {
                m.put(x, 1);
            }
        }
        m.remove(' ');

        System.out.println(m);


        int[] x = {-99, 5, 6, 3, 2, 1, 7, 8, 0};

        Arrays.sort(x, 1, 7); // Sorts in ascending order from index 1 to 7

        for (int i:x) {
            System.out.println(i + ",");
        }
    }
}
