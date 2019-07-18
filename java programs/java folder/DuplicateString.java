// import java.util.Map;
import java.util.*;
class DuplicateString {
	public static void findIt(String str) {
		String str2 = str.replaceAll(" ", "").toLowerCase();
		Map <Character , Integer> m = new HashMap<Character , Integer>();
		char[] ch = str2.toCharArray();
		for (Character c  : ch) {
			if (m.containsKey(c)) {
				m.put(c, m.get(c)+1);
			} else {
				m.put(c, 1);
			}
		}
		Set<Character> s = m.keySet();
		for (Character cc : s ) {
			if (m.get(cc)>1) {
				System.out.println(cc+" is "+m.get(cc)+" times");
			}
		}
	} 

	public static void main(String[] args) {
		findIt("Better Butter");
	}
}