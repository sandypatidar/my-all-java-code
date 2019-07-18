import java.util.Scanner;
class Example{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		if(x>y){
			int z=x;
			for (int i=1; i<=y;i++ ) {
				if(z%y==0) {
					System.out.println("lcm is "+ z);
					break;
				}
				z = i*x;
			}
		}
		else if(y>x){
			int z = y;
			for (int i=1; i<=y;i++ ) {
				if(z%x==0) {
					System.out.println("lcm is "+ z);
					break;
				}
				z = i*y;
			}
		}
		else {
			System.out.println("the lcm is "+x);
		}
	}
}