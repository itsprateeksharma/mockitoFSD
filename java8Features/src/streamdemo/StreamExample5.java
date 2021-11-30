package streamdemo;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample5 {

	public static void main(String[] args) {
		//limit function
		//iterate --used to define infinite sequential stream
		Stream<Integer> eveninfiniteStream=Stream.iterate(0, n->n+2);
		
		List<Integer> evenList=eveninfiniteStream.limit(10).collect(Collectors.toList());
				
		System.out.println("Even no.s with Limit 10: ");
		System.out.println(evenList);
		
		Stream<Integer> oddInfiniteStream=Stream.iterate(1, n->n+2);
		
		Set<Integer> oddList=oddInfiniteStream.limit(20).collect(Collectors.toSet());
		
		System.out.println("Set of Odd no.s with Limit 20: ");
		System.out.println(oddList);
		
		//Distinct -filter unique elements
		
		List<String> desig=Arrays.asList("Manager","Technician","Salesman","Developer","Manager");
		System.out.println(desig);
		List<String> distinctDesig=desig.stream().distinct().collect(Collectors.toList());
		
		System.out.println(distinctDesig);

		//skip() - skips first n elements
Stream<Integer> eveninfiniteStream1=Stream.iterate(0, n->n+2);
		
		List<Integer> evenList1=eveninfiniteStream1.skip(5).limit(10).collect(Collectors.toList());
				
		System.out.println("Even no.s with Limit 10: ");
		System.out.println(evenList1);
		
		//anyMatch()
		boolean match=desig.stream().anyMatch(s->s.contains("Developer"));
		System.out.println("Developer exists or not? "+match);
		
		
		
	}

}
