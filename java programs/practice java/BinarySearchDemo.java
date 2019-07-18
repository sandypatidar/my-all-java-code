import java.util.*;
class BinarySearchDemo {
	public static void main(String[] args) {
		List l = new  ArrayList();
		l.add(10);
		l.add(11);
		l.add(8);
		l.add(0);
		l.add(67);
		System.out.println(l);
		Collections.sort(l,new MyComparator());
		System.out.println(Collections.binarySearch(l,4, new MyComparator()));
		System.out.println(l);
		Collections.reverse(l);// only order revers not an element 
		System.out.println(l);

	}
}
class MyComparator implements Comparator {
	public int compare(Object o1, Object o2){
		Integer i1 = (Integer)o1;
		Integer i2 = (Integer)o2;
		return i2.compareTo(i1);
	}
}