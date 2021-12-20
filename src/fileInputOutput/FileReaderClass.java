package fileInputOutput;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

// Source: https://www.youtube.com/watch?v=Hr8tLlj32BQ&ab_channel=BroCode
//         https://www.asciiart.eu

public class FileReaderClass {

    public static void main(String[] args) throws IOException {

        // FileReader = read the contents of a file as a stream of characters.
        // read() returns an int value which contains the byte value
        // when read() returns -1, there is no more data to be read

        File file = new File("art.txt");

        if (file.exists()) {

            FileReader reader = new FileReader("art.txt");
            int data = reader.read();
            while (data != -1) {
                System.out.print((char) data);
                data = reader.read();
            }
            reader.close();
        } else {
            System.out.println("File was not found!");
            System.out.println("New file has been created: " + file.createNewFile());
            System.out.println("Do not forget to add some asci art to your file!");
        }
    }
}



