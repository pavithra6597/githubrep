package TESTNG;

import org.testng.annotations.Test;

public class Grouping {
	@Test (groups = {"functionaltest", "regressiontest"})
	  public void TestCase1() {
		  System.out.println("TestCase1");
	  }
	  @Test(groups = {"sanitytest", "smoketest"})
	  public void TestCase2() {
		  System.out.println("TestCase2");
	  }
	  @Test(groups = {"shakedowntest", "adhoctest"})
	  public void TestCase3() {
		  System.out.println("TestCase3");
	  }
}