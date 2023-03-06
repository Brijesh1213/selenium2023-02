package tests;


import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Testing3 {
	
	SoftAssert softAssert = new SoftAssert();
	
  @Test (priority=1)
  public void createuser() {
	  System.out.println("I am in Home Test");
	  System.out.println("Before Assertion");
	  Assert.assertTrue(2>3, "Verifying element");
	  System.out.println("After Assertions");
	  Assert.assertEquals("abc", "abc");
  }

@Test(priority=2, dependsOnMethods="createuser" )
public void Edituser() {
	  
	  System.out.println("Before Assertion");
	 softAssert.assertTrue(2>3, "Verifying element");
	  System.out.println("After Assertions");
	  softAssert.assertAll();
}

@Test (priority=3, dependsOnMethods="Edituser")//DeleteUser test
public void Deleteuser() {
	System.out.println("I am in end Test");
	  System.out.println("Before Assertion");
	 softAssert.assertTrue(2>3, "Verifying element");
	  System.out.println("After Assertions");
	  Assert.assertEquals("abc", "abc1");
	  System.out.println("After Second Assertions");
	  softAssert.assertAll();
}
	  
}
