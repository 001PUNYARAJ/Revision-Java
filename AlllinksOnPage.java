package day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlllinksOnPage {

	public static void main(String[] args) {
		

	System.setProperty("webdriver.chrome.driver",
	"C:\\Users\\manan\\OneDrive\\Desktop\\Selenium 4 files\\chromedriver_win32\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();    	
	driver.get("http://www.webdriveruniversity.com/");
	driver.manage().window().maximize();
	
	List <WebElement> allLinks = driver.findElements(By.tagName("a"));
//	Total Number of Links
	System.out.println("Total Number of Links "+ allLinks.size());
		
//	Links Urls
	for(int a= 0; a <allLinks.size(); a++) {
		System.out.println(allLinks.get(a).getAttribute("href"));
//	Link Text
		System.out.println(allLinks.get(a).getText());
		}
	
	}
}
