package newfeatures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MethodReferenceDemo3 {

	public static void main(String[] args) {
	
	Order ord1=new Order(1000, "GOOG.ns", 12000.1, Order.Side.BUY);
	Order ord2=new Order(500, "MS.ns", 5000, Order.Side.SELL);
	Order ord3=new Order(750, "MS.ns", 2000, Order.Side.BUY);
	
	List<Order> orderBook=new ArrayList<Order>();
	
	orderBook.add(ord1);
	orderBook.add(ord2);
	orderBook.add(ord3);
	
	//Sort all orders based on quantity using lambda
	System.out.println("Before Sorting: "+orderBook); //invokes toString() method
	
	Collections.sort(orderBook,(a,b)->Order.compareByQuantity(a, b));
	System.out.println("After Sorting: "+orderBook);
	
	//Sort all orders based on quantity using Method Reference by calling static method
	Collections.sort(orderBook,Order::compareByQuantity);
	System.out.println("---After Sorting: "+orderBook);
	
	//Sort all orders based on price using Method Reference by calling instance method
	Order order=orderBook.get(0); //we require reference of object
	Collections.sort(orderBook,order::compareByPrice);
	System.out.println("Order Book after Sorting by Price: "+orderBook);
	
	//method Reference example for arbitrary object of a particular type
	String[] symbols= {"GOOGLE","amazon","microsoft","APPLE"};
	Arrays.sort(symbols,String::compareToIgnoreCase);
	
	for(String i:symbols)
	System.out.println(i);
	
	}

}
