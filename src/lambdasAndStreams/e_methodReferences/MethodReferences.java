package lambdasAndStreams.e_methodReferences;

import java.util.List;
import java.util.function.Predicate;


/*
        What is a Method Reference?

        A method reference is a short lambda expression that refers to a method that is already named.

        If a method with the right parameters and return values is already defined, you can use that instead
        of writing a new lambda. If this sounds confusing, don't worry — the next code demo should demonstrate
        how simple method references are to use.

        When to Use Method References

        Generally speaking, if a method is already defined that you can use, you should use a method
        reference instead of writing a brand new lambda. It's usually a good idea in software development to
        not write new code if there's already existing code that does the same thing you're trying to do!

        Method references cannot capture surrounding variables, though. If you find yourself in this situation,
        you should use a custom lambda instead.

        Example:

        We can take the original lambda expression demo and simplify it using a method reference to String::isBlank.

        See the implementation below:

        */

public class MethodReferences {

    /**
     * Returns the number of strings that match a given condition.
     *
     * @param input     the strings that should be tested.
     * @param condition the condition that strings should be tested against.
     * @return the number of strings in the input that match the condition.
     */
    public static long countMatchingStrings(List<String> input, Predicate<String> condition) {
        return input.stream().filter(condition).count();
    }

    public static void main(String[] args) {

        List<String> input = List.of("hello", "\t   ", "world", "", "\t", " ", "goodbye", "  ");

        long numberOfWhitespaceStrings = countMatchingStrings(input, String::isBlank);
        // without Method References:    countMatchingStrings(input, s -> s.trim().isEmpty());

        System.out.println(numberOfWhitespaceStrings + " whitespace strings");
    }
}