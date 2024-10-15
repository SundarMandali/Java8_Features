package static_method;

interface A{
	static  void fun() {
		System.out.println("Static method in interface");
	}
}

public class Static_Method_Test {

	public static void main(String[] args) {
		A.fun();//invocation
	}

}
