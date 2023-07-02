package projecttest;

import org.testng.annotations.Test;
import projectpage.ShoppingPage;

public class ShoppingTest extends Baseclass{
	
	@Test
	public void ShopTest() throws InterruptedException
	{
		ShoppingPage sp=new ShoppingPage(driver);
		sp.Title();
		sp.About();
		sp.Idukki();
		sp.Keralaspices();
		sp.Shopnow();
		
	}


}
