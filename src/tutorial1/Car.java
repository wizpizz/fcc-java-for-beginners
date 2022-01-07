package tutorial1;

public class Car implements Vehicle {

    private int gear = 1;
    private int speed = 0;

    // After implementing the interface, we need to implement the methods
    public void changeGear(int gear) {
        this.gear = gear;
    }

    public void speedUp(int change) {
        this.speed += change;
    }

    public void slowDown(int change) {
        this.speed -= change;
    }

    public void display() {
        System.out.println("I am a car, goin " + this.speed + "km/h and I am in gear " + this.gear);
        out(); // Since default methods do not need to be implemented, we can call them from here
    }
}
