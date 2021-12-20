package lambdasAndStreams.d_LambdaExample;


        /*

        The Calculator

        Obviously, real-world calculators are a lot more robust. For starters,
        they are able to operate on more than two operands at a time, and therefore they
        have to handle the order of operations (for example: 3 + 12 / 5 * ( 4 - 2)).
        However, even the most feature-rich calculators have a mapping somewhere that defines
        what the operators are, and what symbols are used to represent those operators.
        Today, you demonstrated how to accomplish that succinctly with Java lambdas.

        By the way, this little program uses a design pattern known as the "Strategy Pattern":
        the calculator employs a different operation "strategy" depending on which operation symbol is parsed
        from the command-line argument. You'll learn more about the strategy pattern in the lesson on design patterns.

        */


// See if you can figure out what is going on here?

public final class Calculate {

        private static final int NUM1 = 10;


    private static final String OPERTATOR = "+";

    private static final int NUM2 = 20;



    public static void main(String[] args) {


        Calculator calculator = new Calculator();

        calculator.registerOperation("+", (a, b) -> a + b);
        calculator.registerOperation("-", (a, b) -> a - b);
        calculator.registerOperation("/", (a, b) -> a / b);
        calculator.registerOperation("*", (a, b) -> a * b);


        System.out.println(calculator.calculate(NUM1, OPERTATOR, NUM2));
    }
}