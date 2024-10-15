package collectors_class;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitioningBy_Test {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8,12);
		Map<Boolean, List<Integer>> obj = list.stream().collect(Collectors.partitioningBy(x->x%2==0));
		System.out.println(obj);
	}

}
