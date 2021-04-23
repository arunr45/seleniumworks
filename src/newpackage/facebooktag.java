package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebooktag {
	
	public static void main(String[] args) 
	{
	
	
	String baseUrl="https://www.facebook.com/";
	String tagName="";
	System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get(baseUrl);
	driver.findElement(By.id("email")).click();
	tagName=driver.findElement(By.id("email")).getTagName();
	System.out.println("The tag name is"+tagName);
	
	
	}
}