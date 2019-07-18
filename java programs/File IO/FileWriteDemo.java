package clas;
import java.io.*;
class FileWriteDemo {
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("new.txt");
		fw.write(100);
		fw.write("\n");
		fw.write("urga sir is very good for java and nature ");
		char[] ch = {'s','a','n','d','e','e','p'};
		fw.write(ch);
		fw.write("\n");
		fw.write(" patidar");
		fw.flush();
		fw.close();
	}
}