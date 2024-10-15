package streams_additional_terminal_methods;

import java.util.Arrays;
import java.util.List;

public class To_Array_Method_Test {

	public static void main(String[] args) {
		List<Integer> list= Arrays.asList(1,2,3,4,5,6,7);
		Object[] arr=list.stream().toArray();
		System.out.println(Arrays.toString(arr));
	}

}
