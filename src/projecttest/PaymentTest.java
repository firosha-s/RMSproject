package projecttest;

import org.testng.annotations.Test;

import projectpage.BillingPage;
import projectpage.LoginPage;
import projectpage.PaymentPage;
import projectpage.ShoppingPage;

public class PaymentTest extends Baseclass{
	@Test
	public void Paytest() throws InterruptedException
	{
		ShoppingPage sp=new ShoppingPage(driver);
		LoginPage lp=new LoginPage(driver);
		BillingPage pp=new BillingPage(driver);
		PaymentPage po=new PaymentPage(driver);
		lp.Myaccount();
		//lp.Register("shahtester", "testershah97@gmail.com");
		//lp.Registerbutton();
		lp.Setvalue("testershah97@gmail.com","ShaTest@123");
		lp.Loginbutton();
		sp.Title();
		sp.About();
		sp.Idukki();
		sp.Keralaspices();
		sp.Shopnow();
		pp.Checkout();
		//pp.Name("shah", "tester");
		//pp.Address("edapally", "lulumall", "ernakulam", "682025");
		//pp.Contact("1234567890", "testershah97@gmail.com");
		pp.Checkbox();
		pp.Checkbox1();
		po.Checkbox();
		po.Order();

}
	
	

}
