package map;
import java.util.*;
public class HAshTableDemo {
	public static void main(String[] args) {
		Hashtable ht = new Hashtable();//initial capacity = 11
		ht.put(new Temps(5), "A");
		ht.put(new Temps(2), "B");
		ht.put(new Temps(6), "C");
		ht.put(new Temps(15),"D");
		ht.put(new Temps(23),"E");
		ht.put(new Temps(16),"F");
		System.out.println(ht);
	}
}
class Temps {
	int i;
	Temps(int i){
		this.i=i;
	}
	public int hashCode() {
		return i%24;
	}
	public String toString() {
		return i+"";
	}
}
