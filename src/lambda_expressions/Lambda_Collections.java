package lambda_expressions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Lambda_Collections {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		
		Comparator<Integer> c=(i1,i2)->{
			if(i1<i2) {
				return -1;
			}else if(i1>i2) {
				return 1;
			}else {
				return 0;
			}
		};
		
		list.add(12);
		list.add(10);
		list.add(19);
		list.add(2);
		Collections.sort(list,c);
		System.out.println(list);
	}

}
