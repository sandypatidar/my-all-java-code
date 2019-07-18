class MyRunnable  implements Runnable{
	public void run(){
		for (int i=0; i<10; i++) {
			System.out.println("Runnable method "+i);
		}
	}
}
class RunnableDemo {
	public static void main(String[] args) {
		MyRunnable r = new MyRunnable();
		Thread t = new Thread(r);
		Thread t1 = new Thread(r);
		t.start();
		t1.start();
		for (int i=0; i<10; i++) {
			System.out.println("main method "+i);
		}
	}
}