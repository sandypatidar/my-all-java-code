class Demos {
	public boolean equals(Object obj) {
		if(obj instanceof Demos) {
			Demos d = (Demos)obj;
			if(name.equals(d.name)&& age == d.age) {
				return true;
			}
			else { return false;}
		}
		return false;
	}
	public static void main(String[] args) {
		
	}
}

public native Object clone() throws CloneNotSupportedException
