package fileInputOutput;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


        /*
        Sources:
        https://www.youtube.com/watch?v=kjzmaJPoaNc&ab_channel=BroCode
        https://www.w3schools.com/java/java_files_create.asp

        Write To A File

        In the following example, we use the FileWriter class together with its write() method

        to write some text to the file we will create.
        Note that when you are done writing to the file, you should close it with the close() method:

        */

public class FileWriterClass {

    public static void main(String[] args) {

        File file = new File("poem.txt");

        if (file.exists()) {
            try {
                FileWriter writer = new FileWriter("poem.txt");
                writer.write("The only way to learn a new programming language is by writing programs in it.");
                writer.append("\n - A quote by Dennis Ritchie");

                /*
                 Closes the stream, flushing it first. Once the stream has been closed, further write() or flush()
                 invocations will cause an IOException to be thrown. Closing a previously closed stream has no effect.
                 */
                writer.close();

                System.out.println("Can you see the poem.txt file?");

            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("That file doesn't exist :(");
            file.delete();
        }
    }
}