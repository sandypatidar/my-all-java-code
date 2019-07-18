class Test {
	public static void m1(){
		for (int i=0; i<5; i++) {
			System.out.println("child thread");
		}
	}
	public static void m3(int s){
		for (int i=0; i<5; i++) {
			System.out.println("child thread");
		}
	}
	public static void main(String[] args) {
		Runnable r = Test::m1;
		Thread t = new Thread(r);
		t.start();
		Runnable rs = Test::m3;
		Thread ts = new Thread(rs);
		ts.start();
		Test tt = new Test();
		Runnable rr = tt::m2;
		Thread y = new Thread(rr);
		y.start();

		for (int i=0;	i<5;i++ ) {
			System.out.println("main thread");	
		}
	}

	public void m2(){
		for (int i=0; i<5; i++) {
			System.out.println("non-static method thread");
		}
	}

}
//Static method :-- class name::method name
//Static method :-- Object reference::method name