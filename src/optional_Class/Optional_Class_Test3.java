package optional_Class;

import java.util.Optional;

public class Optional_Class_Test3 {

	public static void main(String[] args) {
		Optional<String> name = getName(2);
		Optional<String> optional=name.map(x->x.toUpperCase());
		optional.ifPresent(System.out::println);
	}
	static Optional<String> getName(int id) {
		return Optional.of("Rakesh");
	}
}
