package streams_additional_non_terminal_methods;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Limit_Method {

	public static void main(String[] args) {
		List<Integer> list= Arrays.asList(1,2,1,3,4,5,3,6,7,4);
		List<Integer> finallist=list.stream().limit(3).collect(Collectors.toList());
		System.out.println(finallist);
	}

}
