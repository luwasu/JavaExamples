package fileInputOutput.advancedExamples;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Note {

	private static final String FILE_PATH = "note.txt";
	private static final String ENCODING = "UTF-8";

	public static void main(String[] args) throws IOException {
		try (Scanner scanner = new Scanner(new File(FILE_PATH), ENCODING)) {
			while (scanner.hasNextLine())
				System.out.println(scanner.nextLine());
		} catch (FileNotFoundException e) {
		}

		try (Scanner scanner = new Scanner(System.in);
			 PrintWriter writer = new PrintWriter(
					 new OutputStreamWriter(new FileOutputStream(FILE_PATH), ENCODING))) {
			while (true) {
				String line = scanner.nextLine();
				if (line.isEmpty()) break;
				writer.println(line);
			}
		}
	}
}
