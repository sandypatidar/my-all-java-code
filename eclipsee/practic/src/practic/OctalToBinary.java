package practic;
import java.util.*;
public class OctalToBinary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int i=0,j=1,rem;
		int arr[] = new int[100];
		while(num>0) {
			rem = num%10;
			arr[i++] = arr[i++] + rem *j;
			j = j*8;
		}
		for (int k = i-1; k >=0; k--) {
			System.out.println(arr[k]);
		}

	}

}
