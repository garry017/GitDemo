import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdditemintoCart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver", "\"C:\\Users\\garry\\OneDrive\\Documents\\chromedriver.exe\"");
		WebDriver driver = new ChromeDriver();
		int j=0;
		String[] itemNeeded = {"Cucumber", "Brocolli","Beetroot","Beans","Carrot"};
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		Thread.sleep(2000);
		
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		
		for (int i=0; i<products.size();i++)
			
			//Brocolli - 1kg
			// Brocolli =, 1kg
		{
		String[] name=products.get(i).getText().split("-");
		String FormattedName =name[0].trim();
		
		//format it to get actual vegggi name
		// convert array into arraylist for easy search 
		//check weather name you extracted IS PRESENT IN THE ARRAY LIST OR NOT 	
		
		List itemNeededList = Arrays.asList(itemNeeded);
		
		
		if(itemNeededList.contains(FormattedName))
		{
			j++;
			
		{
			//click on add to cart 
			     driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
			     if(j==itemNeeded.length )
			     {
			    	 break;
			     }
			     }
			 
		}
		}
		
	}

}
