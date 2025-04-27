package cricket.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cricket.AbstractComponents.AbstractComponent;
import net.bytebuddy.asm.Advice.This;

public class LandingPage extends AbstractComponent {
	
         
	
		// TODO Auto-generated method stub
		WebDriver driver;
		
		
		public LandingPage(WebDriver driver) 
		{
			super(driver);
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		
		//WebElement Usermails = driver.findElement(By.id("userEmail"));
		//PageFactory
		@FindBy(id="userEmail")
		WebElement Usermail1;
		
		@FindBy(id="userPassword")
		WebElement passwordEle;
		
		@FindBy(id="login")
		WebElement submit;
		//.ng-tns-c4-7.ng-star-inserted.ng-trigger.ng-trigger-flyInOut.ngx-toastr.toast-error
		@FindBy(css ="[class*='flyInOut']")
		WebElement ErrorMsg ;
		
		
		//this our action method are
		public ProductCatlogue loginApplication(String email ,String password)
		{
			Usermail1.sendKeys(email);
			passwordEle.sendKeys(password);
			submit.click();
			return new ProductCatlogue(driver) ;
		}
        
		public String getErromessage()
		{
			WaitForWebElementToapper(ErrorMsg);
			return ErrorMsg.getText();
		}
	  public void goTo()
	  {
		    driver.get("https://rahulshettyacademy.com/client");

	  }

}
