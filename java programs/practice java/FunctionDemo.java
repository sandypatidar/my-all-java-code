import java.util.function.*;
class Student {
	String name;
	int num;
	Student(String name, int num){
		this.name =name;
		this.num=num;
	}
}
class FunctionDemo{
	public static void main(String[] args) {
		Function<Student, String> f = s->{
			int marks = s.num;
			String grade="";
			if(marks>=80) grade ="A[Distinction]";
			else if(marks>=60) grade ="B[First Class]";
			else if(marks>=60) grade ="B[First Class]";
			else if(marks>=50) grade ="C[Second Class]";
			else if(marks>=35) grade ="D[Third Class]";
			else grade ="E[Failed]";
			return grade;
		};

		Student[] s = {new Student("durga",100),
						new Student("Sunny",65),
						new Student("Chinny",55),
						new Student("Bunny",45),
						new Student("vinny",25),
		};

		for (Student ss : s ) {
			System.out.println("Student name "+ss.name);
			System.out.println("Student name "+ss.num);
			System.out.println("Student Grade "+f.apply(ss));
			System.out.println();
		}
	}
}