package objectRepository_gstore;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class homePageOR_frontpage {
AndroidDriver driver;
	
	public  homePageOR_frontpage(AndroidDriver driver)
	{
		this.driver=driver;
		 
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		
	}
	
	
}
