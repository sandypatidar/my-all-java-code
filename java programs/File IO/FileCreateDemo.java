package clas;
import java.io.*;
class FileCreateDemo {
	public static void main(String[] args) throws IOException {
		File f = new File("new.txt");
		System.out.println(f.exists());
		f.createNewFile();
		f.mkdir();
		System.out.println(f.exists());
	}
}