package interfaces;

public class Car implements Vehicle, Production {

    private final String type;
    private final String speed;
    private final String color;
    private final String location;

    public Car(String type, String speed, String color, String location) {
        super();
        this.type = type;
        this.speed = speed;
        this.color = color;
        this.location = location;
    }



    // This is from the Vehicle Interface
    @Override
    public String getType() {
        return type;
    }

    @Override
    public String getSpeed() {
        return speed;
    }

    @Override
    public String getColor() {
        return color;
    }

    // This is from the Production Interface
    @Override
    public String ProductionLocation() {
        return location;
    }

    @Override
    public String toString() {
        return "Car{" +
                " Type='" + type + '\'' +
                ", Speed='" + speed + '\'' +
                ", Color='" + color + '\'' +
                ", Production Location='" + location + '\'' +
                '}';
    }
}
