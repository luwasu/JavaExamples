package abstractClassesMethods;


// the keyword abstract is used to make a class abstract
public abstract class Vehicle {

    private final String start;
    private final String stop;
    private final String direction;

    public Vehicle(String start, String stop, String direction) {
        this.start = start;
        this.stop = stop;
        this.direction = direction;
    }

    // the keyword abstract is used to make a method abstract
    // There is no method implementation. This needs to be done by the inheriting class.

    abstract void speed();

    @Override
    public String toString() {
        return    "start = " + start + ", stop = " + stop + ", direction = " + direction;
    }
}
