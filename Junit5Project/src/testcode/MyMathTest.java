package testcode;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import businesscode.MyMath;

public class MyMathTest {
	
	private MyMath m;
	

	@Before
	public void setUp() throws Exception {
	m=new MyMath();
	
	}

	@After
	public void tearDown() throws Exception {
		m=null;
	}

	@Test
	public void testSum() {
		System.out.println("Test with 3 numbers");
		assertEquals(10, m.sum(new int[] {5,3,2}));
	}
	
	@Test
	public void testSum2() {
		System.out.println("Test with 5 numbers");
		assertEquals(100, m.sum(new int[] {55,10,5,20,10}));
	}
	
	

}
