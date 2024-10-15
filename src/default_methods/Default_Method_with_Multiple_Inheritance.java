package default_methods;

interface Left{
	default void fun() {
		System.out.println("Interface Left");
	}
}
interface Right{
	default void fun() {
		System.out.println("Interface Right");
	}
}

public class Default_Method_with_Multiple_Inheritance implements Left,Right {
	public void fun() {
		System.out.println("I am in child class");
		Left.super.fun();
		Right.super.fun();
	}
	public static void main(String[] args) {
		Default_Method_with_Multiple_Inheritance obj=new Default_Method_with_Multiple_Inheritance();
		obj.fun();
	}
}
