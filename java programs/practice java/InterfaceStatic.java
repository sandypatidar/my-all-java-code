interface Inter {
	public static void m1(){
		System.out.println("Interface static method");
	}
}
class InterfaceStatic {
	public static void main(String[] args) {
			Inter.m1();
		}	
}