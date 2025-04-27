import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver", "\"C:\\Users\\garry\\OneDrive\\Documents\\chromedriver.exe\"");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		// 94. Practise Exercise- print the links count in the Page
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		WebElement footerdriver=driver.findElement(By.id("gf-BIG"));  //limiting web driver scope
		
		System.out.println(footerdriver.findElements(By.tagName("a")).size());	
		
		WebElement columndriver=footerdriver.findElement(By.xpath("//tbody/tr/td[1]/ul[1]"));
		System.out.println(columndriver.findElements(By.tagName("a")).size());
		
		//click on each every link column and check if the pages are opening
		
		for(int i=1; i<columndriver.findElements(By.tagName("a")).size(); i++)
		{
		
		String clickonTab=Keys.chord(Keys.CONTROL, Keys.ENTER);
		
		columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonTab);
		Thread.sleep(5000L);
		} // open the all tab
		Set<String>count=driver.getWindowHandles();
		Iterator<String> it=count.iterator();
		
		while(it.hasNext())
			{
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
			}
	
		}
	}


