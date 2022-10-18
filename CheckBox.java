package day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

public static void main(String[] args) {
	// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver",
"C:\\Users\\manan\\OneDrive\\Desktop\\Selenium 4 files\\chromedriver_win32\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();    	
//	Arrangment									
	driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
	driver.manage().window().maximize();
	
//	driver.findElement(By.cssSelector("input[value=\"option-1\"]")).click();
//	Action
	WebElement CheckBok = driver.findElement(By.cssSelector("input[value=\"option-1\"]"));	
	CheckBok.click();
//	CheckBok.click();
//	Assertion
	if (CheckBok.isSelected()) {
		System.out.println("Checkbox Option 1 is selected");
	}
	else {
		System.out.println("Checkbox Option 1 is not selected");
	}
	
//	Select All CheckBox
	List<WebElement> checkboxes = driver.findElements(By.cssSelector("input[type=\"checkbox\"]"));
	for (int a=0; a <checkboxes.size(); a++) {
		System.out.println(a);
	if (!checkboxes.get(a).isSelected()) {
		checkboxes.get(a).click();
		
	}
}
	
	
