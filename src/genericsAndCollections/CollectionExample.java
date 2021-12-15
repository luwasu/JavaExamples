package genericsAndCollections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class CollectionExample {
    public static void main (String[] args) {
        List<String> listOfItems = new LinkedList<String>();

        listOfItems.add("Mike");
        listOfItems.add("Alice");
        listOfItems.add("Luis");

        for (String items : listOfItems) {
            System.out.println(items);
        }

        System.out.println("****************remove Luis from the list**************");

        listOfItems.remove("Luis");

        for (String items : listOfItems) {
            System.out.println(items);
        }

        System.out.println("*********************before removing items from with an iterator 1/2 *******************");

        List<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);

        System.out.println(numbers);

        System.out.println("*********************after removing items from with an iterator 2/2 *******************");


        Iterator<Integer> iterator = numbers.iterator();

        while (iterator.hasNext()) {
            Integer i = iterator.next();
            if (i > 5) {
                iterator.remove();
            }
        }
        System.out.println(numbers);
    }
}
