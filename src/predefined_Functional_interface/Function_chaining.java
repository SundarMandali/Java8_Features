package predefined_Functional_interface;

import java.util.function.Function;

/*
 ==>first f1 and then followed by f2
 f1.andThen(f2).apply()
==>first f2 and then followed by f1
f1.compose(f2).apply()
 */
public class Function_chaining {

	public static void main(String[] args) {
		Function<Integer,Integer> f1=(n)->2*n;
		Function<Integer,Integer> f2=(n)->10+n;
		System.out.println(f1.andThen(f2).apply(2));
		System.out.println(f1.compose(f2).apply(2));
	}

}
