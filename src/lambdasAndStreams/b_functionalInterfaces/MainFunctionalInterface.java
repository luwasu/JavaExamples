package lambdasAndStreams.b_functionalInterfaces;

import java.util.function.BinaryOperator;




/*
        Lambda Expressions

        Lambdas are a Java language feature that make it very easy to implement certain kinds
        of interfaces in Java. When you compare lambda expressions to the traditional way to of
        implementing a Java interface, lambdas usually result in much cleaner and easier to understand code.

        As you saw from the demo, you can use lambdas to greatly shorten you code and make it easier to read.

 */

public class MainFunctionalInterface {

    public static void main(String[] args) {

        System.out.println("*********Custom made BinaryOperation**********");
        // Or you could use:
        //
        //  BinaryOperation add = Integer::sum;
        //
        //

        // lambdasAndStreams.functionalInterfaces.BinaryOperation
        BinaryOperation addUp = (a, b) -> a + b;

        assert 5 == addUp.apply(2, 3);

        System.out.println(addUp.apply(2,3));


        System.out.println("*********Implemented/Default BinaryOperation**********");

        // java.util.function.BinaryOperator
        BinaryOperator<Integer> add = (a, b) -> a + b;
        assert 5 == add.apply(2, 3);

        System.out.println(add.apply(2,3));

    }
}
