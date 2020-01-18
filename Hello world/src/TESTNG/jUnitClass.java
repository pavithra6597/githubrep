package TESTNG;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class jUnitClass {
	
@BeforeClass
	public static void setUpBeforeClass()  {
	System.out.println("Before Class");
		
	}

@AfterClass
public static void tearDownAfterClass() throws Exception {
System.out.println("After Class");
	
}
@Before
public  void Before() {
System.out.println("Before");
	
}

public  void After()  {
System.out.println("After");
}

@Test
public static void TestCase1()  {
System.out.println("TestCase1");
}
@Test
public static void TestCase2() {
System.out.println("TestCase2");
}
@Test
public static void TestCase3()  {
System.out.println("TestCase3");
}
}


