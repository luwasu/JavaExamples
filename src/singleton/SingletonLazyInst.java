package singleton;

public class SingletonLazyInst {

    // create an instance of the class
    private static SingletonLazyInst singletonLazyInst;

    // set the constructor to private
    private SingletonLazyInst() {
    }


    // return the instanceOf the Singleton
    public static synchronized SingletonLazyInst getInstance() {
        if (singletonLazyInst == null) {
            singletonLazyInst = new SingletonLazyInst();
        }
        return singletonLazyInst;
    }

    // return the description
    public String getDescription() {
        return "Singleton Lazy class";
    }
}
