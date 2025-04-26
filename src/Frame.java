import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frame {

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver", "\"C:\\Users\\garry\\OneDrive\\Documents\\chromedriver.exe\"");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/draggable/");
		//driver.switchTo().frame(1);
		driver.findElement(By.tagName("iframe")).getSize();
		driver.switchTo().frame(0);
		
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));

		//driver.findElement(By.id("draggable")).click();
		Actions a = new Actions(driver);
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.xpath("//p[contains(text(),'Drag me around')]"));

		
		a.dragAndDrop(source, target).build().perform();

	}

}
