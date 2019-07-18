import java.util.*;
public class Example {
	public static void main(String[] args) {
		List l = new ArrayList();
		l.add(0,50);
		l.add(10);
		l.add(27);
		l.add(25);
		l.add(31);
		l.add(87);
		l.add(56);
		System.out.println(l);
		Iterator itr = l.iterator();
		while (itr.hasNext()){
			Integer i = (Integer)itr.next();
			if(i%2==0) {
				System.out.print(i+" ");
			}
			else {
				itr.remove();
			}
		}

		System.out.println();
		System.out.println(l);
	}
}