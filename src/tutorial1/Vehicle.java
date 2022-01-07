package tutorial1;

public interface Vehicle { // An instance of an interface cannot be created. They are meant to be inherited by other classes.

    final int gears = 5; // Final means that the value cannot be changed.

    // Declaring methods
    void changeGear(int a);
    void speedUp(int a);
    void slowDown(int a);

    default void out() { // Default methods are not required to be implemented in the child classes.
        System.out.println("Default method");
    }

    static int math(int b) { // Static function in an interface, which aren't required to be implemented either.
        return b + 9;
    }
}
