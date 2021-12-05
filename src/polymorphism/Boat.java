package polymorphism;

public class Boat extends Vehicle{

    public Boat() {
        // Notice we are passing our arguments into our superclass (Vehicle) constructor
        super("Boat start", "Boat stop", "Boat speed", "Boat direction");
    }

    public void depthMeasuring() {
        System.out.println("How deep is the water? Measuring ongoing........");
    }
}
