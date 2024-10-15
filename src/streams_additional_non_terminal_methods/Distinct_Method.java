package streams_additional_non_terminal_methods;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Distinct_Method {

	public static void main(String[] args) {
		List<Integer> list= Arrays.asList(1,2,1,3,4,5,3,6,7,4);
		//using distinct method
		List<Integer> res=list.stream().distinct().collect(Collectors.toList());
		System.out.println(res);
		//using forEach
		list.stream().distinct().forEach(System.out::println);
	}

}
