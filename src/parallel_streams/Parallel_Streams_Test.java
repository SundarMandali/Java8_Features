package parallel_streams;

import java.util.Arrays;
import java.util.List;

public class Parallel_Streams_Test {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		//using normal stream
		list.stream().filter(x->x%2==0).forEach(System.out::println);
		
		//using parallel stream
		list.parallelStream().filter(x->x%2==0).forEach(System.out::println);
		
		//converting normal stream to parallel stream using parallel() method
		list.stream().parallel().filter(x->x%2==0).forEach(System.out::println);
		}

}
