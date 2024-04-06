package config;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import test2.PropertiesFileTest_TestNG;

public class PropertiesFile {
	
	static Properties prop = new Properties();
	static String ProjectPath = System.getProperty("user.dir");

	public static void main(String[] args) {
		getProperties();
		SetProperties();
		getProperties();
		

	}
	
	public static void getProperties() {
		
		try {
			
			
			InputStream ip = new FileInputStream(ProjectPath+"/src/test/java/config/config.properties");
			prop.load(ip);
			String br = prop.getProperty("browser");
			System.out.println(br);
			PropertiesFileTest_TestNG.browsername = br;
			
		}
		catch (Exception e){
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
		
	}
	
	public static void SetProperties() {
		
		try {
			OutputStream op = new FileOutputStream(ProjectPath+"/src/test/java/config/config.properties");
			prop.setProperty("browser", "chrome");
			prop.store(op, null);
			
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
		
		
		
	}

}
