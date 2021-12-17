package singleton;

public class SingletonEarlyInst {

    // create an instance of the class
    private static SingletonEarlyInst singletonEarlyInst = new SingletonEarlyInst();

    // set the constructor to private
    private SingletonEarlyInst() {
    }


    // return the instanceOf the Singleton
    public static SingletonEarlyInst getInstance() {
        return singletonEarlyInst;
    }

    // return the description
    public String getDescription() {
        return "Singleton Early class";
    }
}
