package cricket.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cricket.AbstractComponents.AbstractComponent;

public class confimationPage extends AbstractComponent {

	
	WebDriver driver;
	public confimationPage(WebDriver driver) 
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(css = ".hero-primary")
	WebElement confimrationmessage;
	
	
	public String getConfirmationMessage()
	{
		CheckOutPage cp = new CheckOutPage(driver);
	
		return confimrationmessage.getText();

	}


}	

