import java.util.function.*;
import java.util.*;

class PredicateDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please inter array length");
		String[] str = new String[sc.nextInt()];
		for (int i=0; i<str.length; i++ ) {
			str[i] = sc.nextLine();
		}
		Predicate<String> p = s->s.length()%2==0;
		for (String s : str ) {
			if (p.test(s)) {
				System.out.println("-> "+s);
			}
		}
		sc.close();
	}
}