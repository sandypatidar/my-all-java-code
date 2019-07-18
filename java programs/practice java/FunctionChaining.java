import java.util.function.*;
class FunctionChaining {
	public static void main(String[] args) {
		Function<Integer, Integer> f1 = i->2*i;
		Function<Integer, Integer> f2 = i->i*i*i;
		System.out.println(f1.andThen(f2).apply(2));
		System.out.println(f2.andThen(f1).apply(2));
		System.out.println(f1.compose(f2).apply(2));
		System.out.println(f2.compose(f1).apply(2));
	}

}