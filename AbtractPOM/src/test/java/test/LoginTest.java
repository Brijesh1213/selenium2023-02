package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAsser

import Loginpage;e;

public class LoginTest extends BaseTest{

	@Test
	public void verifyLoginPageTitleTest() {
	String title= page.getInstance(Loginpage.class).getLoginPageTitle();
	System.out.println(title);
	//softassert.assertEquals(title, "Facebook - Log In or Sign Up");
//	softassert.assertAll(); /// I added soft assert here & in basetest class just too see if it works.
	}

}
