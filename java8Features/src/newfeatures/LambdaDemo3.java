package newfeatures;

//block lambda statements
public class LambdaDemo3 {

	public static void main(String[] args) {
		
		MyString reverseStr= (str) -> {
			String result="";
			for(int i=str.length()-1;i>=0;i--)
				result+=str.charAt(i);
			return result;
			
		};
		System.out.println(reverseStr.myStringFunction("Lambda Expressions"));
		
		
		MyString myName= (name) -> {return "hello "+name;};
		System.out.println(myName.myStringFunction("Prateek"));
		
		
		MyString myName1= name -> {return "hello "+name;};
		System.out.println(myName1.myStringFunction("Prateek"));
		
		
	}
	
	
	
}
