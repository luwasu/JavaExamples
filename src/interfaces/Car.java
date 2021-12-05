package interfaces;

public class Car implements Vehicle, Production {

    private final String type;
    private final String speed;
    private final String color;

    public Car(String type, String speed, String color) {
        super();
        this.type = type;
        this.speed = speed;
        this.color = color;
    }

    // This is from the Vehicle Interface

    @Override
    public String getType() {
        return null;
    }

    @Override
    public String getSpeed() {
        return null;
    }

    @Override
    public String getColor() {
        return null;
    }

    // This is from the Production Interface

    @Override
    public String location() {
        return null;
    }
}
