import java.util.Arrays;
class StringDemo {
	public static void main(String[] args)  {
		String str[] = {"ab","25","yash","10","sandeep"};
		int[] x = new int[str.length];
		int  a = 0, count=0;
		Arrays.sort(str);
		for (String st : str) {
			System.out.println(st);
		}
		for (int i=0; i<str.length; i++) {
			try {
				x[i] = Integer.parseInt(str[i]); 
			}
			catch(NumberFormatException e){
				count ++;
				// break;
			} 
	    }
	    
	    for (int i=0; i<str.length-count;i++ ) {
	     	a = a+x[i];
	        }
	    System.out.println("the sum is "+a);
	    
	    // for (int i=0; i<str.length-count;i++ ) {
	    // 	a = a+ Integer.parseInt(str[i]);
	    // }
	    // System.out.println("the sum is "+a);
   }
}