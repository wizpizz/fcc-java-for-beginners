package tutorial1;

public class Dog {

    /*
    static means that the variable is shared by all instances of the class
    */

    protected static int count = 0; //

    protected String name;
    protected int age;

    /*
    public: accessible from everywhere
    private: accessible only from the class
    protected: accessible from the class and subclasses like Cat
     */

    /*
    Constructor method to initialize the name and age
    Constructor has to have the same name as the class it is in
     */
    public Dog(String name, int age) {
        // Assign the passed in values to the instance variables
        this.name = name;
        this.age = age;
        Dog.count += 1; // count must be referenced by the class name since it is static
        Dog.display();
        this.display2(); // this. can be used here since it is a non-static method
    }

    public void speak() {
        System.out.println("I am " + this.name + " and I am " + this.age + " years old");
    }

    public int getAge() { // Since age is a private variable, we need to make getAge() method to access it from outside
        return this.age;
    }

    public void setAge(int age) { // Setter method to set the age
        this.age = age;
    }

    private int add2() { // Only accessible to this class
        return this.age + 2;
    }

    public void display2() {
        System.out.println("I am a dog!");
    }

    public static void display() {
        System.out.println("I am a dog!");
        // this. cannot be used here since it is a static method. The method does not know what instance it is called on
    }
}
