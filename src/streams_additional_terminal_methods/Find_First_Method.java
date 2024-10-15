package streams_additional_terminal_methods;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Find_First_Method {

	public static void main(String[] args) {
		List<String> list=Arrays.asList("Apple","Mango","Guava","Grapes");
		Optional<String> res=list.stream().findFirst();
		System.out.println(res.get());
	}

}
