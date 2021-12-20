package lambdasAndStreams.f_streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


            /*
                What is a Stream?

                A stream is a sequence of elements.

                Streams are useful because they allow us to process collection, one element at a time.
                They can process elements in many ways, such as (but not limited to) filtering or transforming
                elements, sorting elements, or computing statistics such as the sum or average.

                Stream Pipelines

                1. Create a stream           2. Apply intermediate operations           3. Apply one terminal operation

                -------------  --------------      --------------      --------------      ---------       --------------
                > CREATE >      > Operate >        > Operate >         > Operate >         > ... >         > Terminate >
                -------------  --------------      --------------      --------------      ---------       --------------

                You Can Apply Many Intermediate Operations, But Only One Terminal Operation, To a Stream

                A stream pipeline consists of creating a stream, calling intermediate operations on the stream,
                and then terminating the stream using a terminal operation.

                Streams are single-use. Once you do an operation on a Stream, you cannot to any more operations
                on that same stream. This means intermediate operations always return a
                brand-new Stream, never the original.

                Streams are lazily evaluated.->
                No computation happens until the very end, when the terminal operation is called.


                */

public class StreamAPI {

    // unfold to see full implementation
    public static void main(String[] args) {

        Student student1 = new Student("Lu", 25);
        Student student2 = new Student("Emmi", 50);
        Student student3 = new Student("Bonnie", 75);
        Student student4 = new Student("Nadja", 100);

        ArrayList<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);

        printAllScores(students);
        printHighestScore(students);


    }

/*
    First, the stream() method creates a stream from the students list.

    This stream pipeline has two intermediate methods: the filter() method removes the elements of
    the stream that are null, and mapToInt() transforms each student into an int. Notice that each
    of these methods returns another Stream: filter() returns a Stream<Student>, and
    mapToInt() returns an IntStream.

    Finally, the terminal operation max() computes the maximum value in the IntStream.
    This terminal method actually returns an OptionalInt instead of an int. If the students parameter
    is empty or contains only null elements, it's possible the final stream will be empty.
    In this case, we need to tell the program to return a default value of 0.

*/

    public static void printHighestScore(List<Student> students) {
        int output = students.stream()
                .filter(Objects::nonNull)
                .mapToInt(Student::getScore)
                .max()
                .orElse(0);

        System.out.println("the largest Score is : " + output);
    }

    // Prints out all the scores
    public static void printAllScores(List<Student> students) {
        students.stream()
                .filter(Objects::nonNull)
                .mapToInt(Student::getScore)
                .forEach(System.out::println);

    }
}

// unfold to see full implementation
class Student {

    String name;
    int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
