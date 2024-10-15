package constructor_Reference;
class Student{
	int rollno;
	String name;
	Student(){
		System.out.println("Inside Student Constructor");
	}
}
interface interf1{
	Student get();
}
public class Constructor_Reference_TEST {

	public static void main(String[] args) {
		interf1 i1=Student::new;
		Student s1=i1.get();
	}

}
