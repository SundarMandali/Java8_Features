package method_Reference;
interface Interef1{
	void add(int a,int b);
}
interface Interef2{
	void multiply(int a,int b);
}
public class Method_Reference_TEST {
	static void sum(int a,int b) {
		System.out.println(a+b);
	}
	void product(int a,int b) {
		System.out.println(a*b);
	}
	public static void main(String[] args) {
		Interef1 i1=Method_Reference_TEST::sum;//static method reference
				i1.add(100, 200);
				
		Method_Reference_TEST obj=new Method_Reference_TEST(); 	//object method reference
		Interef2 i2=obj::product;
		i2.multiply(12,3);
	}

}
