package genericUtility_gstore;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class propertiesFileUtility_gstore {
public String getcommonData_gstore(String comData) throws IOException
{
	FileInputStream fis=new FileInputStream("./src/main/resources/commonDate.properties");
	Properties p=new Properties();
	p.load(fis);
	String commonData=p.getProperty(comData);
	
	return commonData;
}

 
}
