package FileHandeling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandleing {
	public static void main(String[] args) {
		createFile();
		writeFile();
		// overwriterFile();
		readFile();
		// readFile2();
		// deleteFile();
	}

	private static void overwriterFile() {

	}

	public static void readFile2() {

		try {
			BufferedReader br = new BufferedReader(new FileReader("test.txt"));

			String line = "";

			while ((line = br.readLine()) != null) {
				System.out.println(line);

			}

		}

		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// public static void deleteFile() {
	// File file = new File("test.txt");
	// if(file.delete()) {
	// System.out.println("Delete Sussessfully");
	// }else {
	// System.out.println("File does not Exist");
	// }
	// }

	public static void createFile() {
		File file = new File("test.txt");
		try {
			if (file.createNewFile()) {
				System.out.println("File Created");
			} else {
				System.out.println("Already Exist");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void writeFile() {
		try {
			FileWriter writer = new FileWriter("test.txt");
			writer.write("Hello Guys, Good Morning");
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// public static void overWriterFile() {
	// try {
	// FileWriter writer = new FileWriter("test.txt", true);
	// writer.write("\n we are learning file handeling");
	// writer.close();
	// }catch(IOException e) {
	// e.printStackTrace();
	// }
	// }
	public static void readFile() {
		try {
			FileReader reader = new FileReader("test.txt");
			int data = 0;
			try {
				while ((data = reader.read()) != -1) {
					char ch = (char) data;
					System.out.println(ch);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
