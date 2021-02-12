package vtiger_crm_pomclass;

import java.io.FileInputStream;
import java.util.Properties;



public class Filelib  {

	public String getLogin(String path,String key,String key1) throws Throwable
	{
		FileInputStream fis=new FileInputStream(path);
		Properties prop=new Properties();
		prop.load(fis);
		String user = prop.getProperty(key,"please enter valid");
		return user;
	}
	
}
