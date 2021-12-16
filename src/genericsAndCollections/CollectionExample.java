package genericsAndCollections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;



/*      Without Maps: Linear Lookup Time

        When we have a list of objects and need to search for an item in that list, the time required to search will
        grow linearly with the number of objects. The more items added to the list, the longer it will take to iterate
        over all the items. Processing a list of items like this is said to take linear time, because a graph of the
        relationship looks like a straight line:*/




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
