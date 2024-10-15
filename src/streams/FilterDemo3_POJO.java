package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Student{
	int rollno;
	String name;
	Student(int rollno,String name){
		this.rollno=rollno;
		this.name=name;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + "]";
	}
	
}
public class FilterDemo3_POJO {
	public static void main(String[] args) {
		List<Student> list=new ArrayList();
		list.add(new Student(10,"Raju"));
		list.add(new Student(12,"Rakesh"));
		list.add(new Student(14,"Roshan"));
		List<Student> res=list.stream().filter(s->s.rollno>10).collect(Collectors.toList());
		System.out.println(res);
	}
}
