package day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropDown {

	public static void main(String[] args) {
		

	System.setProperty("webdriver.chrome.driver",
	"C:\\Users\\manan\\OneDrive\\Desktop\\Selenium 4 files\\chromedriver_win32\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();    	
	driver.get("http://www.webdriveruniversity.com/Autocomplete-TextField/autocomplete-textfield.html");
	driver.manage().window().maximize();
	
	driver.findElement(By.id("myInput")).sendKeys("Ca");
	driver.findElement(By.id("myInput")).sendKeys(Keys.ARROW_DOWN);
	driver.findElement(By.id("myInput")).sendKeys(Keys.ENTER);
	driver.findElement(By.id("submit-button")).click();
	
	
//	Validate Url
	String currentUrl = driver.getCurrentUrl();
	System.out.println(currentUrl);
	
	


	
	}
}





