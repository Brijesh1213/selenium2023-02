package selenium;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Testing1 {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("BeforeClass");
		System.out.println("openBrowser");// this will open browser at the begining
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("AfterClass");
		System.out.println("close browser");// this will close browser after class ends
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Before");
		System.out.println("login");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("After");
		System.out.println("Logout");
	}

	@Test
	public void test1() {
		//System.out.println("login");
		System.out.println("Test1");// if this fail..u can not run 38 means u can login with logout,...so add login log our in before after
		//System.out.println("Logout");// so we comment the login log out in tests and added in after before...thus if any test fail other will run
	}
	@Test
	public void test2() {
		//System.out.println("login");
		System.out.println("test2");
		//System.out.println("Logout");
	}
	@Test
	public void test3() {
		//System.out.println("login");
		System.out.println("test3");
		//System.out.println("Logout");
	}

}
