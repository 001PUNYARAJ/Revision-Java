package day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown {

public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver",
"C:\\Users\\manan\\OneDrive\\Desktop\\Selenium 4 files\\chromedriver_win32\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();    	
						
	driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
	
//	WebElement Dropdown = driver.findElement(By.id("dropdowm-menu-1"));
//	Select select = new Select (Dropdown);
//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//	select.selectByIndex(1);			//selectByIndex
//	select.selectByValue("python");		//selcetByValue
//	select.selectByVisibleText("SQL");	//selcetByVisibleText
	
	WebElement Dropdown1 = driver.findElement(By.id("dropdowm-menu-3"));
	Select select = new Select(Dropdown1);
	select.selectByIndex(2);     	//select By Index
	select.selectByValue("css"); 	//select By Value 
	select.selectByVisibleText("JQuery");

	
	}

}
