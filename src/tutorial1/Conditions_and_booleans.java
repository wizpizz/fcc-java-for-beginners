package tutorial1;

public class Conditions_and_booleans {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int x = 6;
        int y = 7;
        int z = 10;
        String a = "hello";
        String b = "hellO";
        // > < == >= <= != && || // Explain the difference between these operators
        /*
         * > greater than
         * < less than
         * == equal to
         * use .equals() to compare strings
         * >= greater than or equal to
         * <= less than or equal to
         * != not equal to // returns true if the values are not equal
         * && logical and // returns true if both expressions are true
         * || logical or // returns true if either expression is true
         * ! logical not // returns true if the expression is false
         */
        boolean compare = x >= y;
        // boolean compare = a != x; // String cannot be compared to int
        boolean compare2 = a == b; // returns false, because capitalization matters
        boolean compare3 = x > y && y < z; // returns false, because bth expressions need to be true
        boolean compare4 = x > y || y < z; // returns true, because either expression is true
        boolean compare5 = !(false); // returns false, because logical not returns the opposite of the expression
        boolean compare6 = !(x < y && y > z) || (2 == 5 || x + 7 > y); // long chain of logical operators is possible

        System.out.println(compare);
        System.out.println(compare2);
        System.out.println(compare3);
        System.out.println(compare4);
        System.out.println(compare5);
        System.out.println(compare6);
    }

}
