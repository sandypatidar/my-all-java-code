package clas;
import java.io.*;
class DirAnyFolder {
	public static void main(String[] args) throws IOException {
		int c = 0;
		File f = new File("F:\\");
		String[] s = f.list();
		for (String s1 : s ) {
			File f1 = new File(f,s1);
			if(f1.isDirectory()) {
				c++;
				System.out.println(s1);
			}
		}
		System.out.println("Total number of folder is : "+c);
	}
}