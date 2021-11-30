package com.coforge.training.mockitodemo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.spy;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

/*
 * @Spy is used to create a spy instance. We can use it 
 * instead spy(Object) method.
 * 
 * Mockito provides option to create spy on real objects. 
 * When spy is called, then actual method of real object 
 * is called.
 */
public class EmployeeSpyTest {
	
	private Employee spyEmp;
	private Employee emp;
	
	private static final String FIRST_NAME = "James";
	private static final String LAST_NAME = "Gosling";
	private static final int AGE = 35;
	
	@Before
	public void buildSpy() {
	emp = new Employee(FIRST_NAME, LAST_NAME, AGE);
	spyEmp = spy(emp); //create a spy object of employee using static method spy()
	}

	@Test
	public void verifySpyEffectOnRealInstance() {
	spyEmp.setAge(35);
	assertTrue(emp.getAge() == spyEmp.getAge());
	}

	@Test
	public void verifySpyFirstName() {
	spyEmp.setFirstName("James");;
	assertTrue(emp.getFirstName() == spyEmp.getFirstName());
	}
	
	@Test
	public void verifySpyLastName() {
	spyEmp.setLastName("Gosling");
	assertTrue(emp.getLastName() == spyEmp.getLastName());
	}
	
	@Test
	public void VerifySpyfullname()
	{
	String fName=spyEmp.getFullName();
	System.out.println("Full Name: "+fName);
	assertEquals(FIRST_NAME + " "+LAST_NAME, spyEmp.getFullName());
	}
	
	

}
