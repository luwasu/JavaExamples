package genericsAndCollections.comparable;

import java.util.ArrayList;
import java.util.Collections;

// The comparable is used to implement a sort method that can be defined for custom classes

public class PersonSort {

    public static void main(String[] args) {

        ArrayList<Person> people = new ArrayList<Person>();

        people.add(new Person("Simon"));
        people.add(new Person("Sam"));
        people.add(new Person("Dave"));


        System.out.println("***************before sorting***********************");
        for (Person person : people) {
            System.out.println(person.name);
        }


        System.out.println("***************after sorting***********************");
        Collections.sort(people);

        for (Person person : people) {
            System.out.println(person.name);
        }
    }

}
