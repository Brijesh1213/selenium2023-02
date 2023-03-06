package interfaceExpUdemy;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// below is main bank example of udemy interfaces
		Customer c = new Customer();
		c.deposit();
		c.withdraw();
		// below main privatebank and govtbanlit and bank rule...example of udemy interfaces	
		Privatebank p =new Privatebank("Brijesh");
		Govtbankit  g = new Govtbankit("JalpaG");
		
		p.interest_paid();
		g.interest_paid();

	}

}
