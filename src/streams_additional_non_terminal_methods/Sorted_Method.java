package streams_additional_non_terminal_methods;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sorted_Method {

	public static void main(String[] args) {
		List<Integer> list= Arrays.asList(4,5,6,7,1,2,3);
		
		//ascending order
		List<Integer> res=list.stream().sorted().collect(Collectors.toList());
		System.out.println(res);
		
		//descending order
		List<Integer> res2=list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(res2);
	}

}
