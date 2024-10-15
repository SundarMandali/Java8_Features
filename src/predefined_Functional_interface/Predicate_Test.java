package predefined_Functional_interface;

import java.util.ArrayList;
import java.util.function.Predicate;

//A predicate is a predefined functional interface used for conditional checks
//input:Can be anything
//output: boolean

/*
interface Predicate<T>{
	public boolean test(T t)
}*/
class Student{
	int rollno;
	String name;
	public Student(int rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
	}
}
public class Predicate_Test {

	public static void main(String[] args) {
		Predicate<Integer> p=(n)->n%2==0; //for checking even number or not
		System.out.println(p.test(22));
		Predicate<String> p2=(s)->s.length()>5;
		String[] str= {"apple","orange","guava","mango","pineapple"};
		for(String s:str) {
			if(p2.test(s)) {
				System.out.print(s+" ");
			}
		}
		System.out.println();
		ArrayList<Student> list=new ArrayList();
		list.add(new Student(1, "Raju"));
		list.add(new Student(2, "Ramesh"));
		list.add(new Student(3, "Rakesh"));
		list.add(new Student(4, "Raj"));
		Predicate<Student> p3=e->e.rollno>2;
		for(Student e:list) {
			if(p3.test(e)) {
				System.out.println(e.rollno+" "+e.name);
			}
		}
	}

}
