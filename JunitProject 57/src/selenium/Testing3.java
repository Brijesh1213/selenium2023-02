package selenium;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;


public class Testing3 {

  @Rule
  public ErrorCollector Err = new ErrorCollector ();
	
  @Ignore
	@Test
	public void test6() {
		String act = "abc";
		String exp ="abc";
		// cant use if else..it will pass the test...result will display fail
		System.out.println("Before assert 1");
		Assert.assertEquals(exp,act);
		System.out.println("After assert 1");
		try {
		Assert.assertTrue("Verify 2>3", 2>3);
		}
		catch(Throwable t) {
		System.out.println("After Assert 2");
		Err.addError(t);
		}
	}
	    
		@Test
		public void test7() {
			String act = "abc";
			String exp ="abc1";
			// cant use if else..it will pass the test...result will display fail
			System.out.println("Before assert 1");
			try { Assert.assertEquals(exp,act); 
			}catch (Throwable t )
			{System.out.println(" I am in Catch 1");
			Err.addError(t);}
			
			try { Assert.assertTrue("Verify 2>3", 2>3);
			}catch (Throwable t )
			{System.out.println(" I am in Catch 2"); 
			Err.addError(t);}
			System.out.println("After assert 2");
			
		}
}
