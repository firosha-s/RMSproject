package projecttest;

import org.testng.annotations.Test;
import projectpage.LoginPage;

public class LoginTest extends Baseclass{
	
	@Test
	public void LogTest()
	{
		LoginPage lp=new LoginPage(driver);
		lp.Myaccount();
		lp.Setvalue("testershah97@gmail.com","ShaTest@123");
		lp.Loginbutton();
		
	}


}
