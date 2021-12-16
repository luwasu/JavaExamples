package enums;

/*
        What is an Enum?

        In many cases when developing software we need to provide a predefined value for a single variable type.
        Enumerations (or Enums for short) are a special data type of constants that allow a variable to be
        set from an enumerated list.

        An Enum is a Class

        In Java, the declaration of an Enum defines a class.
        This class can exist within another class or as a standalone class.

        In some cases, we might only need to use the Enum type within a single class
        In that case it would be acceptable to define it within another class rather than as a standalone.
        However, if other classes are expected to use the enum type, it should be defined as a separate, standalone class.

        Syntax Example

        Notice that we have created three constants, RED, YELLOW, and GREEN.
        In Java, it is standard to put the values of enums in uppercase to indicate that they are constants.

        */

public class EnumExample {

    public static void main(String[] args) {

        Stoplight myStoplight = Stoplight.RED;

        System.out.println(myStoplight);
    }
}
