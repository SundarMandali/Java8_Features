package lambda_expressions;

public class Anonymous_InnerClass_MultiThreading {

	public static void main(String[] args) {
		Runnable r=new Runnable() {
			public void run() {
				for(int i=0;i<10;i++) {
					System.out.println("Child Thread");
				}
			}
		};
		//here an anonymous class is implementing Runnable Interface
		Thread t=new Thread(r);
		t.start();
			for(int i=0;i<10;i++) {
				System.out.println("Main Thread");
			}
		
	}

}
