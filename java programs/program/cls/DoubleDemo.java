import java.util.Scanner;
public class DoubleDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double d1 = sc.nextDouble();
		double d2 = sc.nextDouble();
		if(d1<1 && d2>0 && d2<1 && d2>0){
			System.out.print(true);
		}
		else{
			System.out.print(false);
		}
	}
}