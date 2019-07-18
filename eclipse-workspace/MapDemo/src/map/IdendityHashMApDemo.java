package map;
import java.util.*;
public class IdendityHashMApDemo {
	public static void main(String[] args) {
		//HashMap h = new HashMap();
		IdentityHashMap ih = new IdentityHashMap();
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(10);
		ih.put(i1, "sandeep");
		ih.put(i2, "kalyan");
		System.out.println(ih);
	}

}
