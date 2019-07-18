interface Runs {
	public void run();
	public void start();
}
class RunnableThread  implements Runs{
	public void run(){
		for (int i=0; i<10; i++) {
			System.out.println("Runnable method "+i);
		}
	}
}
class RunnableDemo {
	public static void main(String[] args) {
		RunnableThread r = new RunnableThread();
		Thread t = new Thread(r);
		t.start();
		// for (int i=0; i<10; i++) {
		// 	System.out.println("main method "+i);
		// }
	}
}