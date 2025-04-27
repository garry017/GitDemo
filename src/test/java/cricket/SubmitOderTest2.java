package cricket;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import cricket.pageobjects.CartPage;
import cricket.pageobjects.CheckOutPage;
import cricket.pageobjects.LandingPage;
import cricket.pageobjects.ProductCatlogue;
import cricket.pageobjects.confimationPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SubmitOderTest2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String  ProductName  ="ZARA COAT 3";
		WebDriverManager.chromedriver().setup();
		//System.setProperty("Webdriver.chrome.driver","\"C:\\Users\\garry\\OneDrive\\Documents\\chromedriver.exe\"");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.manage().window().maximize();
	   
	    LandingPage landingpage = new LandingPage(driver);
	    landingpage.goTo();
	    landingpage.loginApplication("virat188@gmail.com", "GAUrav@123");
	    ProductCatlogue productCatlogue = new ProductCatlogue(driver);
	   List<WebElement> products = productCatlogue.getProductList();
	   productCatlogue.addProductToCart(ProductName);
	   CartPage cartpage= productCatlogue.goToCartPage();
	  
	   Boolean match = cartpage.VerifyProductDisplay(ProductName);
	Assert.assertTrue(match);
	CheckOutPage checkoutpage =cartpage.goToCheckout();
	checkoutpage.selectcountry("india");
	confimationPage  confimationPage = checkoutpage.submitOrder();  //confimationPage
	   
	   String confirmation = confimationPage.getConfirmationMessage();
	   Assert.assertTrue(confirmation.equalsIgnoreCase("Thankyou for the order."));
	   
	   
	   

	 /// how to run test in terminal that is cmd   mvn tests _PRegressionTests
	   
	   
	}

}
