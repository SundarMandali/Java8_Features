package streams_additional_terminal_methods;

import java.util.Arrays;
import java.util.List;

public class Count_Method {

	public static void main(String[] args) {
		
		List<Integer> list= Arrays.asList(1,2,1,3,4,5,3,6,7,4);
		//using distinct method
		long res=list.stream().distinct().count();
		System.out.println(res);
	}

}
