package week1.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Irctc {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementById("userRegistrationForm:userName").sendKeys("RRenu");
		driver.findElementById("userRegistrationForm:password").sendKeys("Rdolly@06");
		driver.findElementById("userRegistrationForm:confpasword").sendKeys("Rdolly@06");
		//driver.findElementById("userRegistrationForm:password").sendKeys("Rdolly@06");
		//driver.findElementById("userRegistrationForm:password").sendKeys("Rdolly@06");
		//driver.findElementById("userRegistrationForm:password").sendKeys("Rdolly@06");
		//driver.findElementById("userRegistrationForm:password").sendKeys("Rdolly@06");
		
		
		
		
		
		
		

	}

}
