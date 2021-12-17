package tutorial1;
import java.util.Scanner;

public class Input_and_scanners {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int x = 56 % 5; // modulus operator gives the remainder = remainder of 11 is 1
        Scanner sc = new Scanner(System.in); // Scanner is a data type
        String scanned = sc.next(); // next() method scans the next input
        /*
        int scanned = sc.nextInt() method scans the next input as an integer
        boolean scanned = sc.nextBoolean() method scans the next input as a boolean
        double scanned = sc.nextDouble() method scans the next input as a double

        String is recommended for input, as it is more flexible
        Later, you can convert the input to the desired data type

        int x = scanned // cannot convert String to integer
         */
        int y = Integer.parseInt(scanned); // can successfully convert String to int
        System.out.println(y); // still gives and error if the input is not an integer
    }

}
