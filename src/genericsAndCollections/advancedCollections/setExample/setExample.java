package genericsAndCollections.advancedCollections.setExample;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


/*
        What is a Set?

        Sometimes, as with the example of a list of phone numbers, it's important for the values in a collection
        to be unique. Fortunately, we have Sets. A Set is a collection type that has no duplicate values.

        A Set is an unordered collection, it doesn't maintain any order.
        There are few implementations of Set which maintains the order such as
        LinkedHashSet (It maintains the elements in insertion order).

        Note that Set extends the Collection interface and therefore provides the same methods as
        other Collection data structures do.

        Concrete Implementations
        There are three concrete implementations for the Set interface:

        - HashSet
        - TreeSet
        - LinkedHashSet

        Each of these implementations vary, but all of them enforce the no-duplicate-values requirement
        of the Set interface.

        Note: Above, we referred to these as "concrete implementations". Remember, "concrete" means that
        they are not interfaces or abstract classes, and they contain all of the code necessary per the interface.
*/






public class setExample {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("Luis");
        names.add("Luis");
        names.add("Nadja");
        names.add("Bon");
        names.add("Bon");
        names.add("Bon");
        names.add("Emmi");
        names.add("Evi");
        names.add("Evi");
        names.add("Mum");
        names.add("Dad");

        System.out.println("**********Names in the ArrayList**********");


        for (String name : names) {
            System.out.print(name + ", ");
        }

        System.out.println(" ");
        System.out.println("*****************Names in the HashSet*****************");

        Set<String> uniqueNames = new HashSet<>();

        uniqueNames.addAll(names);
        System.out.println(uniqueNames);

        System.out.println("*****************Retrieving names from the HashSet*****************");

        System.out.println("Does the Set contain \"Luis\"? -> " + uniqueNames.contains("Luis"));
        System.out.println("Does the Set contain \"Dave\"? -> " +uniqueNames.contains("Dave"));

        System.out.println("*****************Delete names from the HashSet*****************");

        System.out.println("***Before deleting***");
        System.out.println(uniqueNames);

        System.out.println("***After deleting single name -> Luis ***");

        uniqueNames.remove("Luis");
        System.out.println(uniqueNames);


        System.out.println("***Delete all the names from the list***");
        uniqueNames.clear();
        System.out.println(uniqueNames);




    }
}
