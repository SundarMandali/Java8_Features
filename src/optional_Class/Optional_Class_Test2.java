package optional_Class;

import java.util.NoSuchElementException;
import java.util.Optional;

public class Optional_Class_Test2 {

	public static void main(String[] args) {
		Optional<String> name=getName(2);
//		String nameTobeUsed=name.isPresent()?name.get():"NA";
//		String nameTobeUsed=name.orElse("NA");
//		String nameTobeUsed=name.orElseGet(()->"NA");
		String nameTobeUsed=name.orElseThrow(()->new NoSuchElementException());
		
		System.out.println(nameTobeUsed);
	}
	static Optional<String> getName(int id) {
		return Optional.empty();
	}
}
