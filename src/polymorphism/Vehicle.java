package polymorphism;

public class Vehicle {

    private final String start;
    private final String stop;
    private final String speed;
    private final String direction;

    public Vehicle(String start, String stop, String speed, String direction) {
        this.start = start;
        this.stop = stop;
        this.speed = speed;
        this.direction = direction;
    }

    public void start(){
        System.out.println(start);
    }

    public void stop(){
        System.out.println(stop);
    }

    public void speed() {
        System.out.println(speed);
    }

    public void direction(){
        System.out.println(direction);
    }


}
