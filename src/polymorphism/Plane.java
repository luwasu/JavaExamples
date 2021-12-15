package polymorphism;

public class Plane extends Vehicle{

    public Plane() {
        // Notice we are passing our arguments into our superclass (Vehicle) constructor
        super("Plane start", "Plane stop", "Plane speed", "Plane direction");
    }

    public void heightMeasurement(){
        System.out.println("How high is the plane? Measurement ongoing.......");
    }
}
