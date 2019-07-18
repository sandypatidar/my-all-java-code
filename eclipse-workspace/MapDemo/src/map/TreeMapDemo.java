package map;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {
		TreeMap t = new TreeMap(new MyComparator());
		t.put(105, "sandy");
		t.put(104, "sandy");
		t.put(102, "sandy");
		t.put(101, "sandy");
		t.put(100, "sandy");
		System.out.println(t);

	}
}
class MyComparator implements Comparator {
	public int compare(Object obj1, Object obj2) {
		String s1 = obj1.toString();
		String s2 = obj2.toString();
		return -(s2.compareTo(s1));
	}
}
