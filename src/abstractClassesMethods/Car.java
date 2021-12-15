package abstractClassesMethods;

public class Car extends Vehicle{


    public Car() {
        super("Car Start", "Car Stop", "Car direction");
    }

    @Override
    void speed() {
        System.out.println("The speed of the car is 80 km/h");
    }

}
