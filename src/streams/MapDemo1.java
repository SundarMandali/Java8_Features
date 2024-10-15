package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo1 {

	public static void main(String[] args) {
		List<String> list= Arrays.asList("apple","mango","carrot","raddish");
		
		//using Collectors
		List<String> res=list.stream().map(x->x.toUpperCase()).collect(Collectors.toList());
		System.out.println(res);
		
		//using forEach lambda
		list.stream().map(x->x.toUpperCase()).forEach(x->System.out.println(x));
		
		//using method reference
		list.stream().map(x->x.toUpperCase()).forEach(System.out::println);
		
		//another example to convert elements of list into multiple of 10
		List<Integer> numList=Arrays.asList(1,2,3,4);
		numList.stream().map(x->x*10).forEach(System.out::println);
		
		
	}

}
