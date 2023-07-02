package projecttest;

import org.testng.annotations.Test;

import projectpage.BillingPage;

public class BillingTest extends Baseclass{
	@Test
	public void Paymenttest()
	{
		BillingPage pp=new BillingPage(driver);
		pp.Checkout();
		//pp.Name("sha", "tester");
		//pp.Address("edapally", "lulumall", "ernakulam", "682025");
		//pp.Contact("1234567890", "testershah97@gmail.com");
		pp.Checkbox();
		pp.Checkbox1();
		
	}

}
