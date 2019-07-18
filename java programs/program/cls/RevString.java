public class RevString {
	public static void main(String[] args) {
		String str = "my name is sandeep patidar";
		int x =0 ,y =0;
		String ans = "";
		for (int i=0; i<str.length(); i++) {
			if (str.chatAt(i)==' ' || i == (str.length()-1)) {
				if (i==str.length()-1) {
					
				}
				String temp = str.substring(x,y);
				System.out.println(temp);
				String ans = ans + " " + reversr(temp);
				x = y+1;
				y= y+1; 
			}
			else {
				y++;
			}
		}
		System.out.print(ans);
	}

	public static String reverse(String rstr) {
		int len = rstr.length();
		string ss = "";
		for (int i=rstr.length()-1;i>=0 ;i++ ) {
			ss = ss + rstr.charAt(i);
		}
		return ss;
	}

}