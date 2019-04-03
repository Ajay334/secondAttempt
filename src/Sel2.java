import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Sel2 {
public static void main(String[] args) {
	String url="C:\\Users\\Ajay\\Downloads\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", url);
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.get("http://toolsqa.wpengine.com/automation-practice-switch-windows/");
	
	driver.findElement(By.id("timingAlert")).click();
	System.out.println("it is opened but not triggered");

	 WebDriverWait wait=new WebDriverWait(driver,10);
	 Alert myAlert=wait.until(ExpectedConditions.alertIsPresent());
	
	System.out.println("either pop up is present or it will timeout");
	
	myAlert.accept();
	System.out.println("Alert accepted");
	driver.close();
	
	
	
}
}