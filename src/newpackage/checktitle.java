package newpackage;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class checktitle {
	
	public static void main(String[] args) throws InterruptedException {
	
	String baseUrl = "http://demo.guru99.com/test/newtours/";
    String expectedTitle = "Welcome: Mercury Tours";
    String actualTitle = "";
	
    System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com");
	driver.get(baseUrl);
	actualTitle=driver.getTitle();
	driver.manage().window().maximize();
	driver.navigate().back();
	if(actualTitle.contentEquals(expectedTitle))
    
	{
		System.out.println("Matching");
	}
	else
	{
	System.out.println("Not matching");
	}
	driver.navigate().back();
driver.close();
}}