package fileInputOutput.advancedExamples.postIt;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;
import java.util.Scanner;

public class PostIt {



	private static final String FILE_PATH = "postit";

	public static void main(String[] args) throws Exception {
		try (ObjectInputStream istream = new ObjectInputStream(new FileInputStream(FILE_PATH))) {
			Message msg = (Message) istream.readObject();
			Date date = msg.getDate();
			String text = msg.getText();
			System.out.println(date + "\n" + text);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		try (Scanner scanner = new Scanner(System.in);
			 ObjectOutputStream ostream = new ObjectOutputStream(new FileOutputStream(FILE_PATH))) {
			String text = scanner.nextLine();
			Message msg = new Message(text);
			ostream.writeObject(msg);
		}
	}
}

