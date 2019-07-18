class MyThread extends Thread {
	public void start() {
		super.start();
		System.out.println("start method");
	}
	public void run() {
		System.out.println(">- hello");
		}
}
public class ThreadDemo {
	public static void main(String[] args) {
		MyThread t = new MyThread();
		//t.stop();
		t.start();
		System.out.println(">- world");
	}
}