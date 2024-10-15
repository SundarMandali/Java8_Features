package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo1 {

	public static void main(String[] args) {
		//method 1 using Collectors
		List<Integer> list=Arrays.asList(2,3,4,5,6,7);		
		List<Integer> res=list.stream().filter(n->n%2==0).collect(Collectors.toList());
		System.out.println(res);
		//method 2 using for-each
		list.stream().filter(n->n%2==0).forEach(n->System.out.println(n));
		//method 3 using ::
		list.stream().filter(n->n%2==0).forEach(System.out::println);
		
	}

}
