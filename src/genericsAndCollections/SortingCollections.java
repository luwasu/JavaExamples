package genericsAndCollections;

import java.util.ArrayList;
import java.util.Collections;

public class SortingCollections {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Nadja");
        names.add("Tillafen");
        names.add("Domi");
        names.add("Luis");
        names.add("Paddington");


        System.out.println("************************before sort**************************");
        for (String name : names) {
            System.out.println(name);
        }

        System.out.println("************************after sort**************************");

        Collections.sort(names);

        for (String name : names) {
            System.out.println(name);
        }

    }

}


