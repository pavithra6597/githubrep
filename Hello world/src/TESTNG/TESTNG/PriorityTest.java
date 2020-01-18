package TESTNG.TESTNG;

import org.testng.annotations.Test;

public class PriorityTest {
  @Test(priority= -1)
  public void Testcase1() {
	  System.out.println("Login to application");
  }
  @Test(priority= -2)
  public void Testcase2() {
	  System.out.println("Create accont");
  }
  @Test(priority=1)
  public void Testcase3() {
	  System.out.println("Registernewuser");
  }
}
