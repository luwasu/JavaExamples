package genericsAndCollections;

import java.util.ArrayList;

public class MainGenericsExample {
    public static void main(String[] args) {

        Double doubleNumber = 1.5d;
        String name = "Sally";
        Integer intNumber = 1;
        Character letter = 'a';

        ArrayList<Object> variables = new ArrayList<Object>(); // second Object after new is no longer needed since Java 7


        variables.add(doubleNumber);
        variables.add(name);
        variables.add(intNumber);
        variables.add(letter);

        // iterate other the variables ArrayList
        for (Object obj : variables) {
            displayClassNames(obj);
        }


    }

    // print class type of the object
    static <T> void displayClassNames(T variables) {
        System.out.println(variables.getClass().getName());
    }

}
