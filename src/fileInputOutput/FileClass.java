package fileInputOutput;

import java.io.File;
import java.io.IOException;


// Source: https://www.youtube.com/watch?v=MwYRVKfb2M0&ab_channel=BroCode
//         https://www.w3schools.com/java/java_files.asp


public class FileClass {


    public static void main(String[] args) throws IOException {
        // To use the File class, create an object of the class, and specify the filename or directory name:
        // file = An abstract representation of file and directory pathnames
        File file = new File("secret_message.txt");                            // If the file is not within your project you will need to add the absolute path to the file.

        if(file.exists()) {                                                             // Checks if file exists.
            System.out.println("That file exists! :O!");
            System.out.println("The path from the constructor: " + file.getPath());     // Gets the whatever you have passed within the constructor class on line 16.
            System.out.println("The absolute Path: " + file.getAbsolutePath());         // This gets the absolute path of the file located on your computer
            System.out.println("Is this a file? " + file.isFile());                     // This checks to see if the file is a file or not for example a folder (returns true or false).
            System.out.println("The file was deleted: " + file.delete());               // This deletes the file
        }
        else {
            System.out.println("That file doesn't exist :(");
            System.out.println("A new file was created: " + file.createNewFile());      // This creates the file if it does not exist.
            System.out.println("Can you see it?");
        }
    }
}
