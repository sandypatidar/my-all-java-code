
//method returns an object then we will go for ConstructorReference 
class Sample{
	Sample(){
		System.out.println("Sample class Constructor Execution...");
	}
	Sample(String s){
		System.out.println("Sample class Constructor with argument Execution...");
	}
}
interface Interf { 
	public Sample get(String s);
}
class Test {
	public static void main(String[] args) {
		Interf i = Sample::new;
		Sample s2=i.get("sandeep");
	}
}