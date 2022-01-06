package tutorial1;

public class Dog {

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
}
