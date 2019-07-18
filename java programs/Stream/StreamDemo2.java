import java.util.*;
import java.util.stream.*;
class StreamDemo2 {
	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(0);l.add(5);l.add(10);l.add(15);l.add(20);
		l.add(25);l.add(30);l.add(35);
		System.out.println(l);

		List<Integer> l1 = l.stream().map(i->i*i).collect(Collectors.toList());
		System.out.println(l1);
	}
}