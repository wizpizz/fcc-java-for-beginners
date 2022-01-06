package tutorial1;

public class Creating_classes {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Dog tim = new Dog("tim", 4);
        tim.speak();
        Dog bill = new Dog("bill", 7);
        bill.speak();
        Dog bob = new Dog("bob", 11);
        bob.speak();

        tim.speak(); // Still prints data from tim since we can have multiple instances of the same class
        System.out.println(tim.getAge());
        tim.setAge(10);

    }
}
