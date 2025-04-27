import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatorPractice {

	public static void main(String[] args) throws InterruptedException {
    System.setProperty("Webdriver.chrome.driver","\"C:\\Users\\garry\\OneDrive\\Documents\\chromedriver.exe\"");
    WebDriver driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    
    driver.get("https://rahulshettyacademy.com/locatorspractice/");
    
    driver.findElement(By.id("inputUsername")).sendKeys("gaurav");
    
    driver.findElement(By.name("inputPassword")).sendKeys("abc@1234");
    
    driver.findElement(By.className("signInBtn")).click();
    
    System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
    
    driver.findElement(By.linkText("Forgot your password?")).click();
    Thread.sleep(2000);
    
    driver.findElement(By.xpath("//*[@id=\"container\"]/div[1]/form/input[1]")).sendKeys("virat kohli");
    
    driver.findElement(By.xpath("//*[@id=\"container\"]/div[1]/form/input[2]")).sendKeys("kohli@18gmail.com");
    
    driver.findElement(By.xpath("//form/input[3]")).sendKeys("7723454737");
    
    driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
    
    System.out.println(driver.findElement(By.cssSelector("form p ")).getText());
    
    driver.findElement(By.xpath(".go-to-login-btn")).click();
    Thread.sleep(2000);
    
    driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");
    
    driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
    
    driver.findElement(By.id("chkboxOne")).click();
    
    driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
    
  
    
    
   

	}

}
