package common;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyReader {

		Properties prop=new Properties();
	
	
		PropertyReader(String pathPropertyFile)
		{
			try
			{
				FileInputStream fis=new FileInputStream(pathPropertyFile);
				
				prop.load(fis);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
		
		String getValue(String key)
		{
			return prop.getProperty(key);
		}
		
		
}
