import java.util.function.*;
class Movie {
	String name;
	Movie(String name) {
		this.name = name;
	}
}
class BiPredicateDemo {
	public static void main(String[] args) {
		Consumer<Movie> c0 = m -> System.out.println(m.name+" ready to release");	
		Consumer<Movie> c1 = m -> System.out.println(m.name+" released but its bigger flop");	
		Consumer<Movie> c2 = m -> System.out.println(m.name+" nice movie");	
		Consumer<Movie> c3 = c0.andThen(c1).andThen(c2);
		Movie m = new Movie("spider");
		c3.accept(m);
	}
}