import java.util.function.*;
import java.util.Date;
class Test {
	public static void main(String[] args) {
		Supplier<Date> s1=()->new Date();
		System.out.println(s1.get());

		Supplier<String> s=()->{
			String otp="";
			for (int i=0; i<6; i++) {
				otp +=(int)(Math.random()*10);
			}
			return otp;
		};
		System.out.println(s.get());
	}
} 