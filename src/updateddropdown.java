import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class updateddropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver","\"C:\\Users\\garry\\OneDrive\\Documents\\chromedriver.exe\"");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	    Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
	    driver.findElement(By.id("divpaxinfo")).click();
	    
	    System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

	    
	    driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
	    System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
	    
	    //count the number checkbox
	    
	    System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());	    
	    
	    Thread.sleep(2000L);
	    System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

	    int i =1;
	    while(i<5) 
	    {
	    	 driver.findElement(By.id("hrefIncAdt")).click();
	    	 i++;
	    }
	    // using for loop 
	    //for(int i =1;i<5;i++)
	    
	    driver.findElement(By.id("btnclosepaxoption")).click();
	    System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

	    
	}

}
