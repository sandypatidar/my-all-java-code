public class Deadlock {
	public void m1() {
		synchronized(String.class) {
			System.out.println("Aquired lock on String.class object");


				synchronized(Integer.class){
					System.out.println("Aquired  lock on Integer.class object");
				}
			}		
		}
		public void m2() { 
			synchronized (Integer.class) {
				 System.out.println("Aquired lock on Integer.class object"); synchronized (String.class) { System.out.println("Aquired lock on String.class object"); 
				} 
			} 
		}
}