package tutorial1;
import java.util.Scanner;

public class If_else_elseif {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        if (s.equals("tim")) { // use .equals() to compare strings
            System.out.println("You typed tim");
        }
        else if (s.equals("hello")) {
            System.out.println("Hi!");
        }
        else if (s.equals("hi")) {
            System.out.println("Hello!");
        }
        else {
            System.out.println("Print");
        }


    }
}
