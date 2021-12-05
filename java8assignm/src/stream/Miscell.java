package stream;

import java.util.ArrayList;
import java.util.List;

public class Miscell {

	public static void main(String[] args) {

		List<Integer> liItems=new ArrayList<Integer>();
		liItems.add(12);
		liItems.add(43);
		liItems.add(190);
		liItems.add(33);
		liItems.add(16);
		
		//maximum in list
		int maxItem=liItems.stream().max((i,j)-> i>j ? 1:-1).get();
		System.out.println("Maximum Element  : "+maxItem);
		
		//minimum in list
		int minItem=liItems.stream().min((i,j)-> i>j ? 1:-1).get();
		System.out.println("Minimum Element  : "+minItem);
		
		//average of list elements
		int avg=liItems.stream().reduce(0,(sum,i)->sum+i);
		System.out.println("Sum :"+avg);
		System.out.println("Average: "+avg/liItems.stream().count());
		
	}

}
