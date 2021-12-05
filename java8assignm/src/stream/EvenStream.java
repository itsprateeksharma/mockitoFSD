package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EvenStream {
	
	public static void main(String args[])
	{
		List<Integer> liItems=new ArrayList<Integer>();
		liItems.add(12);
		liItems.add(43);
		liItems.add(90);
		liItems.add(33);
		liItems.add(16);
		
		
		Stream<Integer> strm=liItems.stream();
		
		List<Integer> gradesEven=strm.filter(i->i%2==0).collect(Collectors.toList());
		System.out.println("Even Numbers in the List:");
		System.out.println(gradesEven);
		
		
		
		
		
	}
	

}
