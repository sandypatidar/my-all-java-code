class LCM_HCF_GCD {
	public static int getLCM(int a, int b) {
		 int lcm=a*b;
		for(int i=1;i<a*b;i++){
			if(i%a==0 && i%b==0){
				lcm = i;
			}
		}
		return lcm;
	}

	public static int getHCF(int a,  int b) {
		int hcf = 1;
		for(int i=1;i<=a||i<=b; i++){
			if(a%i==0 && b%i==0){
				hcf = i;
			}
		}
		return hcf;
	}

	public static int getGCD(int a, int b) {
		if(b == 0) return a;
		return getGCD(b,a%b);
	}

	public static void main(String[] args) {
		int LCM = getLCM(8,6);
		int HCF = getHCF(12,16);
		int GCD= getGCD(12,16);
		System.out.println(LCM+" -------- "+HCF+" ------- "+GCD);
	}
}