package com.qa.util;

import java.io.File;
import java.io.IOException;

import com.qa.base.TestBase;

public class TestUtil extends TestBase{
	
	
	public TestUtil() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public static  long Page_Load_Time_Out=20;
	public static long Implicit_wait =20;

	public void SwitchToFrame(String a) {
	driver.switchTo().frame(a);

}
}