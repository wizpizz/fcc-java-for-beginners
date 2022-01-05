package tutorial1;
import java.util.Map;
import java.util.TreeMap;

public class Practices {
    public static void main(String[] args) {
        maps();
    }

    static void maps() {
        String str = "The quick brown fox jumps over the lazy dog";
        str = str.toLowerCase().replaceAll("\\s", "");
        Map<Character, Integer> chars = new TreeMap<>(); // TreeMap because it sorts alphabetically
        for (int i = 0; i < str.length(); i++) {
            chars.put(str.toLowerCase().charAt(i), 0);
        }

        for (int i = 0; i < str.length(); i++) {
            chars.put(str.toLowerCase().charAt(i), chars.get(str.toLowerCase().charAt(i)) + 1);
        }

        System.out.println(chars);
    }
}