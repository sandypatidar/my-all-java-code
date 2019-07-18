package in.india;
import java.util.Scanner;
public class Demo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the array length");
		int n = sc.nextInt();
		System.out.println("enter array value");
		int inArr[][] = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				inArr[i][j] = sc.nextInt();
			}
		}
		sc.close();
		System.out.println();
		int outAr[][] = transe(inArr , n);
	}
	public static int[][]  transe(int ar[][], int nn){
		int reArry[][] = new int[nn][nn];
		for (int i = 0; i < nn; i++) {
			for (int j = 0; j < nn; j++) {
				reArry[i][j] = ar[j][i];
			}
		}
		return reArry;
	}

}
