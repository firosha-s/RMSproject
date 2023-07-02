package projectpage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PaymentPage {
	WebDriver driver;
	 By termscheckbox=By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/article[1]/div[1]/div[1]/form[2]/div[2]/div[1]/div[1]/div[1]/p[1]/label[1]/input[1]");
	 By placeorder=By.xpath("//*[@id=\"place_order\"]");
	
	 public PaymentPage(WebDriver driver) 
	 {
		this.driver=driver;
	 }
	 
	public void Checkbox() throws InterruptedException
	 {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(termscheckbox));
		Thread.sleep(10000);
		WebElement element=driver.findElement(termscheckbox);
		element.click();
	}
public void Order()
	{
		driver.findElement(placeorder).click();
	}
}
