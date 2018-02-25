package testCases;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;
public class LearnWindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe/");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		driver.findElementByLinkText("Contact Us").click();
		Set<String> allWin=driver.getWindowHandles();
		List<String> list=new ArrayList<String>();
		list.addAll(allWin);
		driver.switchTo().window(list.get(0)).close();



	}

}