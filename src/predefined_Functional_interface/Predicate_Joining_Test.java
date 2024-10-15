package predefined_Functional_interface;

import java.util.function.Predicate;

//p1.and(p2).test()
//p1.or(p2).test()
//p1.negate().test()
public class Predicate_Joining_Test {

	public static void main(String[] args) {
		Predicate<Integer> p1=(n)->n%2==0;
		Predicate<Integer> p2=(n)->n>5;
		
		int[] arr= {1,2,3,4,5,6,7,8,9};
		for(int num:arr) {
			if(p1.negate().test(num) ) {//p1.and(p2).test(num),p1.or(p2).test(num)
				System.out.println(num);
			}
		}
		
		
	}

}
