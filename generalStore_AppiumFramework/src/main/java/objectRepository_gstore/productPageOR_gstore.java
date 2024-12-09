package objectRepository_gstore;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class productPageOR_gstore {

	AndroidDriver driver;
	
	public productPageOR_gstore(AndroidDriver driver)
	{
		this.driver=driver;
		// Initialize all elements with AppiumFieldDecorator
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		
	}
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Air Jordan 1 Mid SE']/..//android.widget.TextView[@resource-id='com.androidsample.generalstore:id/productAddCart']")
	private WebElement productAddCart;
	@AndroidFindBy(id="com.androidsample.generalstore:id/appbar_btn_cart")
	private WebElement appbar_btn_cart;
	
	@AndroidFindBy(id="com.androidsample.generalstore:id/btnProceed")
	private WebElement btnProceed;

	

	public WebElement getProductAddCart() {
		return productAddCart;
	}

	public WebElement getAppbar_btn_cart() {
		return appbar_btn_cart;
	}

	public WebElement getBtnProceed() {
		return btnProceed;
	}
	 
	public void addToCart()
	{
		productAddCart.click();
		appbar_btn_cart.click();
		 
		btnProceed.click();
		
	}
	

}
