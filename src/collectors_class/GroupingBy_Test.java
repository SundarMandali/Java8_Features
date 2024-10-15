package collectors_class;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingBy_Test {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8,12);
		
		Map<String, List<Integer>> obj = list.stream().collect(Collectors.groupingBy(x->x%2==0?"Even":"Odd"));
		System.out.println(obj);
	}

}
