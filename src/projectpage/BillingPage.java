package projectpage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BillingPage {
	WebDriver driver;
	By checkout=By.xpath("//*[@id=\"post-97\"]/div/div/div[2]/div/div/a");
	/*By firstname=By.xpath("//*[@id=\"billing_first_name\"]");
	By lastname=By.xpath("//*[@id=\"billing_last_name\"]");
	By street=By.xpath("//*[@id=\"billing_address_1\"]");
	By flat=By.xpath("//*[@id=\"billing_address_2\"]");
	By town=By.xpath("//*[@id=\"billing_city\"]");
	By state=By.xpath("//*[@id=\"billing_state\"]");
	By pincode=By.xpath("//*[@id=\"billing_postcode\"]");
	By phone=By.xpath("//*[@id=\"billing_phone\"]");
	By email=By.xpath("//*[@id=\"billing_email\"]");*/
	By newsletter=By.xpath("//*[@id=\"mailchimp_woocommerce_newsletter\"]");
	By check=By.xpath("//*[@id=\"ship-to-different-address-checkbox\"]");
	
	public BillingPage(WebDriver driver) 
	{
		this.driver=driver;
	}
	
	public void Checkout()
	{
		driver.findElement(checkout).click();
	}
	
	/*public void Name(String fname,String lname)
	{
		driver.findElement(firstname).sendKeys(fname);
		driver.findElement(firstname).sendKeys(lname);
	}
	
	public void Address(String sname,String fname,String tname,String pcode)
	{
		driver.findElement(street).sendKeys(sname);
		driver.findElement(flat).sendKeys(fname);
		driver.findElement(town).sendKeys(tname);
		WebElement s=driver.findElement(state);
		Select ss=new Select(s);
		ss.selectByValue("KL");
		driver.findElement(pincode).sendKeys(pcode);
	}
	public void Contact(String pno,String mail)
	{
		driver.findElement(phone).sendKeys(pno);
		driver.findElement(email).sendKeys(mail);
	}*/
	public void Checkbox()
	{
		driver.findElement(newsletter).click();
	}

	public void Checkbox1()
	{
		driver.findElement(check).click();
	}
	
}
