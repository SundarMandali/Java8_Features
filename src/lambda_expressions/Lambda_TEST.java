package lambda_expressions;

//@FunctionalInterface
interface Inter1{
	int add(int a,int b);
}
public class Lambda_TEST {

	public static void main(String[] args) {
		Inter1 inter1=(a, b)->{
			System.out.println(a+b);
			return a+b;
		};	
		inter1.add(1, 2);
	}
}
