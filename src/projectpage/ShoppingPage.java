package projectpage;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class ShoppingPage {
	WebDriver driver;
	By about = By.xpath("//*[@id=\"menu-item-5950\"]/a");
	By shopnow  = By.xpath("//*[contains(@href,'https://www.rosemariaspices.com/shop/')]");
	By home=By.xpath("//*[@id=\"menu-item-7049\"]/a");
	By idukkispl=By.xpath("//*[@id=\"menu-item-6562\"]/a");
	By spices=By.xpath("//*[@id=\"menu-item-6522\"]/a");
	By cardamon5to7mm=By.xpath("//*[@id=\"main\"]/div/ul/li[2]/div[2]/a[2]");
	By cart=By.xpath("//*[@id=\"product-5464\"]/div[2]/form/div/div[2]/button");
	By gram=By.xpath("//*[@id=\"product-5464\"]/div[2]/form/table/tbody/tr/td/div[2]/div[1]/div");
	By plus=By.xpath("//*[@id=\"plus_qty\"]");
	By addcart=By.xpath("//*[@id=\"product-5464\"]/div[2]/form/div/div[2]/button");
	By viewcart=By.xpath("//*[@id=\"main\"]/div/div[1]/div/a");
	By minus=By.xpath("//*[@id=\"minus_qty\"]");
	By cardamon8fruit=By.xpath("//*[@id=\"main\"]/div/ul/li[11]/div[2]/a[2]");
	By gram1=By.xpath("//*[@id=\"product-5427\"]/div[2]/form/table/tbody/tr/td/div[2]/div[2]");
	By addcart1=By.xpath("//*[@id=\"product-5427\"]/div[2]/form/div/div[2]/button");
	
	
	public ShoppingPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void Title()
	{
		driver.manage().window().maximize();
		String actual=driver.getTitle();
		System.out.println("actual title " +actual);
	}
	
	public void About()
	{
	driver.findElement(about).click();
	driver.findElement(home).click();
	}
	
	public void Idukki()
	{
		driver.findElement(idukkispl).click();
		driver.findElement(home).click();
	}
	
	public void Keralaspices()
	{
		driver.findElement(spices).click();
		driver.findElement(home).click();
	}
	
	public void Shopnow()
	{
		driver.findElement(shopnow).click();
		driver.findElement(cardamon5to7mm).click();
		driver.findElement(cart).click();
		driver.switchTo().alert().accept();
		driver.findElement(gram).click();
		driver.findElement(plus).click();
		driver.findElement(minus).click();
		driver.findElement(addcart).click();
		driver.findElement(viewcart).click();
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().back();
		driver.findElement(cardamon8fruit).click();
		driver.findElement(gram1).click();
		driver.findElement(addcart1).click();
		driver.findElement(viewcart).click();
	}
}
