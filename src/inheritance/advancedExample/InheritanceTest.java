package inheritance.advancedExample;


// What is the output of the program?

public class InheritanceTest {

    public static void main(String[] args) {
        B x = new A(); // First it will print the constructor: output 1, 4
        System.out.println("");
        x.foo(); // will output 2 because of the foo() method
        System.out.println("");
        x.bar(); // will output 5 because of the bar() method



        System.out.println("");
        System.out.println("**************2nd example*****************");

        A z = new A(); // output is 14
        System.out.println("");
        B y = new B(); // output is 1


    }
}

class B {
    public B() {
        System.out.print("1");
    }

    public void foo() {
        System.out.print("2");
    }

    public void bar() {
        System.out.print("3");
    }
}

class A extends B {
    public A() {
        System.out.print("4");
    }

    public void bar() {
        System.out.print("5");
    }
}

