package week2.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Windows {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementByLinkText("Contact Us").click();
		Set<String> allwindows=driver.getWindowHandles();
		List<String> listval=new ArrayList<String>();
		listval.addAll(allwindows);
		driver.switchTo().window(listval.get(0)).close();
		
		
		
		
		
		 

	}

}
