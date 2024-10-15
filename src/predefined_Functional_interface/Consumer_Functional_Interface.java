package predefined_Functional_interface;
import java.util.function.Consumer;
/*
interface Consumer<T>{
	void accept(T t);
}
*/
public class Consumer_Functional_Interface {

	public static void main(String[] args) {
		Consumer<String> c=s->System.out.println(s);
		c.accept("Sundar");
	}

}
