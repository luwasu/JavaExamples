package scanner;

import java.util.Scanner;



/*
        The Scanner class can read and parse simple text. Here are some key points to keep in mind:

        - It parses primitive types and String types into tokens.

        - By default it uses whitespaces to delimitate each word.
          However, it can also use regular expressions.

        - The Scanner class can read from several different types of sources, like strings, files and System.in
          (to get input from the command line).

*/

public class ScannerExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = scanner.nextLine();

        System.out.println("What is your age?");

        int age = Integer.parseInt(scanner.nextLine());

        System.out.println("What is your favourite food?");
        String favFood = scanner.nextLine();

        System.out.println("Hi my name is " + name + ", I am " + age + " years old and I love " + favFood + " !");
    }
}
