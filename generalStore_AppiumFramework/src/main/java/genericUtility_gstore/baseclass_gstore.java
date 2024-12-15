package genericUtility_gstore;

import java.io.File;

import java.io.IOException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.google.common.util.concurrent.Service;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
//@Parameters({"device", "os_version"})
public class baseclass_gstore {

	public propertiesFileUtility_gstore fLib = new propertiesFileUtility_gstore();
	public DesiredCapabilities dcap;
	public AndroidDriver driver;
	public AppiumDriverLocalService service;
	public androidDriverUtility_gstore aLib = new androidDriverUtility_gstore();

	@BeforeSuite
	public void beforeSuite() throws IOException, InterruptedException {
		File f = new File("C:\\Users\\BHIMASHANKAR\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js");
		service = new AppiumServiceBuilder().withAppiumJS(f)
				.withIPAddress("127.0.0.1")
				.usingPort(4723)
				.withTimeout(Duration.ofSeconds(500))
				.build();
		service.start();
		Thread.sleep(10000);

	}
	  // @Parameters({"device", "os_version"})
	@BeforeClass
	public void beforeclass() throws IOException {

		dcap = new DesiredCapabilities();
		dcap.setCapability("platformName", fLib.getcommonData_gstore("platformName"));
		dcap.setCapability("automationName", fLib.getcommonData_gstore("automationName"));

		// dcap.setCapability("browserName", "chrome");
		dcap.setCapability("autoGrantPermissions", fLib.getcommonData_gstore("autoGrantPermissions"));
		dcap.setCapability("noReset", fLib.getcommonData_gstore("noReset")); // Prevent clearing app data
		dcap.setCapability("deviceName", fLib.getcommonData_gstore("deviceName"));
		dcap.setCapability("UDID", fLib.getcommonData_gstore("UDID"));

		
		  dcap.setCapability("appPackage", fLib.getcommonData_gstore("appPackage"));
		  dcap.setCapability("appActivity", fLib.getcommonData_gstore("appActivity"));
		 
		/*
		 * ChromeOptions options = new ChromeOptions();
		 * options.addArguments("--disable-notifications"); // Suppress notifications
		 * dcap.setCapability("goog:chromeOptions", options); // Pass ChromeOptions to
		 * capabilities
		 */ 
		driver = new AndroidDriver(new URL(service.getUrl().toString()), dcap);
	//	driver.installApp("E:/Appium_tools/General-Store.apk");
	}

	@AfterClass
	public void afterclass() {
		//driver.terminateApp("com.androidsample.generalstore");
	}

	@AfterSuite
	public void aftersuite() {
		service.stop();
	}

}
