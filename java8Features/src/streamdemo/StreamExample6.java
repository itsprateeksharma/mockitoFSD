package streamdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
 * The Collectors class in Java 8 provides methods for grouping 
 * and partitioning data stored in collections.

Grouping permits you to organize data that shares a common field
 value, e.g. department. 
 
 Partitioning allows you to divide the data
  into two categories, or partitions.
One partition satisfies the partitioning criteria whereas the 
other partition does not.
For example, we might separate sales data into a partition that met
 or exceeded a sales goal and a partition that did not.
 */

//java program to Group & Partition Collectors
public class StreamExample6 {

	private static List<MusicalInstruments> musicalInstruments=new ArrayList<>();
	static {
	musicalInstruments.add(new MusicalInstruments("Trumpet","brass",299.99));
	musicalInstruments.add(new MusicalInstruments("Tuba","brass",1149.0));
	musicalInstruments.add(new MusicalInstruments("Timpani","percussion",2339.0));
	musicalInstruments.add(new MusicalInstruments("Snare drum","percussion",325.00));
	musicalInstruments.add(new MusicalInstruments("Piano","keyboard",5179.99));
	musicalInstruments.add(new MusicalInstruments("Trombone","brass",775.79));
	
	
	}
	
	public static void main(String[] args) {
		
		System.out.println("---------Musical Instruments in Collection----------");
		//musicalInstruments.stream().forEach(i->System.out.println(i));
		
		musicalInstruments.stream().forEach(i->System.out.println(i.getName()+" "+i.getType()+" "+i.getPrice()));
		
		System.out.println("_________Group Instruments by Type:___________");
		Map<String, List<MusicalInstruments>> typeMap=musicalInstruments.stream().collect(Collectors.groupingBy(MusicalInstruments::getType));
		
		typeMap.forEach((key,value)->{
			System.out.println(key);
			value.forEach(System.out::println);
		});
		
		System.out.println("_________Partition Instruments by Price:___________");
		Map<Boolean, List<MusicalInstruments>> priceMap=musicalInstruments.stream().collect(Collectors.partitioningBy(mi->mi.getPrice()>500.0));
		
		priceMap.forEach((key,value)->{
			System.out.println((key? "Expensive":"Affordable"));
		value.forEach(i->System.out.println(i.getName()+" "+i.getType()+" "+i.getPrice()));});
		}
		
		
		
		
	}


