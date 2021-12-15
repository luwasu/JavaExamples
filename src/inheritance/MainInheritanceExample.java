package inheritance;

/*

  - We want to go from general to specific. The parent or superclass is the most general and the child or
    subclass is the more specific.

  - By extending the superclass you are stating that the subclass is of the superclass type.
    When we're not sure if a subclass is inheriting from a parent class, we can use the “is a” test (e.g. a car is a vehicle).

  - The relationship between superclass and subclasses is only one way.
    The subclasses need to know about the superclass, but the superclass should never know anything about its subclasses.

    Every class inherits from the superclass Object. Because all objects inherit from the Object class,
    there are some methods that all objects have, no matter what types they are.

    For example, all objects have:

    - clone(), so that we can clone or make a copy of any object.
    - equals(), which we can use to determine if two objects are the same.
    - hashCode(), which provides a unique hash code for each object. This is something we'll make use of later on when we need to store and retrieve objects in specific data sets.
    - toString(), which we can use to get a description of the current state of an object


 */


public class MainInheritanceExample {
    public static void main(String[] args) {

        System.out.println("*************People*****************");

        Person dave = new Person("Dave", "Funnybonse");
        System.out.println(dave);


        System.out.println("*************Student*****************");
        Student simon = new Student("Simon", "Steiner", "100");
        System.out.println(simon);

        System.out.println("*************StudentEmployee*****************");
        StudentEmployee mike = new StudentEmployee("Mike", "Magic", "100", "500", 50.00);
        System.out.println(mike);

    }
}
