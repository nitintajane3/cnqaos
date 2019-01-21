package com.qa.sampletest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testbase
{
	public static WebDriver driver;
	public static Properties properties;
	
	public testbase() throws IOException 
	{
		try 
		{
			
		
		properties = new Properties();
		FileInputStream inputfile = new FileInputStream("user.dir"+"src/com/properties.properties");
		properties.load(inputfile);
		} catch (FileNotFoundException e) 
		{
			// TODO: handle exception
			e.printStackTrace();
		}catch(IOException test) 
		{
			test.printStackTrace();
			
		}
		
	}
	
public void initialization() 
{
	
	String profilename = properties.getProperty("browser");
	
	if(profilename.equals(""))
	{
		System.setProperty("webdriver.chrome.driver","");
		
	}
	else if (profilename.equals("firefox"))
	{
		System.setProperty("webdriver.gecko.driver","");
		driver = new FirefoxDriver();
		
		
	}
	
}
	
}
