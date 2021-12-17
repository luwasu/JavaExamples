package records;


/*
        What is a Java Record

        A Java Record is a new way to declare a type in the Java language. Records were introduced to the
        Java language to reduce the boilerplate associated with Plain Old Java Objects (POJO).
        When creating a good POJO, a developer must implement an equals method, a toString method,
        and the corresponding getters. From POJO to POJO, the implementations are exactly the same,
        the only thing that changes is the name of the properties for the type.
        Although IDEs and projects like Lombok have created features which auto generate this boilerplate code,
        having all of this boilerplate can get in the way of understanding what the POJO represents.

        A Record does the following:

        - generates one public constructor with all of the properties
        - marks all properties as private final
        - creates public getter methods for all properties
        - creates a toString, equals, and hashCode method
        - allows properties to be decorated with annotations

        A Record cannot do the following:

        - declare any other instance variables
        - Records cannot extend any class
        - Records cannot declare instance fields (other than the private final fields that correspond to the
          components of the record component list);
          any other declared fields must be static
        - Records cannot be abstract; they are implicitly final
        - The components of a record are implicitly final
*/


public class RecordsExample {

    public static void main(String[] args) {

        System.out.println("********* Person Record  ************");

        PersonRecord personRecord1 = new PersonRecord("Luis", 33, "Jogging");

        System.out.println(personRecord1);
        // There are no getter methods but one can reference the attributes
        System.out.println(personRecord1.name());
        System.out.println(personRecord1.age());
        System.out.println(personRecord1.hobby());

        System.out.println("********* Person Record 2nd Constructor  ************");

        PersonRecord personRecord2 = new PersonRecord("Gandalf", 500);

        System.out.println(personRecord2);
        System.out.println(personRecord2.name());
        System.out.println(personRecord2.age());
        System.out.println(personRecord2.hobby());

        System.out.println("********* Person Record Methods  ************");

        PersonRecord personRecord3 = new PersonRecord("Michael", 45,"Magic");

        System.out.println(personRecord3);
        System.out.println(personRecord3.name());
        System.out.println(personRecord3.nameAsUpperCase());

        System.out.println("********* Person Record Static Methods  ************");

        PersonRecord personRecord4 = new PersonRecord("Geri", 66,"Reading");
        System.out.println(personRecord4.name());
        String nameInLowerCase = PersonRecord.nameInLowerCase(personRecord4);
        System.out.println(nameInLowerCase);


        System.out.println("********* Person Standard  ************");

        PersonStandard personStandard = new PersonStandard("Luis", 33);

        System.out.println(personStandard);
        System.out.println(personStandard.getName());
        System.out.println(personStandard.getAge());
    }
}
