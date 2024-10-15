package lambda_expressions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee{
	int eid;
	String ename;
	Employee(int eid,String ename){
		this.eid=eid;
		this.ename=ename;
	}
	public String toString() {
		return eid+" "+ename;
	}
}
public class Lambda_POJO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Comparator<Employee> c=(e1,e2)->{
//			if(e1.eid<e2.eid) {
//				return -1;
//			}else if(e1.eid>e2.eid) {
//				return 1;
//			}else {
//				return 0;
//			}
//		};
		Employee e1=new Employee(12,"Sundar");
		Employee e2=new Employee(21,"Rakesh");
		Employee e3=new Employee(1,"Raju");
		ArrayList<Employee> list=new ArrayList();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		Collections.sort(list,( obj1, obj2)->obj1.ename.compareTo(obj2.ename));
		System.out.println(list);
		
	}

}
