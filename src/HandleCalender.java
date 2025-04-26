import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


//

public class HandleCalender {

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver","\"C:\\Users\\garry\\OneDrive\\Documents\\chromedriver.exe\"");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	    driver.findElement(By.cssSelector(".ui-state-default.ui-state-active.ui-state-hover")).click();
	    if(driver.findElement(By.id("Div1")).getDomAttribute("style").contains("0.5"))
	    {
	    	System.out.println("its enabled ");
	    	
	    }
	    else {
	    	Assert.assertTrue(true);
	    }
	}

}


//customizwe css selector how to do
// ("input[value='search']")
//xpath
// ("//input[@value='search']")
//by.name(ctl00_mainContent_btn_FindFlights)

