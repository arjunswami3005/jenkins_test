package pack1;

import org.junit.Assert;
import org.junit.Test;

import c1.Math;


public class UnitTest  {
	
	Math m1=new Math();
	
	@Test
	public void add()
	{
		
		
		Assert.assertEquals(30,m1.add(20, 10));
	
	}
	
	@Test
	public void mul()
	{
		Assert.assertEquals(200,m1.multiply(20, 10));
		
	}
	
	@Test
	public void div()
	{
		Assert.assertEquals(2,m1.divide(20, 10));
		
	}
	@Test
	public void sub()
	{
		Assert.assertEquals(10,m1.sub(20, 10));
		
	}
	

}
