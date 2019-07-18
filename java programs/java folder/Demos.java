import java.util.function.*;
class Demos {
	public static void main(String[] args) {
		Function<Integer, Integer> f1 = (a) -> (a*2);
		Function<Integer, Integer> f2 = i->i*i*i;
		System.out.println(f1.andThen(f2).apply(2));
		System.out.println(f1.compose(f2).apply(2));

		Consumer<String> c = s -> System.out.println("student name is "+s);
		c.accept("jitendra");
	}
}