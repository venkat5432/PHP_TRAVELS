package common;

import common.PropertyReader;

public class Configurations {

	
	public static final String config_file="config.properties";

	
	static PropertyReader prop=new PropertyReader(config_file);;




	


	public static String getCredentialsFilePath() 
	{
		return prop.getValue("credentials_file_path");
	}
}
