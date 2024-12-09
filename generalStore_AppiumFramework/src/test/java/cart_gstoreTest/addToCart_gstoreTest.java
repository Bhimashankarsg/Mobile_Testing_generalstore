package cart_gstoreTest;

import java.io.IOException;


import org.testng.annotations.Test;

import genericUtility_gstore.baseclass_gstore;
import objectRepository_gstore.loginPageOR_gstore;
import objectRepository_gstore.productPageOR_gstore;

public class addToCart_gstoreTest extends baseclass_gstore {
	@Test
	public void addToCart() throws InterruptedException, IOException {
		aLib.implicitWait(driver);
		loginPageOR_gstore lp = new loginPageOR_gstore(driver);
		lp.proceedToLogin();
		productPageOR_gstore prodpage=new productPageOR_gstore(driver);
		prodpage.addToCart();
		
		
	}
}
