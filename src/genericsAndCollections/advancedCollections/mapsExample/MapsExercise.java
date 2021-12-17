package genericsAndCollections.advancedCollections.mapsExample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



/*
        Maps: Constant Lookup Time

        Maps provide a solution. Maps are data structures that use key-value pairs.
        That is, every value in the map is paired with a key.
        When we want to retrieve a value, we simply provide the corresponding key.

        Importantly, this retrieval is performed in constant time, meaning that the amount of time required to
        retrieve an item from the map takes a certain, fixed (constant) amount of time, and this time doesn't
        change based on how many items we add.

*/





public class MapsExercise {

    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();

        people.add(new Person("Lu", "luis@example.com"));
        people.add(new Person("Emmi", "emmi@example.com"));
        people.add(new Person("Bon", "bon@example.com"));
        people.add(new Person("Evi", "evi@example.com"));
        people.add(new Person("Mum", "mum@example.com"));
        people.add(new Person("Dad", "dad@example.com"));
        people.add(new Person("Truffles", "truffles@example.com"));
        people.add(new Person("George", "george@example.com"));

        System.out.println("*******ArrayList PersonRecord*********");
        for (Person person : people) {
            System.out.println(person);
        }

        // Add People to the HashMap
        Map<String, Person> mapOfPeople = new HashMap<>();

        for (Person person : people) {
            mapOfPeople.put(person.getEmail(), person);
        }

        System.out.println("*******HashMap PersonRecord*********");
        System.out.println("***print values***");
        for (Person i : mapOfPeople.values()) {
            System.out.println(i);
        }

        System.out.println("***print key***");
        for (String i : mapOfPeople.keySet()) {
            System.out.println(i);
        }

        System.out.println("*******Get specific data from the HashMap*********");

        System.out.println("Get Lu: " + mapOfPeople.get("luis@example.com"));
        System.out.println("Get Bon: " + mapOfPeople.get("bon@example.com"));

        System.out.println("*******Richard is not in the list and will return false");
        System.out.println("Contains Richard? : " + mapOfPeople.containsKey("richard@example.com"));

        System.out.println("*******Emmi is in the list and will return true");
        System.out.println("Contains Emmi? : " + mapOfPeople.containsKey("emmi@example.com"));

    }

}
