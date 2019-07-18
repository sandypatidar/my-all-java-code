package map;
import java.io.*;
import java.util.Properties;
public class PropertiesDemo {
	public static void main(String[] args) throws Exception {
		Properties p =new Properties();
		FileInputStream fis = new FileInputStream("abc.properties");
		p.load(fis);
		System.out.println(p);
		String s = p.getProperty("user");
		System.out.println(s);
		p.setProperty("nag", "8888");
		FileOutputStream fos = new FileOutputStream("abc.properties");
		p.store(fos, "Update by sandeep patidar");
	}

}
