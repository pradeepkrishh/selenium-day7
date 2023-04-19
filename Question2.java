package day7;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Question2 {
	int a=5,b=4,c;
	@Test(priority=1)
	public void add()
	{
		c=a+b;
		Assert.assertEquals(9,c);
		System.out.println("ADIITION "+c);
	}
	@Test(priority=2)
	public void sub()
	{
		c=a-b;
		Assert.assertEquals(1, c);
		System.out.println("SUBTRACTION "+c);
	}
	@Test(priority=3)
	public void mul()
	{
		c=a*b;
		Assert.assertEquals(20,c);
		System.out.println("MULTIPLICATION "+c);
	}
	@Test(priority=4)
	public void div()
	{
		c=a/b;
		Assert.assertEquals(1,c);
		System.out.println("DIVISION "+c);
	}
	
	

}