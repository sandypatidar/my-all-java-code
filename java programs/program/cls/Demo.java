import java.util.*;

public class Demo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		if(x==y && x==w && x==z) {
			System.out.println("all number are equals ");
		}
		else {
			System.out.println("the number is not equals ");
		}
	}
}