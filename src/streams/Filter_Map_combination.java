package streams;

import java.util.Arrays;
import java.util.List;

class Emp{
	int eid;
	String name;
	int sal;
	public Emp(int eid, String name, int sal) {
		this.eid = eid;
		this.name = name;
		this.sal = sal;
	}
	
}
public class Filter_Map_combination {
	public static void main(String[] args) {
		List<Integer> numList=Arrays.asList(1,2,3,4,5,6,7,8);
		//filtering all even numbers that are greater than 2 and 
		List<Emp> empList=Arrays.asList(
				new Emp(10,"Rakesh",1000),
				new Emp(12,"Roshan",2000)
				);
		empList.stream().filter(e->e.sal>500).map(e->e.sal*10).forEach(System.out::println);
		
		
		
		
	}
}
