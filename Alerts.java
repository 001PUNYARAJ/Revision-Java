package day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) {
		

	System.setProperty("webdriver.chrome.driver",
	"C:\\Users\\manan\\OneDrive\\Desktop\\Selenium 4 files\\chromedriver_win32\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();    	
	driver.get("http://www.webdriveruniversity.com/Popup-Alerts/index.html");
	driver.manage().window().maximize();
	
	driver.findElement(By.id("button1")).click();
	driver.switchTo().alert().accept();
	
	driver.findElement(By.id("button2")).click();
	driver.switchTo().alert().dismiss();
	
	driver.findElement(By.id("button3")).click();
	driver.switchTo().alert().accept();
	
	driver.findElement(By.id("button4")).click();
//	driver.switchTo().alert().accept();
	driver.switchTo().alert().dismiss();
	

	
	
	
	
	
	
	
	}
}





