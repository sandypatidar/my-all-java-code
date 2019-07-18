package practic;
import java.util.*;
public class Example {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the decemal number");
		int x = sc.nextInt();
		int i=0;
		int[] a = new int[100];
		while(x>0) {
			a[i++] = x%8;
			x = x/8;
		}
		System.out.print("the octel number is : ");
		for (int j = i-1; j >=0; j--) {
			System.out.print(a[j]);
		}
		System.out.println("\n");
		sc.close();
	}
	

}
