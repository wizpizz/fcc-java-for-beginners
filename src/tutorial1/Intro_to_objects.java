package tutorial1;
import java.util.Scanner;

public class Intro_to_objects {

    public static void main(String[] args) { // main is a method in the Main class
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        // sc.next();
        String h = "hello"; // h is an instance of the String object "hello"
        h.length(); // .length() is a method of the String object

        tim("Timmmmm!", 4); // triggers the tim() method to be executed

        System.out.println(add2(6));

        System.out.println(str("hi"));
    }

    public static void tim(String str, int x) { // void means that this method does not return a value
        // When calling tim(), a String object and an int object must be passed in as arguments
        for (int i=0;i<x;i++){
            System.out.println(str);
        }
    }

    public static int add2(int x) {
        return x + 2;
    }

    public static String str(String x) {
        return x + "!";
    }
}
