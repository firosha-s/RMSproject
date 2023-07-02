package projecttest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;

public class Baseclass {
	WebDriver driver;
	@BeforeClass
	public void Setup()
	{	
		//ChromeOptions options = new ChromeOptions();
		//options .setAcceptInsecureCerts(true);
		//driver=new ChromeDriver(options);
		driver=new ChromeDriver();
		driver.get("https://www.rosemariaspices.com/");
	}


}
