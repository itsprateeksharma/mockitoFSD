package stream;

import java.util.ArrayList;
import java.util.List;

public class Count {

	public static void main(String[] args) {
		
		List<Integer> liItems=new ArrayList<Integer>();
		liItems.add(12);
		liItems.add(43);
		liItems.add(190);
		liItems.add(33);
		liItems.add(16);
		
		int flag=(int) liItems.stream().count();
		System.out.println("Total items in list are :"+flag);

	}

}
