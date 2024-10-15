package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo2 {

	public static void main(String[] args) {
		List<String> fruitsList= Arrays.asList("Apple","Guava","Mango","Grapes");
		List<String> filterRes=fruitsList.stream().filter(s->s.length()>5).collect(Collectors.toList());
		System.out.println(filterRes);
		
		List<String> list=Arrays.asList("cup",null,"gem","soap",null,"boat");
		list.stream().filter(s->s!=null).forEach(System.out::println);
	}

}
