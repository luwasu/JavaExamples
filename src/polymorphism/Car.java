package polymorphism;

public class Car extends Vehicle {


    public Car() {
        // Notice we are passing our arguments into our superclass (Vehicle) constructor
        super("Car start", "Car stop", "Car speed", "Car direction");
    }

    @Override
    public void speed() {
        System.out.println("This car is driving in in \"INSANE MODE\"!!!");
    }
}
