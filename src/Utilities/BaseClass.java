package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
public static  WebDriver driver=null;
public static  void openBrowser(){
	String browser=getProperty("browser");
	if(browser.equalsIgnoreCase("chrome")){
		System.setProperty("webdriver.chrome.driver", getProperty("chromepath"));
		driver=new ChromeDriver();
	}
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
}
public static String getProperty(String string){
	Properties property=new Properties();
	File file=new File("config.properties");
	FileInputStream inputstream = null;
	try {
		inputstream = new FileInputStream(file);
	} catch (FileNotFoundException e1) {
		System.out.println("Config file path is not correct");
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	try {
		property.load(inputstream);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println(property.getProperty(string));
	return property.getProperty(string);
}
}
