package predefined_Functional_interface;

import java.util.function.BiConsumer;

/* 
interface BiConsumer<T,U>{
	void accept(T t,U u);
}
input==> 2 args
o/p==> no o/p
*/
public class BiConsumer_fun_interface {

	public static void main(String[] args) {
		BiConsumer<String,String> b=(s1,s2)->System.out.println(s1+" and "+s2+" Welcome");
		b.accept("Rakesh", "Roshan");
	}

}
