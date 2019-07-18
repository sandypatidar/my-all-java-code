public class Demo1 {
	public boolean endOther(String a,String b) {
		for (int i = 0; i < a.length(); i++) {
			for (int j = 0; j < b.length(); j++) {
				if(b.charAt(i)==a.charAt(j)) {
					return true;
				}
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		 Demo1 d1 = new Demo1();
		 boolean x = d1.endOther("Hiabc", "abc");
		 System.out.println(x);
	}
}
