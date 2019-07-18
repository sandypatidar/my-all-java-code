package map;
import java.util.*;
public class WeakHashMapDemo {
	public static void main(String[] args) throws Exception {
		WeakHashMap whm = new WeakHashMap();
		Temp t = new Temp();
		whm.put(t, "value");
		System.out.println(whm);
		t = null;
		System.gc();
		Thread.sleep(5000);
		System.out.println(whm);
	}

}
class Temp {
	public String toString() {
		return "temp";
	}
	public void finalize() {
		System.out.println("Finalize method is called");
	}
}