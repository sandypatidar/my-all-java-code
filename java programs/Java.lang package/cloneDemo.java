class cloneDemo /*implements Cloneable*/ {
	int i = 10;
	int j = 20;
	public static void main(String[] args) /*throws CloneNotSupportedException */{
		cloneDemo t1 = new cloneDemo();
		cloneDemo t2 = new cloneDemo();
		// cloneDemo t2 = (cloneDemo)t1.clone();
		t2.i = 888;
		t2.j = 999;
		System.out.println(t1.i+" ... "+t1.i);
		System.out.println(t2.i+" ... "+t2.j);
	}
}