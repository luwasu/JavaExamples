package lambdasAndStreams.c_anonymousSubclasses;


/*
        What is an Anonymous Class?

        An anonymous class is a class that is defined "in-line" and has no name, and so it is called "anonymous".

        Nowadays, many anonymous classes can be replaced by lambdas,
        but there are still some important differences you should know about:


             Anonymous Class	                    ¦     Lambdas
                                                    ¦
             Class generated at compile-time        ¦	  Class generated at runtime
             Can override equals()/hashCode()	    ¦     Cannot override them; has no identity
             this refers to the anonymous class	    ¦     this refers to the enclosing class


       What's this all about?

       Let's take a closer look at that last row in the table.
       this inside an anonymous class refers to the anonymous class, whereas this inside a
       lambda refers to the enclosing class. What does that mean exactly?

       Here is what the program will print:

       From lambda: class com.udacitydemo.lambdas.ThisExample
       From subclass: class com.udacitydemo.lambdas.ThisExample$1


       Inside the lambda, this.getClass() returns the class object representing ThisExample.
       The important part is that the "this" keyword inside the lambda references the enclosing class,
       which is com.udacitydemo.lambdas.ThisExample.

       For the Runnable subclass, on the other hand, the program printed com.udacitydemo.lambdas.ThisExample$1.
       You can see that the Java compiler generated a class called com.udacitydemo.lambdas.
       ThisExample$1 for the anonymous lambda (yes, the class name contains a dollar sign),
       and the "this" keyword refers to that generated class!
       If you compile this program yourself, you'll even notice the Java compiler produces a file
       called ThisExample$1.class, which contains the compiled byte code for the anonymous class.

       Java compiler produced file of the anonymous class:

       ~/Examples/out/production/Examples/lambdasAndStreams/c_anonymousSubclasses/AnonymousSubclass$1.class

*/



public final class AnonymousSubclass {

    private final Runnable withLambda =
            () -> System.out.println("From lambda: " + this.getClass());

    private final Runnable withSubclass = new Runnable() {
        @Override
        public void run() {
            System.out.println("From subclass: " + this.getClass());
        }
    };

    public static void main(String[] args) {
        AnonymousSubclass thisExample = new AnonymousSubclass();

        thisExample.withLambda.run();
        thisExample.withSubclass.run();
    }
}
