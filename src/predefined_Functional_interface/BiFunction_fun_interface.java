package predefined_Functional_interface;
/*
interface BiFunction<T,U,R>{
	public R apply(T t,U u);
}
input==> 2 arguments
o/p: 1 argument
*/

import java.util.function.BiFunction;

public class BiFunction_fun_interface {

	public static void main(String[] args) {
		BiFunction<Integer,Integer,Integer> f=(num1,num2)->num1*num2;
		System.out.println(f.apply(2, 4));
	}

}
