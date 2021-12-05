package interfaces;/*
        Interfaces allow us to avoid hardcoding features in an application.
        We can move specific implementation details into subclasses, and then use an interface to communicate between
        the application and the subclasses.

       - Can have class variables.
       - Every method in an interface is abstract.
       - Cannot have instance variables. Variables in an interface must be the same for every class implementing the interface.
       - Classes can implement more than one interface and have multiple inheritance.
       -  support decoupling and allow us to avoid hardcoding features in an application.

        When to Use an Interface?

        We use an interface when:

        - We expect unrelated classes will be implementing our interface.
        - We want to support multiple inheritance.
        - We want to specify the behavior for a data type, but we do not care about the implementation.



 */

public class MainInterfaceExample {
    public static void main(String[] args) {

    }
}
