/* 
PreDefine functional Interface :-
1. Predicate<T> --->boolean type 
conditional checks 
only One Abstract Method(OAM).
public abstract boolean test(T t);
2. Function<T,R> ---> R type 
return int type or ant type used
Function  interface function<T,R> {
	public abstract R apply(T t);
}

3. Consumer --> Consumer<T>  ---> void 
interface Consumer<T> {
	public void accept(T t);
}
4. Supplier  ---> Supplier<R> -->R type
no input give to supplier
interface Supplier {
	public R get();
}

Two arguments Predefine Interface:-
1. BiPredicate
2. BiFunation
3. BiConsumer

primitive Functional Interface
1. IntPredicate
2. IntFunation
3. IntConsumer
....... java.util.function 
*/
import java.util.function.*;
interface InterfaceMain {
	// public static void main(String[] args) {
	// 	System.out.println("main method in interface");
	// this is also valid }
	//public abstract boolean test(Integer i);

}
class PreDefineFunctionalIntrafaces {
	public static void main(String[] args) {
		// PreDefineFunctionalIntrafaces p = new PreDefineFunctionalIntrafaces();
		Predicate<Integer> p1=i->i%2==0;
		System.out.println(p1.test(10));
		System.out.println(p1.test(15));
	}
}