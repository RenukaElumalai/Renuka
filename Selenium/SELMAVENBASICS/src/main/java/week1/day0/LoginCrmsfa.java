package week1.day0;

import org.openqa.selenium.chrome.ChromeDriver;

public class LoginCrmsfa {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");	
		//launch Browser
		ChromeDriver driver = new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//Load the URL
		driver.get("http://leaftaps.com/opentaps");
		//enter username
		driver.findElementById("username").clear();
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("TestLeaf");
		driver.findElementById("createLeadForm_firstName").sendKeys("GayuShan");
		driver.findElementById("createLeadForm_lastName").sendKeys("Priya");
		driver.findElementByClassName("smallSubmit").click();
		
		


	}

}
