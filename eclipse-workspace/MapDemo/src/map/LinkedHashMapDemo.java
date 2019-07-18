package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.*;
public class LinkedHashMapDemo {
	public static void main(String[] args) {
		LinkedHashMap h = new LinkedHashMap();
		h.put("sandeep", 700);
		h.put("chiranjeevi",800);
		h.put("balaiah", 900);
		h.put("dhanush", 200);
		h.put("nagarjun", 500);
		System.out.println(h);
//		System.out.println(h.put("chiranjeevi", 100));
//		System.out.println(h);
//		Set s = h.keySet();
//		System.out.println("keySet() "+s);
//		Collection c = h.values();
//		System.out.println("Collection "+c);
//		Set ss = h.entrySet();
//		System.out.println("it's enterySrt() "+ss);
//		Iterator itr = ss.iterator();
//		while(itr.hasNext()) {
//			Map.Entry m1 = (Map.Entry)itr.next();
////			System.out.println(m1.getKey()+"......"+m1.getValue());
//			if(m1.getKey().equals("sandeep") || m1.getKey().equals("balaiah")) {
//				m1.setValue(10000);
//			}
//		}
//		System.out.println(h);
	}
}
