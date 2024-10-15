package streams_additional_terminal_methods;

import java.util.Arrays;
import java.util.List;

public class Reduce_Method {

	public static void main(String[] args) {
		List<Integer> list= Arrays.asList(1,2,3,4,5,6,7);
		Integer res=list.stream().reduce(0,(x,y)->x+y);
		System.out.println(res);
	}

}
