package tutorial1;

public class Overloading_methods_and_comparing_objects {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Student joe = new Student("Joe");
        Student bill = new Student("Bill");
        Student tim = new Student("Tim");

        System.out.println(joe.equals(bill));

        System.out.println(joe.compareTo(bill));

        System.out.println(tim); // Returns the memory address of the object
    }
}
