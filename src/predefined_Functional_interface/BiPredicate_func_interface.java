package predefined_Functional_interface;

import java.util.function.BiPredicate;

/* If there are two inputs and it is also for conditional checking
interface BiPredicate<T1,T2>{
	public boolean test(T1 t1,T2 t2);
}
*/
public class BiPredicate_func_interface {

	public static void main(String[] args) {
		//check the sum of 2 numbers is even or not
		BiPredicate<Integer ,Integer> p=(num1,num2)->(num1+num2)%2==0;
		System.out.println(p.test(2, 4));
		
	}

}
