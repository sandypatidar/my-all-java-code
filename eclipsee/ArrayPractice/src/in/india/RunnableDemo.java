package in.india;
class MyRunnable implements Runnable {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("hello it's me");
		}
	}
}
public class RunnableDemo {

	public static void main(String[] args) {
		MyRunnable mr = new MyRunnable();
		Thread t = new Thread(mr);
		t.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("yes i know you");
		}

	}

}
