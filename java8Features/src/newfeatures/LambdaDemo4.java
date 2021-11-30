package newfeatures;

//perform arithmetic operation using lambda
public class LambdaDemo4 {

	public static void main(String[] args) {
		
		Addition op1=(a,b)-> (a+b);
		System.out.println("Addition of 2 no.s is : "+op1.calculate(24, 76));
		
		Addition op2=(a,b)-> (a-b);
		System.out.println("Subtration of 2 no.s is : "+op2.calculate(76, 24));
		
		Addition op3=(a,b)-> (a*b);
		System.out.println("Multiplication of 2 no.s is : "+op3.calculate(24, 76));
		
		Addition op4=(a,b)-> (a/b);
		System.out.println("Division of 2 no.s is : "+op4.calculate(76, 24));
		

		MyString myName1= name -> {return "hello "+name;};
		System.out.println(myName1.myStringFunction("Prateek"));
		
	}

}
