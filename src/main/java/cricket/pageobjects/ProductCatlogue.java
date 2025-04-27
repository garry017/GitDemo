package cricket.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import cricket.AbstractComponents.AbstractComponent;
import net.bytebuddy.asm.Advice.This;

public class ProductCatlogue extends AbstractComponent {

	
		// TODO Auto-generated method stub
		WebDriver driver;
		
		
		public ProductCatlogue(WebDriver driver) 
		{
			super(driver);
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		
	   // List<WebElement> Products = driver.findElements(By.cssSelector(".mb-3" ));
		//PageFactory
		@FindBy(css=".mb-3")
		List<WebElement> Products;
		
		@FindBy(css=".ng-animating")
		WebElement spinner;
		
		By ProductsBy = By.cssSelector(".mb-3" );
		By addToCart = By.cssSelector(".card-body button:last-of-type");
		By toastMessage = By.cssSelector("#toast-container");
		public List<WebElement> getProductList(){
			WaitForElementToapper(ProductsBy);
			return Products;
		}
		
		public WebElement getProductsName(String prodctName)
		{
			  WebElement prod = getProductList().stream().filter(product->
			    product.findElement(By.cssSelector("b")).getText().equals(prodctName)).findFirst().orElse(null);
			   return prod;
		}
		
		public void addProductToCart(String prodctName) throws InterruptedException { 
			
			WebElement prod =getProductsName( prodctName);
			prod.findElement(addToCart).click();
			WaitForElementToapper(toastMessage);
			WaitForElementDisappers(spinner);
			 //wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.cssSelector(".ng-animating"))));


		}
		
	
}
