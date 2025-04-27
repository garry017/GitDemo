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

import cricket.pageobjects.LandingPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StandAloneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String  ProductName  ="ZARA COAT 3";
		WebDriverManager.chromedriver().setup();
		//System.setProperty("Webdriver.chrome.driver","\"C:\\Users\\garry\\OneDrive\\Documents\\chromedriver.exe\"");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.manage().window().maximize();
	    driver.get("https://rahulshettyacademy.com/client");
	    LandingPage landingpage = new LandingPage(driver);
	    
	    driver.findElement(By.id("userEmail")).sendKeys("virat188@gmail.com");
	    
	    driver.findElement(By.id("userPassword")).sendKeys("GAUrav@123");
	    
	    driver.findElement(By.id("login")).click();
		   WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		   wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".mb-3")));

	    
	    List<WebElement> Products = driver.findElements(By.cssSelector(".mb-3" ));
	    
	   WebElement prod = Products.stream().filter(product->
	    product.findElement(By.cssSelector("b")).getText().equals("ZARA COAT 3")).findFirst().orElse(null);
	   
	   prod.findElement(By.cssSelector(".card-body button:last-of-type")).click();
	   
	   wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#toast-container")));
	   
	  //ng-animating
	   wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.cssSelector(".ng-animating"))));
	   
	   driver.findElement(By.cssSelector("[routerlink*='cart']")).click();
	   
	  List<WebElement> cartproducts = driver.findElements(By.cssSelector(".cartSection h3"));
	  
	 Boolean match = cartproducts.stream().anyMatch(cartprod-> cartprod.getText().equalsIgnoreCase(ProductName));
	Assert.assertTrue(match);
	
	driver.findElement(By.cssSelector(".totalRow button")).click();
	
	Actions a = new Actions(driver);
	a.sendKeys(driver.findElement(By.cssSelector("[placeholder='Select Country']")), "india").build().perform();
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".ta-results")));
	
	//parent to child traverse as example  --.ta-item:nth-of-type(2)   write xpath genrate the (//button[contains(@class,'ta-item')])[2]
	
	   driver.findElement(By.xpath("(//button[contains(@class,'ta-item')])[2]")).click();
	   
	   driver.findElement(By.cssSelector(".action__submit")).click();
	   
	   String confirmmsg = driver.findElement(By.cssSelector(".hero-primary")).getText();
	   Assert.assertTrue(confirmmsg.equalsIgnoreCase("Thankyou for the order."));
	   
	   
	   

	   
	   
	   
	}

}
