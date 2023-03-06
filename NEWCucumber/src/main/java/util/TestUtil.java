package util;

import java.io.File;
import java.io.IOException;

import base.TestBase;

public class TestUtil extends TestBase{
	
	
	public TestUtil() throws IOException {
		super(driver, wait);
		// TODO Auto-generated constructor stub
	}
	
	
	public static  long Page_Load_Time_Out=2;
	public static long Implicit_wait =3;

	public void SwitchToFrame(String a) {
	driver.switchTo().frame(a);

}
}