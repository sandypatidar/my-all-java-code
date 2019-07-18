import java.util.function.*;
class IntFunctonDemo{
	public static void main(String[] args) {
		int n=5;
		String str ="hello sandeep patidar";
		Function<Integer,Integer> f = i->i*i;
		System.out.println("Square of '"+n+"' is "+f.apply(n));

		Function<String ,Integer> f1 = s->s.length();
		System.out.println("the length of '"+str+"' is "+f1.apply(str));

		Function<String, String> f2 = s->s.toUpperCase();
		System.out.println("the upper case of '"+str+"' is "+f2.apply(str));
	}

}