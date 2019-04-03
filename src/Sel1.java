import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Utilities.BaseClass;


public class Sel1 extends BaseClass {
public static void main(String[] args) {
//	String url="C:\\Users\\Ajay\\Downloads\\chromedriver.exe";
//	System.setProperty("webdriver.chrome.driver", url);
//	WebDriver driver=new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	openBrowser();
	driver.get("http://www.google.com");
	
}
}
