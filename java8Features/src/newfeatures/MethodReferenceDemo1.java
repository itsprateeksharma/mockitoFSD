package newfeatures;
//Method reference- shorthand of lambda expression to call method
@FunctionalInterface
interface MyInterface
{
	void myMethod();
}

class Test //instance class
{
	void display() //instance method
	{
		System.out.println("I am an Instance method");
	}
}

public class MethodReferenceDemo1 {

	public static void main(String[] args) {
		
		//traditional approach
		Test t1=new Test();
		t1.display();
		
		//java 8 method reference approach
		MyInterface m1ref=t1::display; //method reference to instance method of object
		
		//calling method of FI
		m1ref.myMethod();
		
		//Lambda---> FI
		//MR---> shorthand of lambda
		//MR-->FI
	}

}
