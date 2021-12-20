package fileInputOutput;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// Source: https://www.youtube.com/watch?v=zKDmzKaAQro&ab_channel=BroCode


public class ReadCSVFile {

    public static void main(String[] args) {

        //   CSV = Comma-Separated Values
        //   text file that uses a comma to separate values

        String file = "todo_list.csv"; // Make sure to create a file called todo_list.csv with comma seperated input
        BufferedReader reader = null;
        String line = "";

        try {
            reader = new BufferedReader(new FileReader(file));
            while ((line = reader.readLine()) != null) {

                //String[] row = line.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)");
                //use this if your values already contain commas (Ex. $1,000).
                String[] row = line.split(",");

                for (String index : row) {
                    System.out.printf("%-20s", index);
                }
                System.out.println();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}