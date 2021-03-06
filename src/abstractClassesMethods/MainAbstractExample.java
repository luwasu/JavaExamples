package abstractClassesMethods;

/* An abstract class has the following key characteristics:

     - It defines the behavior for each of the subclasses, but we cannot directly instantiate the abstract class itself.

     - It allows us to create abstract methods.
        - An abstract method is a method that does not contain an implementation body. Instead, it simply provides a header for the method.
        - Subclasses that extend an abstract class are required to override all abstract methods and provide a specific implementation.


      Abstract class

        - Can have class variables.
        - Can have both abstract methods and concrete methods that are shared with the subclasses.
        - Can have instance variables, i.e. variables that are specific to individual subclasses.
        - Subclasses can only extend one class.

 */

public class MainAbstractExample {

    public static void main(String[] args) {
        Car car = new Car();

        System.out.println(car);
        car.speed();

        // Vehicle' is abstract; cannot be instantiated
       // Vehicle vehicle = new Vehicle();   // will generate an error
    }
}
