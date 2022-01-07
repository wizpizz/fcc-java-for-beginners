package tutorial1;

public class OuterClass {
    public class InnerClass { // A class within a class, only accessible within the outer class
        public void display() {
            System.out.println("This is an inner class");
        }
    }

    public void inner() {
        InnerClass in = new InnerClass();
        in.display();
    }

    public void inner2() {
        class InnerClass2 { // Create an inner class within a method
            public void display() { // Create the display method within the inner class
                System.out.println("Inner class");
            }
        }

        InnerClass2 in = new InnerClass2(); // When inner2 is called, the inner class is created
        in.display(); // Then the display method is called
    }
}
