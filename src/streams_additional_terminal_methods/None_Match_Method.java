package streams_additional_terminal_methods;

import java.util.Arrays;
import java.util.List;

public class None_Match_Method {

	public static void main(String[] args) {

		List<String> list=Arrays.asList("Apple","Mango","Guava","Grapes");
		boolean res=list.stream().noneMatch(x->x.startsWith("Z"));
		System.out.println(res);
	}

}
