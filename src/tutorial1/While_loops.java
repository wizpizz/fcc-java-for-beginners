package tutorial1;
import java.util.Scanner;

public class While_loops {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("Type a number: ");
        int x = sc.nextInt();

        int count = 0;
        while (x!=10) {
            System.out.println("Type 10...");
            System.out.println("Type a number: ");
            x = sc.nextInt();
            count++;
        }
        System.out.println("You tried " + count + " times");

        do { // Do this until x is 10
            System.out.println("Type a number: ");
            x = sc.nextInt();
        }
        while (x!=10);
    }
}
