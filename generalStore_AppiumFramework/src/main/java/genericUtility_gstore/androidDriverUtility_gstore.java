package genericUtility_gstore;

import java.time.Duration;

import io.appium.java_client.android.AndroidDriver;

public class androidDriverUtility_gstore {
	public void implicitWait(AndroidDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	}
}
