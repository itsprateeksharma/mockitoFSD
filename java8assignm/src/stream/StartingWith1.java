package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StartingWith1 {

	public static void main(String[] args) 
	{
		List<Integer> liItems=new ArrayList<Integer>();
		liItems.add(12);
		liItems.add(43);
		liItems.add(19);
		liItems.add(33);
		liItems.add(16);
		
		/*
		 * Stream<Integer> newlist=liItems.stream().filter(x->(x/10==1));
		 * newlist.forEach(System.out::println);
		 */
		
		//long newList=liItems.stream().filter((s)->s.startsWith("1")).collect(Collectors.toList());
		
		System.out.println("Numbers Starting with 1 :");
		liItems.stream().map(s->s +"").filter(s->s.startsWith("1")).forEach(System.out::println);
		
		

	}

}
