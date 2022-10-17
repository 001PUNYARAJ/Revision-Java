package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementAssignment {

public static void main(String[] args) {
// TODO Auto-generated method stub

		
System.setProperty("webdriver.chrome.driver",
"C:\\Users\\manan\\OneDrive\\Desktop\\Selenium 4 files\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();    	
		
		//SendKeys
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.findElement(By.className("login")).click();
		
		//driver.findElement(By.id("email")).sendKeys("manandhar.punyaraj@gmail.com");
		driver.findElement(By.cssSelector("input[id=\"email\"]")).sendKeys("manandhar.punyaraj@gmail.com");	
		
		//driver.findElement(By.id("passwd")).sendKeys("Home123");
		//driver.findElement(By.cssSelector("input[name=\"passwd\"]")).sendKeys("Home123");
		driver.findElement(By.cssSelector("input[id=\"passwd\"]")).sendKeys("Home123");
		
		driver.findElement(By.cssSelector("input[class=\"search_query form-control ac_input\"]")).sendKeys("T-Shirt");
		driver.findElement(By.cssSelector("button[name=\"submit_search\"]")).click();
		driver.findElement(By.cssSelector("input[class=\"search_query form-control ac_input\"]")).clear();
	
		String P = driver.findElement(By.cssSelector("input[class=\"search_query form-control ac_input\"]")).getAttribute("id");
		System.out.println(P);
		String Q = driver.findElement(By.cssSelector("input[class=\"search_query form-control ac_input\"]")).getAttribute("class");
		System.out.println(Q);
		
		String R = driver.findElement(By.className("sf-with-ul")).getText();
		System.out.println(R);
		String S = driver.findElement(By.cssSelector("a[title=\"View a top sellers products\"]")).getText();
		System.out.println(S);
	}

}
