package c1;

import junit.framework.Assert;

public class CallMath {
	
	static int add1;
	static int sub1;
	static int mul1;
	static int div1;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Math m=new Math();
		add1= m.add(20, 10);
		sub1=m.sub(20, 10);
		mul1=m.divide(20, 10);
		div1=m.multiply(20, 10);
	 
		Assert.assertEquals(20,add1);
		Assert.assertEquals(20,sub1);
		Assert.assertEquals(20,mul1);
		Assert.assertEquals(20,div1);
		
		
		
	}

}
