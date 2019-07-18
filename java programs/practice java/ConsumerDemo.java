import java.util.function.*;
class ConsumerDemo{
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
		Predicate<Student> p =s->s.num>=60;

		Consumer<Student> c = ss->{
			System.out.println("Student name "+ss.name);
			System.out.println("Student name "+ss.num);
			System.out.println("Student Grade "+f.apply(ss));
			System.out.println();
		};
		
		Student[] s = {new Student("durga",100),
						new Student("Sunny",65),
						new Student("Chinny",55),
						new Student("Bunny",45),
						new Student("vinny",25),
		};
		for (Student s1:s ) {
			if(p.test(s1)) c.accept(s1);
		}
	}
}