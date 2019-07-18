interface Interf {
	public void add(int a,int b);
}
class Test {
	public static void sum(int x,int y){
		System.out.println("sum is "+(x+y));
	}
	public static void main(String[] args) {
		Interf i = (a,b) ->System.out.println("sum is "+(a+b));
		i.add(10,20);

		Interf i1 = Test::sum;
		i1.add(100,200);
	}
}