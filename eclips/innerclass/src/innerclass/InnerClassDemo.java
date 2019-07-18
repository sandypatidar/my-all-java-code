package innerclass;
import java.util.*;
class A {
	public void m1(int n) {
		for (int i = 1; i <= 10; i++) {
			System.out.println("The table of "+n+" is:- "+n * i);
		}
	}
}
public class InnerClassDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the number \n");
		int n = sc.nextInt();
		A a = new A(){};
		a.m1(n);
		sc.close();
	}
}
