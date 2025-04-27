import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class BrokenLink {

	public static void main(String[] args) throws MalformedURLException, IOException {
		System.setProperty("Webdriver.chrome.driver", "\"C:\\Users\\garry\\OneDrive\\Documents\\chromedriver.exe\"");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		List<WebElement> links = driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		SoftAssert a= new SoftAssert();
		
		for(WebElement link : links )
		{
			
			String urls = link.getAttribute("href");
			
			
			HttpURLConnection conn=(HttpURLConnection) new URL(urls).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			
			int respCode = conn.getResponseCode();
			System.out.println(respCode);
			a.assertTrue(respCode<404, "the link with text"+link.getText()+" is broken with code" +respCode);
			
			
//			if(respCode>400)
//			{
//			 System.out.println("the link with text"+link.getText()+" is broken with code" +respCode);
//			 Assert.assertTrue(false);
//			}
//			avoid this time to get result abobe look like clean
			
			
			
			
		}
		a.assertAll();
		
		
		
		
		
		
		
		
		//broken link
		
	   // java method will call you url and gets you the status code 
		// step1 is to gert all all url tied to up to link using selenium 
		//if status code >400  that url is not working > link which tied up to url is broken
		
//		String urls = driver.findElement(By.cssSelector("a[href*='soapui']")).getAttribute("href");
//		
//		
//		HttpURLConnection conn=(HttpURLConnection) new URL(urls).openConnection();
//		conn.setRequestMethod("HEAD");
//		conn.connect();
//		
//		int respCode = conn.getResponseCode();
//		System.out.println(respCode);
		
		
		
		}

}
