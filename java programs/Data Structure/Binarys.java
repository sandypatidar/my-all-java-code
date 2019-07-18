import java.util.*;
class DecimalToBinary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nPlease enter the Decimal number");
		binaryConvert(sc.nextInt());
	}
	public static void binaryConvert(int num){
		int x = 0,i=0;
		int []bin = new int[100];
		while(num>0){
			bin[i] = num%2;
			num = num/2;
			i++;
			x++;
			//System.out.print(i+" "+x);
		}
		int m =0;
		System.out.print("the binary num is: ");
		for (int j=x-1; j>=0;j-- ) {
			 System.out.print(bin[j]);
			
			if(bin[j]==0){
				m++;
			}
		}
		System.out.println("\nthe number of zero is: "+m);

	}
}