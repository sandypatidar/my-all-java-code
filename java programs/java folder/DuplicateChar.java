import java.util.*;
class DuplicateChar {
	public void findIt(String str) {
		String str1 = str.replaceAll("\\s","");
		char[] chr =  str1.toCharArray();
		Map<Character, Integer> m = new HashMap<Character, Integer>();
		for (char ch:chr) {
			if(m.containsKey(ch)){
				m.put(ch, m.get(ch) + 1);
			} else {
				m.put(ch,1);
			}
		}
		Set<Character> set = m.keySet();
		for (Character ch : set) {
			if(m.get(ch)>1) {
				System.out.println(ch+" is "+ m.get(ch)+ " times");
			}
		}
	}
	public static void main(String[] args) {
		DuplicateChar dc = new DuplicateChar();
		dc.findIt("Java J2EE Java JSP J2EE");
	}
}