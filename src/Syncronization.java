import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Syncronization {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver", "\"C:\\Users\\garry\\OneDrive\\Documents\\chromedriver.exe\"");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		String[] itemNeeded = {"Cucumber", "Brocolli","Beetroot","Beans","Carrot"};
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		Thread.sleep(2000);
		addItems(driver, itemNeeded);
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		
		//explicit wait
		// WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
	//example as refrence	// w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		
		
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
		
		
		driver.findElement(By.xpath("//button[text()='Place Order']")).click();	
		driver.findElement(By.xpath("//select[@style='width: 200px;']")).click();
		//driver.findElement(By.xpath("option[value*='India']")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	public static void addItems(WebDriver driver, String[]itemNeeded )
	{ 
		int j=0;
	
		
List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		
		for (int i=0; i<products.size();i++)
			
			//Brocolli - 1kg
			// Brocolli =, 1kg
		{
		String[] name=products.get(i).getText().split("-");
		String FormattedName =name[0].trim();
		
		//format it to get actual vegggi name
		// convert array into arraylist for easy search 
		//check weather name you extracted IS PRESENT IN THE ARRAY LIST OR NOT 	
		
		List itemNeededList = Arrays.asList(itemNeeded);
		
		
		if(itemNeededList.contains(FormattedName))
		{
			j++;
			
		{
			//click on add to cart 
			     driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
			     if(j==itemNeeded.length )
			     {
			    	 break;
			     }
		}
		}
			 
		}
	}
}
