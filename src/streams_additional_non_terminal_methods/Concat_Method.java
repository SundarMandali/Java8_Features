package streams_additional_non_terminal_methods;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Concat_Method {

	public static void main(String[] args) {
		List<String> list1=Arrays.asList("Apple","Mango");
		List<String> list2=Arrays.asList("Guava","Grapes");
		
		Stream<String> stream1=list1.stream();
		Stream<String> stream2=list2.stream();
		Stream<String> combinedstream=Stream.concat(stream1,stream2);
		
		List<String> res=combinedstream.collect(Collectors.toList());
		System.out.println(res);
	}

}
