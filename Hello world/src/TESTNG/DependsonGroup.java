package TESTNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsonGroup {
  @Test
  public void login() {
	  System.out.println("Logintoapplication");
  }
  @Test(dependsOnMethods={"login"})
  public void CreateNewUser() {
	  System.out.println("CreateNewUser");
Assert.assertEquals("abc", "xyz");	  
  }
  @Test(dependsOnMethods= {"CreateNewUser"}, alwaysRun= true)
  public void Register() {
	  System.out.println("Register");
	  
  }
}

