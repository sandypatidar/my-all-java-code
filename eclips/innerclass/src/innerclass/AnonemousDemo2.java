package innerclass;
// anonemous inner class define in arguments  
public class AnonemousDemo2 {
	public static void main(String[] args) {
		Thread t = new Thread(new Runnable() {
				public void run() {
					for (int i = 0; i < 10; i++) {
						System.out.println("child thread");
					}
				}
			});
		t.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("main thread");
		}
	}

}
