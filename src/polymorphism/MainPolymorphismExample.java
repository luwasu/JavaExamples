package polymorphism;

public class MainPolymorphismExample {
    public static void main(String[] args) {


        System.out.println("******************************** Example 1************************");
        Vehicle[] vehicles = new Vehicle[3];

        // The Car.speed method has been overridden and does not use the default from Vehicle
        vehicles[0] = new Car();

        // these classes are vehicles and a plane, boat
        vehicles[1] = new Plane();
        vehicles[2] = new Boat();


        for (Vehicle v : vehicles) {
            v.speed();
        }

        System.out.println("******************************** Example 2************************");


        Plane plane = new Plane();
        Vehicle vehicle = new Plane();


        // This will work because the Plane class knows the heightMeasurement() method
        plane.heightMeasurement();

        // This will not work because the Vehicle class does not know the eightMeasurement() method
      //  vehicles.heightMeasurement();

        System.out.println("******************************** Example 3************************");

        // This is the same as Example 1 but without polymorphism
        Car car = new Car();
        Boat boat = new Boat();
        Plane plane1 = new Plane();

        // You cannot add them to an array and iterate other them because the Object class does not know the individual methods within the class

        car.speed();
        boat.speed();
        plane1.speed();

        Object[] obj = new Object[3];

        obj[0] = car;
        obj[1] = boat;
        obj[2] = plane1;

        for (Object o: obj) {
      //    o.speed();            // this will not work because Object does not know the individual classes
        }



    }
}
