package newfeatures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* 
 * forEach() Method In Iterable Interface
Java 8 has introduced a “forEach” method in the interface java.lang.Iterable that can 
iterate over the elements in the collection. “forEach” is a default method defined in 
the Iterable interface. It is used by the Collection classes that extend the Iterable 
interface to iterate elements.



The “forEach” method takes the Functional Interface as a single parameter i.e. you can pass Lambda Expression as an argument.
 */
public class ForEachDemo {

	public static void main(String[] args) {
		
		List<String> languages=new ArrayList<String>(); //declare Arraylist
		
		languages.add("Java");
		languages.add("Python");
		languages.add("C#");
		languages.add("Scala");
		languages.add("Ruby");
		languages.add("C++");
		
		System.out.println("***********Programming Languages***********");
		languages.forEach(i ->System.out.println(i));
		
		System.out.println("********Print element using method reference************");
		languages.forEach(System.out::println);
		
		
		
		Map<Integer,String> customer=new HashMap<Integer, String>();
		
		customer.put(101, "Alec");
		customer.put(102, "Brok");
		customer.put(103, "Rock");
		customer.put(104, "John");
		customer.put(105, "jess");
		
		System.out.println("--------Customer Account no. & Name-------");
		customer.forEach((k,v) -> System.out.println("Key= "+k +"  ---- Value= "+v));
		
		ArrayList<Integer> arrL = new ArrayList<Integer>();
		arrL.add(61);
		arrL.add(29);
		arrL.add(34);
		arrL.add(42);
		
		Collections.sort(arrL);
		System.out.println("***********ArrayList Contents***********");
		arrL.forEach(i ->System.out.println(i));
		
		//use lambda expr to print even numbers in arraylist
		System.out.println("-------even numbers in arraylist----------");
		arrL.forEach(n->{ if(n%2==0) System.out.println(n);});
	}

}
