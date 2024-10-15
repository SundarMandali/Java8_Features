package predefined_Functional_interface;

import java.util.function.Function;

/*
interface Function<T,R>{
	public R apply(T t);
}*/
public class Function_func_Interface {

	public static void main(String[] args) {
		Function<String,Integer> f=(s)->s.length();
		
		System.out.println(f.apply("Apple"));
		
	}

}
