package cricket.AbstractComponents;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cricket.pageobjects.CartPage;
import cricket.pageobjects.OrderPage;

public class AbstractComponent {
	
	WebDriver driver;
	public AbstractComponent(WebDriver driver) {

		this.driver=driver;
		PageFactory.initElements(driver, this); 
	}
	@FindBy (css = "[routerlink*='cart']")
	WebElement CartHeader;
	
	@FindBy (css = "[routerlink*='myorders']")
	WebElement orderHeader;

	public void WaitForElementToapper(By FindBy)
	{
	 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
	   wait.until(ExpectedConditions.visibilityOfElementLocated(FindBy));
}
	public void WaitForWebElementToapper(WebElement FindBy)
	{
	 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
	   wait.until(ExpectedConditions.visibilityOf(FindBy));
}
	
	public CartPage goToCartPage()
	{
		CartHeader.click();
		CartPage cartPage = new CartPage(driver);
		return cartPage;	
	}
	
	public OrderPage goToOrderPage()
	{
		orderHeader.click();
		OrderPage OrderPage = new OrderPage(driver);
		return OrderPage;	
	}
	
   public void WaitForElementDisappers(WebElement ele) throws InterruptedException
   {
		// WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(2));
         //wait.until(ExpectedConditions.invisibilityOf(ele));
         Thread.sleep(2000);

   }
}

