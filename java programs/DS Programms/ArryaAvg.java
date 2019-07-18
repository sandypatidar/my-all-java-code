import java.util.Scanner;
public class ArryaAvg {
	public float  arr() {
		Scanner sc = new Scanner(System.in);
		System.out.println("please inter array length");
        int n = sc.nextInt();
		int[] arr = new int[n];
		int total=0;
		System.out.println("please inter array value ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			total +=  arr[i];
		}
		return total/n;
	}
	public static void main(String[] args) {
		ArryaAvg av = new ArryaAvg();
		System.out.println(av.arr());
	}

}
