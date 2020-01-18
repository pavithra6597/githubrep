package TESTNG;

import org.testng.annotations.Test;

public class ParallelExecution {
  @Test
  public void TestCase1() {
	  System.out.println("TestCase1");
  }
  @Test
  public void TestCase2() {
	  System.out.println("TestCase2");
  }
  @Test
  public void TestCase3() {
	  System.out.println("TestCase3");
  }
}
