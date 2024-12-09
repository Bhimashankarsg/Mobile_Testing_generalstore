package genericUtility_gstore;

import java.util.Date;

public class javaUtility_gstore {
	public String random_num() {
		String date = new Date().toString().replace("-", "_").replace(" ", "_");
		return date;
	}
}
