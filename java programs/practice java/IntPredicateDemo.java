import java.util.function.*;
class IntPredicateDemo {
	public static void main(String[] args) {
		int x[] ={0,5,10,15,20,25,30,35,40};
		IntPredicate p =i->i%2==0;
		//LogPredicate, DoublePredicate..
		for (int x1:x ) {
			if (p.test(x1)) {
				
			System.out.println(x1);
			}
		}
		//DoubleFunction -> input is double type and return any type
		//LongFinction -> input type is long and return any type
		//IntFuncrion ->int type input and return any type
		//DoubleToIntFunction -> input type is double and return type int ==> method is applyAsInt();
		//DoubleToLongFunction -> input type is double and return type long ==> method is applyAsLong();
		//IntToDouble() -> method is applyAsDouble();
		//IntToLong() -> applyAsLong()
		//LongToInt() -> applyAsInt()
		//LongToDouble() -> applyAsDouble()
		//ToDoubleFunction() ->>
		//ToIntFunction() ->>
		//ToLongFunction() ->>

		IntToDoubleFunction f=i->Math.sqrt(i);
			System.out.println(f.applyAsDouble(9));




		//DoubleConsumer -> accept double value ==> method : accept()
		//LongConsumer -> accept long value ==> method : accept()
		//IntConsumer -> accept int value ==> method : accept()


		//ObjDoubleConsumer<T> -> first input any type and other is double type
		//ObjLongConsumer<T> -> first input any type and other is long type
		//ObjIntConsumer<T> -> first input any type and other is int type
	}
}