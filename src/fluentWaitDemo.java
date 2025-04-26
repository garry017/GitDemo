import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class fluentWaitDemo {

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver", "\"C:\\Users\\garry\\OneDrive\\Documents\\chromedriver.exe\"");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		
		driver.findElement(By.cssSelector("div[id='start'] button"));
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
				
				.pollingEvery(Duration.ofSeconds(3)).ignoring(NoSuchElementException.class);;
	}

}
