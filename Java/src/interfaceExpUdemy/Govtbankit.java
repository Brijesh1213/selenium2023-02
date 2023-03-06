package interfaceExpUdemy;

import java.util.Scanner;

public class Govtbankit implements BankRules {
// main privatebank and govtbanlit and bank rule...example of udemy interfaces	
String Customer_Name;
	
public  Govtbankit(String Customer_Name) {
	
		this.Customer_Name=Customer_Name;
	
	}

	@Override
	public void interest_paid() {
		// TODO Auto-generated method stub
		System.out.println(Customer_Name+" is paid an interest of 7%");
	}


}
