package streams_additional_terminal_methods;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
//same with the case of max method
public class Min_Method {

	public static void main(String[] args) {
		List<Integer> list= Arrays.asList(1,2,1,3,4,5,3,6,7,4);
		//using comparator
		Optional<Integer> op1=list.stream().min((x,y)->x.compareTo(y));
		System.out.println(op1.get());
		
		//using method reference here compare is method from Integer class and this is used for comparision
		Optional<Integer> op2=list.stream().min(Integer::compare);
		System.out.println(op2.get());
	}

}
