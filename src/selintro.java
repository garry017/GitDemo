import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class selintro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//System.setProperty("Webdriver.chrome.driver","\"C:\\Users\\garry\\OneDrive\\Documents\\chromedriver.exe\"");

System.setProperty("Webdriver.edge.driver","C:\\Users\\garry\\OneDrive\\Documents\\msedgedriver.exe");



		
		WebDriver driver = new EdgeDriver();
		
		
		driver.get("https://rahulshettyacademy.com/");
		System.out.println(driver.getTitle());
		   System.out.println(driver.getCurrentUrl());
		   System.out.print("fatech Succussefully")	;
		   
		   

	}

}
