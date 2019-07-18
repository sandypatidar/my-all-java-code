package practic;
import java.util.*;
public class BinaryToHexadecimal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the Binary number");
		int num = sc.nextInt(),i=1,rem=0,dn=0;
		int[] hdn=new int[1000];
			while(num>0) {
				rem = num%8;
				dn = dn+ rem * i;
				i = i *8;
				num = num/8;
			}
//			i = 0;
//			while(dn > 0 ) {
//				hdn[i++] = dn%8;
//				dn = dn/8;
//			}
//			System.out.print("the hexadecimal number is : ");
//			for (int j = i-1; j >=0; j--) {
//				System.out.print(hdn[j]);
//			}
			System.out.println(rem);
		sc.close();
	}
}
