package predefined_Functional_interface;
import java.util.function.Consumer;
public class Consumer_Chaining {

	public static void main(String[] args) {
		Consumer<String> c1=(s)->System.out.println("1st consumer "+s);
		Consumer<String> c2=(s)->System.out.println("2nd consumer "+s);
		c1.andThen(c2).accept("welcome");	
	}

}
