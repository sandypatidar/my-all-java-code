package practic;
import java.util.Scanner;
public class BinaryToDecimal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please  enter the binary number");
		int num = sc.nextInt(),j=1,rem,dn = 0;
		while(num>0) {
			rem = num%10;
			dn = dn + rem*j;
			j = j*2;
			num = num/10;
		}
		System.out.println("the binary number is : "+ dn);
		sc.close();
	}

}
