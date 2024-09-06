package org.testng.annotations;

public class test {
	
	@Test(priority=1)
	void Test()
	{
		System.out.println("Test");
	}

	
	@Test(priority=2)
	void Test1()
	{
		System.out.println("Test1");
	}

	@Test(priority=2)
	void Test2()
	{
		System.out.println("Test2");
	}

}
