import java.lang.reflect.*;
class ObjectDemo {
	public static void main(String[] args) throws Exception {
		int count =0;
		Class c = Class.forName("java.lang.Object");
		Method[] m = c.getDeclaredMethods();
		for (Method m1:m) {
			count ++;
			System.out.println(m1.getName());
		}
		System.out.println("the Number of method in object class "+count);
	} 
}