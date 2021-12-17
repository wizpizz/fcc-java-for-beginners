package tutorial1;

public class Basic_operators {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int a; // printing this variable will give an error, because it is not initialized
        int b;
        b = 6; // printing this would be fine, because it is already declared and initialized

        int c = 5;
        int d = 7;
        int e = 57;
        int sum = c + (d - e * b); // instead of writing the numbers, we can write the variables
        // order of operations is important, in this case multiplication comes before subtraction
        // if an operation has multiplecation and division, it will be calculated from left to right
        // you can also use brackets to change the order of operations
        /*
         * + is the addition operator
         * - is the subtraction operator
         * * is the multiplication operator
         */

        int u = e / d; // can't give us a floating point number, because integers are whole numbers
        double v = e / d; // this still won't give us a floating point number, the operands are still integers
        double w = e / (double) d; // this will give us a floating point number, because the one of the operands is now double
        // double e = 57 // you can also use the double keyword to declare a variable as a floating point number
        // when one of them is a double, everything is going to be a double

        double f = Math.pow(c, d); // this will give us the power of c to d
        // Math.pow is double, so if we want to use the int keyword, we have to cast it
        int g = (int) Math.pow(c, d); // this will give us the power of c to d, but it will be an int

        double h = 7;
        int i = e / (int) h; // because h is a double, the result will be a double, so we have to cast h to an int

        System.out.println(sum);
        System.out.println(u);
        System.out.println(v);
        System.out.println(w);
        System.out.println(f);
        System.out.println(g);
        System.out.println(i);
    }

}
