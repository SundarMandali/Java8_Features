package streams;

import java.util.Arrays;
import java.util.List;

public class FlatMap_Map_Combination {

	public static void main(String[] args) {
		List<Integer> list1=Arrays.asList(1,2,3);
		List<Integer> list2=Arrays.asList(4,5,6);
		List<Integer> list3=Arrays.asList(7,8,9);
		
		List<List<Integer>> finalList=Arrays.asList(list1,list2,list3);
		finalList.stream().flatMap(x->x.stream()).map(x->x*10).forEach(System.out::println);
		
	}

}
