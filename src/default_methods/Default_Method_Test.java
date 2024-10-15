package default_methods;
//without effecting implementations classes if we want to add new method to the interface==>Default method is used
//if u want u can override the default method in implementation class or u can also ignore it
interface A{
	void m1();
	default void fun() {
		System.out.println("Interface A");
	}
}


class C implements A{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("In class C");
	}
	@Override
	public void fun() {
		// TODO Auto-generated method stub
		System.out.println("Over riding default method");
	}
	
}

public class Default_Method_Test {

	public static void main(String[] args) {
		C obj=new C();
		obj.m1();
		obj.fun();
	}
}
