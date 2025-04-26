import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaAlertsHandle {

	public static void main(String[] args) {
		String text = "gaurav";
		System.setProperty("Webdriver.chrome.driver", "\"C:\\Users\\garry\\OneDrive\\Documents\\chromedriver.exe\"");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("name")).sendKeys(text);
		driver.findElement(By.cssSelector("[id='alertbtn']")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();

		driver.findElement(By.id("confirmbtn")).click();
		System.out.println(driver.switchTo().alert().getText());

		driver.switchTo().alert().dismiss();

	}

}

/// Code formatting and Debugging ctrl+shift+f this key to format your code in line by line