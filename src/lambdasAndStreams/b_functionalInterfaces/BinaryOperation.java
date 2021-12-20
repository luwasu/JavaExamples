package lambdasAndStreams.b_functionalInterfaces;


/*
        Functional Interfaces

        In the previous section, I mentioned that only certain kinds of interfaces can be implemented by lambdas.
        Those interfaces are called functional interfaces.

        A functional interface is a Java interface with exactly one abstract method, called the functional method.

        The @FunctionalInterface annotation at the top serves two important purposes:

        - If that annotation is added to any interface that is not a valid functional interface, the Java compiler
          will report a compilation error.

        - It tells whoever is reading the code that this is interface is designed to be used with lambdas.

        That's why if you intend for an interface to be functional, you should always add the
        @FunctionalInterface annotation.

        When you're designing a Java interface, you should consider making it a functional interface
        if it describes a single operation.


*/


@FunctionalInterface
public interface BinaryOperation {

    /*

    Applies this function to the given arguments.
            Params:  t – the first function argument
                     u – the second function argument
            Returns: the function result

    */

    int apply(int a, int b);
}
