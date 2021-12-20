package fileInputOutput.advancedExamples;

import java.io.File;
import java.io.FileFilter;

public class ListDir {

	private static final String DIR_NAME = ".";

	public static void main(String[] args) {
		File dir = new File(DIR_NAME);
		File[] files = dir.listFiles(new FileFilter() {
			public boolean accept(File file) {
				return file.isFile();
			}
		});
		for (File file : files) {
			System.out.println(file.getName() + " (" + file.length() + ")");
		}
	}
}
