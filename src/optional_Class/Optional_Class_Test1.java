package optional_Class;

import java.util.Optional;

public class Optional_Class_Test1 {

	public static void main(String[] args) {
		Optional<String> name = getName(1);
		if(name.isPresent()) {
			System.out.println("name is present");
		}
		name.ifPresent(System.out::println);
	}
	static Optional<String> getName(int id){
		String name=null;
		return Optional.ofNullable(name);
	}

}
