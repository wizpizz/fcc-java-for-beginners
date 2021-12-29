package tutorial1;
import java.util.Scanner;

public class Nested_statements {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("Input your age: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int age = Integer.parseInt(s);

        if (age >= 18) {
            System.out.println("You are an adult!");
            System.out.println("Input your favorite food: ");
            String food = sc.nextLine();

            if (food.equals("pizza")) {
                System.out.println("Mine too");
            }
            else {
                System.out.println("Not mine");
            }
        }
        else if (age >= 13) {
            System.out.println("You are a teenager!");
        }
        else {
            System.out.println("You are neither a teenager nor an adult!");
        }
    }
}
