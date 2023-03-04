package Practice;

import org.testng.annotations.Test;

public class SampleTest1
{
	@Test(groups="SmokeTest")
	public void m1()
	{
       System.out.println("m1 running");		
	}
	
	@Test
	public void m2()
	{
		System.out.println("m2 running");
	}

}
