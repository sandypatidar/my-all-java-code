package innerclass;
public class AnonemousDemo {
	public static void main(String[] args) {
		Thread t = new Thread() {
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println("child class");
				}
			}
		};
		t.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("main thread");
		}
	}

}
