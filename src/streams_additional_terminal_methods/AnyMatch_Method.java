package streams_additional_terminal_methods;

import java.util.Arrays;
import java.util.List;

public class AnyMatch_Method {

	public static void main(String[] args) {
		List<String> list=Arrays.asList("Apple","Mango","Guava","Grapes");
		boolean res=list.stream().anyMatch(x->x.startsWith("A"));
		System.out.println(res);
		
		
	}

}
