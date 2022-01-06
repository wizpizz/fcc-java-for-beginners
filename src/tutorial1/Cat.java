package tutorial1;

public class Cat extends Dog { // Dog is a superclass of Cat. Cat is a subclass of Dog.

    private int food; // We can also add other private variables.

    public Cat(String name, int age, int food) {
        super(name, age); // super() is a constructor of the superclass. It inherits the name and age from the superclass.
        this.food = food;
    }

    public Cat(String name, int age) { // another constructor to make the Cat class available with only name and age.
        super(name, age);
        this.food = 50;
    }

    public Cat(String name) {
        super(name, 0); // Set the age to 0 since it is not passed in
        this.food = 50;
    }

    public void speak() { // Overriding speak() method from the superclass.
        System.out.println("Meow my name is " + this.name + " and I get fed " + this.food);
    }

    public void eat(int x) { // There is hierarchy, eat() is only available to Cat.
        this.food -= x;
    }
}
