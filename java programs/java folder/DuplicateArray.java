import java.util.*;
class DuplicateArray {
	public static void arr(int[] ar){
		Map<Integer,Integer> m = new HashMap<Integer, Integer>();
		for (int a :ar ) {
			if (m.containsKey(a)) {
				m.put(a,m.get(a)+1);
			}
			 else {
			 	m.put(a,1);
			 }
		}

		Set<Integer> s = m.keySet();
		for (Integer x : s ) {
			if (m.get(x)>1) {
				System.out.println(x+ " is "+m.get(x)+" times");
			}
		}
	}

	public static void main(String[] args) {
		int[] a = {4, 4 ,2, 4, 5, 2, 3, 1}; 
		arr(a);
	}
}







