

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class L2ocators {

	public static void main(String[] args) throws InterruptedException {
	 System.setProperty("Webdriver.chrome.driver","\"C:\\Users\\garry\\OneDrive\\Documents\\chromedriver.exe\"");
		    WebDriver driver = new ChromeDriver();
		   
		    driver.get("https://rahulshettyacademy.com/locatorspractice/");
		    
		    driver.findElement(By.id("inputUsername")).sendKeys("gaurav");
		    
		    driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		    
		    driver.findElement(By.className("signInBtn")).click();
		    
		    Thread.sleep(1000);	
	        System.out.println(driver.findElement(By.tagName("p")).getText());
	        Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
	        
	        driver.findElement(By.xpath("//button[text()='Log Out']")).click();
	        driver.close();
	}

}
