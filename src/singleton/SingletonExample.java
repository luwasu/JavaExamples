package singleton;


// https://www.javatpoint.com/singleton-design-pattern-in-java

/*
        SingletonEarlyInst Pattern is a pattern that ensures that there is only ever one single instance of a class.
        And it provides a global way to get to that instance. This class will prevent any other class
        to create more than one instance of the class.

        First step is to create a Java class with a private constructor. Now only code that lives in the
        singleton class will be able to call this private constructor. Then we have to add a private static
        variable unique, whose type is SingletonEarlyInst. Please see the code below.

        The second time we call getInstance, if that instance already exists, then we just return
        one which we already made, ensuring that there's only one instance. But this is not thread safe.

        There are two ways to make this class singleton:

        - Early Instantiation: creation of instance at load time.

        Create static instance at the start of the class and always return that instance from the getInstance method.
        The JVM will create the instance before any thread accesses the static variable.  Here the issue is we always
        create an instance,we're creating it early rather than lazily, even before invoking the getInstance method.

        - Lazy Instantiation: creation of instance when required.

        Second way is to make the getInstance class synchronized. This solution creates the SingletonEarlyInst lazily,
        like the classic SingletonEarlyInst does, so the object is created only if you really need it.
        Synchronization can cause poor performance; synchronized code takes a lot longer to run than
        un-synchronized code.
        And because get instance method is synchronized, every call to get instance will be more expensive.
*/

public class SingletonExample {

    public static void main(String[] args) {

        System.out.println("********Early Instantiation: creation of instance at load time.********");

        /*

            - Early Instantiation: creation of instance at load time.

        Create static instance at the start of the class and always return that instance from the getInstance method.
        The JVM will create the instance before any thread accesses the static variable.  Here the issue is we always
        create an instance,we're creating it early rather than lazily, even before invoking the getInstance method.

        */

        System.out.println(SingletonEarlyInst.getInstance());
        System.out.println(SingletonEarlyInst.getInstance().getDescription());


/*

            // un-comment to test this example
           // I am not able to create another instanceOf this class

          SingletonEarlyInst WontWork = new SingletonEarlyInst();

*/


        System.out.println("********Lazy Instantiation: creation of instance when required.********");


        /*

        - Lazy Instantiation: creation of instance when required.

        Second way is to make the getInstance class synchronized.
        This solution creates the SingletonEarlyInst lazily, like the classic SingletonEarlyInst does,
        so the object is created only if you really need it. Synchronization can cause poor performance;
        synchronized code takes a lot longer to run than un-synchronized code.
        And because get instance method is synchronized, every call to get instance will be more expensive.

        */

        System.out.println(SingletonLazyInst.getInstance());
        System.out.println(SingletonLazyInst.getInstance().getDescription());

/*
            // un-comment to test this example
           // I am not able to create another instanceOf this class

        SingletonLazyInst WontWork = new SingletonLazyInst();


*/


    }
}
