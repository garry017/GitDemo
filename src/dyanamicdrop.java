import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dyanamicdrop {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("Webdriver.chrome.driver","\"C:\\Users\\garry\\OneDrive\\Documents\\chromedriver.exe\"");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	    driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
//	    driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
	    
	    driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='MAA']")).click();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("(//a[@value='BLR'])[2]")).click();
	    
	    

	}

}
