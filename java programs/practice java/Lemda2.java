import java.util.*;
class Lemda2 {
	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(20);
		l.add(10);
		l.add(30);
		l.add(50);
		l.add(60);
		l.add(80);
		l.add(90);
		l.add(30);
		l.add(60);
		System.out.println(l);
		Collections.sort(l,(i,j) -> (i<j)?1:(i>j)?-1:0) ;
		System.out.println(l);
		Collections.sort(l,(i,j) -> (i<j)?-1:(i>j)?1:0);
		System.out.println(l);

	}
}