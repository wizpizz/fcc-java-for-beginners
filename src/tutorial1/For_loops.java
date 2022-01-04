package tutorial1;
import java.util.Scanner;

public class For_loops {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int x = 0;

        int[] arr = {1,5,7,3,4,5};

        for (int i=0;i<=10;i++) { // Starts at 0, as long as i is less than or equal to 10, increment i by 1
            System.out.println(i); // Prints i if the condition above is true
        }

        for (int i=0;i<arr.length;i++) { // As long as i is less than or equal to the length of the array, increment i by 1
            // arr[6] // Crashes because the array is not big enough
            if (arr[i] == 5) { // If the value at index i is equal to 5, print the value at index i
                System.out.println("Found a 5 at index " + i);
            }
        }
        String[] names = new String[5];

        int count = 0; // Keeps track of the index of the element in the array
        for (int element:arr) { // For each element in the array
            System.out.println(element + " " + count);
            count++;
        }

        Scanner sc = new Scanner(System.in);
        for (int i=0;i<names.length;i++) {
            System.out.println("Input: ");
            String input = sc.nextLine();
            names[i] = input;
        }

        for (String n:names) {
            System.out.println(n);
            if (n.equals("tim")) {
                break;
            }
        }
    }
}
