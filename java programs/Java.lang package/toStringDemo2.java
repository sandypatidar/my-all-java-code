class Student {
	String name;
	int rollNo;
	Student(String name, int rollNo){
		this.name = name ;
		this.rollNo = rollNo;
	}
	// over define toString method in object class type is following 
	public String toString() {
		// return name+" ... "+rollNo;
		return "this is student with the name: "+name +" and rollno: "+rollNo;
	}
	public static void main(String[] args) {
		Student s1 = new Student("durga", 101);
		Student s2 = new Student("ravis", 102);
		System.out.println(s1);
		System.out.println(s1.toString());
		System.out.println(s2);
	}

}