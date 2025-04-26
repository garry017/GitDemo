import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionFrame {

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver", "\"C:\\Users\\garry\\OneDrive\\Documents\\chromedriver.exe\"");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://www.flipkart.com/");
		Actions a = new Actions(driver);
		WebElement move=driver.findElement(By.xpath("//span[contains(text(),'Fashion')]"));
		
		a.moveToElement(driver.findElement(By.xpath("//input[@class='Pke_EE']"))).click().keyDown(Keys.SHIFT).sendKeys("nothing 3a").doubleClick()
		.build().perform();
		// 
		
		a.moveToElement(move).contextClick().perform();
		//optional a[id='nav-link-accountList']
		
		
		
		
	}

}
