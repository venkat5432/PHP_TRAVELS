package common;

import common.PropertyReader;
import common.Configurations;


public class Credentials {

	
	
	
	public  String userId;
	public  String password;
	
	public  String adminUserId;
	public  String adminPassword;
	
	public  String supplierUserId;
	public  String supplierPassword;
	
	
	public Credentials(){
		
		PropertyReader prop=new PropertyReader(Configurations.getCredentialsFilePath());
		userId=prop.getValue("userId");
		password = prop.getValue("password");
		adminUserId=prop.getValue("adminUserId");
		adminPassword = prop.getValue("adminPassword");
		supplierUserId=prop.getValue("supplierUserId");
		supplierPassword = prop.getValue("supplierPassword");
		
		}
}
