package practiceProgramm;
import java.util.Scanner;
public class ArrayAvrg {
		public  int[] arr = new int[5];
		Scanner sc = new Scanner(System.in);
	public  void arr() {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
