import java.util.*;
class removeDuplicate{
	public void remDup(String str) {
		LinkedHashSet<Character> set = new LinkedHashSet<>();
		for (int i=0; i<str.length();i++ ) {
			set.add(str.charAt(i));
		}
		for (Character ch : set ) {
			System.out.print(ch);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the string");
		String str = sc.nextLine();
		removeDuplicate r = new removeDuplicate();
		r.remDup(str);
	}
}