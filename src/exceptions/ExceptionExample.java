package exceptions;


/*
        The Error Class and the Exception Class

        The Java error-handling framework uses two different classes to identify abnormal software events:

        - The Error class is used to indicate a serious problem that the application should not try to handle.
        - The Exception class is used when there is a less catastrophic event that the application should try to handle.

        The Throwable Class

        Both Error and Exception classes inherit from the abstract class throwable. This means that both errors and
        exceptions will contain:

        - The type of problem – the class type, either Exception or Error
        - The problem message – whatever description you've provided within the class, such as "out of memory"
        - The stack trace where the exception occurred – the order in which things ran and the place in that sequence
          where the problem occurred (this information is used by developers to track down issues and resolve
          problems in the code)


        Throwing an Exception

        What does it mean to throw an exception?

        - When an error occurs within a method, that method creates an Exception object.
        - Next, the method hands the Exception off to the JVM runtime system. And that's what we mean when we say
          that we are throwing an exception. We simply mean that a method hands off an exception to the runtime.

        Checked vs Unchecked
        In Java there are two different types of exceptions:

        Unchecked Exceptions

        - Unchecked exceptions are exceptions that are unknown to the compiler.
        - Because these exceptions are only known at runtime, they are also referred to as runtime exceptions.
        - They are a result of a programming error, typically arithmetic errors (such as division by 0).
        - Unchecked exceptions are used when we expect that the caller of the method cannot recover from the exception.

        Checked Exceptions

        - Checked exceptions are known to the compiler.
        - If we are calling a method that potentially throws a checked exception,
          it must be handled (or we will get an error from the compiler).
        - Checked exceptions are used when we expect that the caller of the method can recover from the exception.
*/





public class ExceptionExample {

    public static void main(String[] args) {

        String[] numbers = new String[]{"123-4567", null, "234-4567", "345-5678"};

        for (String number : numbers) {
            try {
                System.out.println(new Phone("Android", number));
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getLocalizedMessage());
            }

        }

        for (String number : numbers) {
            System.out.println(new Phone("Android", number));

        }
    }

}


