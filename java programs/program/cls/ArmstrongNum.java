import java.util.Scanner;
public class ArmstrongNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the number");
		int num = sc.nextInt();
		int c = 0,a;
		int temp = num;
		while(num>0){
			a = num % 10;
			num = num / 10;
			c = c+(a*a*a);
		}
		if(c == temp) {
			System.out.println("the number is Armstrong");
		}
		else {
			System.out.println("the number is not Armstrong");
		}
	}
}