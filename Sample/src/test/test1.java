
package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class test1 {
	WebDriver driver;
	//Test aanotations
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DivyaA\\Downloads\\chromedriver_\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.google.com");
	}
	
	@Test(priority=1)
	public void verifyTitle() {
		String title = driver.getTitle();
		System.out.println(title);
	}
	
	@Test(priority=2)
	public void verifyPage() {
		String source = driver.getPageSource();
		System.out.println(source);
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}	
	/*@Test
	public void settt() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DivyaA\\Downloads\\chromedriver_\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
	    driver.get("http://www.google.com");
	    System.out.println("hi");
	}
}*/
	

