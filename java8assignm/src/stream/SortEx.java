package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SortEx {

	public static void main(String[] args) {
		
		List<Integer> liItems=new ArrayList<Integer>();
		liItems.add(12);
		liItems.add(43);
		liItems.add(190);
		liItems.add(33);
		liItems.add(16);
		
		List<Integer> sList= liItems.stream().sorted().collect(Collectors.toList());
		
		System.out.println("Sorted Array:");
		System.out.println(sList);
		

	}

}
