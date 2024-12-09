package objectRepository_gstore;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class loginPageOR_gstore {
	AndroidDriver driver;
	
	public loginPageOR_gstore(AndroidDriver driver)
	{
		this.driver=driver;
		// Initialize all elements with AppiumFieldDecorator
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		
	}
	
	@AndroidFindBy(id="com.androidsample.generalstore:id/spinnerCountry")
	private WebElement spinnerCountry;
	
	
	@AndroidFindBy(uiAutomator="new UiScrollable(new UiSelector()).scrollIntoView(text(\"India\"));")
	private WebElement scrollToCountry;

	@AndroidFindBy(id="com.androidsample.generalstore:id/nameField")
	private WebElement nameField;
	
	@AndroidFindBy(id="com.androidsample.generalstore:id/btnLetsShop")
	private WebElement btnLetsShop;
	
	

	public WebElement getCountryDD() {
		return spinnerCountry;
	}

	public WebElement getScrollToCountry() {
		return scrollToCountry;
	}

	public WebElement getNameField() {
		return nameField;
	}

	public WebElement getBtnLetsShop() {
		return btnLetsShop;
	}

	
	 
	public void proceedToLogin() throws InterruptedException
	{
		spinnerCountry.click();
		Thread.sleep(5000);
		scrollToCountry.click();
		Thread.sleep(3000);
		nameField.sendKeys("bshankar");
		Thread.sleep(3000);
		btnLetsShop.click();
		
	}
	
	
	
}
