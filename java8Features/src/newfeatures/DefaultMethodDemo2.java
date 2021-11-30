package newfeatures;

import java.time.LocalDate;

//java8 allows to ad functionality to interfaces
interface Parser
{
	default void parse()
	{
		System.out.println("default Parsing logic");
	} 
	
	static void displayDate()
	{
		System.out.println(LocalDate.now());
	}
}

class TextParser implements Parser
{
//INHERITS DEFAULT implementation of Parser	
	void display()
	{
		System.out.println("Hello text Parser");
	}
}

class XMLParser implements Parser
{
	public void parse()
	{
		System.out.println("Parsing XML files");
	}
}


public class DefaultMethodDemo2 {

	public static void main(String[] args) {
		
		Parser p=new TextParser();//up-casting
		p.parse();//invokes default method in interface
		//((TextParser) p).display();
		
		TextParser p1=new TextParser(); //references child class textparser
		p1.display();
		
		p=new XMLParser(); // references child class xml parser
		p.parse(); //invokes overridden method
		
		System.out.println("Program executed on: ");
		Parser.displayDate(); //invokes static method
		
	}

}
