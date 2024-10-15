package predefined_Functional_interface;
import java.util.Date;
import java.util.function.*;

/*==>There is only output but no input 
interface Supplier<R>{
	public R get();
}
*/
public class Supplier_func_Interface {

	public static void main(String[] args) {
		Supplier<String> s=()->"Welcome";
		System.out.println(s.get());
		
		Supplier<Date> d=()->new Date();
		System.out.println(d.get());
		
	}

}
