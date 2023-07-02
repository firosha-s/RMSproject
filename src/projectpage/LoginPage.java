package projectpage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LoginPage {
	WebDriver driver;
	
	By account = By.xpath("//*[contains(@href,'https://www.rosemariaspices.com/my-account/')]");
	//By user=By.xpath("//*[@id=\"reg_username\"]");
	//By emailaddress=By.xpath("//*[@id=\"reg_email\"]");
	//By registerbutton=By.xpath("//*[@id=\"customer_login\"]/div[2]/form/p[5]/button");
	By username = By.xpath("//*[@id=\"username\"]");
	By password = By.xpath("//*[@id=\"password\"]");
	By loginbutton=By.xpath("//*[@id=\"customer_login\"]/div[1]/form/p[3]/button");
	
		
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}

	public void Myaccount()
	{
		driver.manage().window().maximize();
		driver.findElement(account).click();
	}
/*	public void Register(String name,String email)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(user));
        driver.findElement(user).sendKeys(name);
		driver.findElement(emailaddress).sendKeys(email);
	}
	public void Registerbutton()
	{
		driver.findElement(registerbutton).click();
	}*/
	
	public void Setvalue(String name,String pass)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(username));
		driver.findElement(username).sendKeys(name);
		driver.findElement(password).sendKeys(pass);
	}
	
	public void Loginbutton()
	{
		driver.findElement(loginbutton).click();
	}


}
