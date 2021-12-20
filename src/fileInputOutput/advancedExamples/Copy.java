package fileInputOutput.advancedExamples;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copy {

	private static final String SOURCE_FILE_PATH = "image.jpg";
	private static final String TARGET_FILE_PATH = "copy.jpg";

	public static void main(String[] args) throws IOException {
		try (FileInputStream istream = new FileInputStream(SOURCE_FILE_PATH);
			 FileOutputStream ostream = new FileOutputStream(TARGET_FILE_PATH)) {
			byte[] buffer = new byte[1024];
			while (true) {
				int nbytes = istream.read(buffer);
				if (nbytes == -1) break;
				ostream.write(buffer, 0, nbytes);
			}
		}
		System.out.println("See if you can find the copy.jpg");
	}
}
