class Demo2 {
	static int getLess(int n , int m){
		boolean b = true;
		int temp = n;
		int a=0;
		int c= 0;
		int d= 0;
		int e= 0;
		int p = 1;
		int num= 0;
		while (n!=0){
			a = n%10;
			d++;
			n = n/10;
			if(a != m) {
				c++;
			}
			if(c==d){
				e = c;
				a = 9;
			}
			else if( (e+1) == d) {
				a = a-1;
			} 
			if((e++) == d) {
				if(a == m){
					a = a-1;
				}
			}
			num = num + a*p;
			p = p*10;

		}
		return num;
	}


	public static void main(String[] args) {
		int s = Demo2.getLess(243, 4);
		System.out.println(s);
	}
}