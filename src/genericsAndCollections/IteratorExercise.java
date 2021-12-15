package genericsAndCollections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorExercise {
    public static void main(String[] args) {
        List<String> names = new LinkedList<String>();

        names.add("Mike");
        names.add("Bob");
        names.add("Alice");

        Iterator<String> iterator = names.iterator();

        System.out.println("***************while Loop**********************");


        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("***************For Each Loop**********************");

        // This is exactly the same because the for each loop implements the iterator
        for (String name : names) {
            System.out.println(name);
        }
    }
}
