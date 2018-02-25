package week1.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Homework {
	

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps");
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("//span[text()= 'Phone']").click();
		driver.findElementByName("phoneNumber").sendKeys("9900091234");
		driver.findElementByXPath("//button[text()= 'Find Leads']").click();
		
		
		driver.findElementByLinkText("12954").click();
		driver.findElementByLinkText("Edit").click();
		driver.findElementById("updateLeadForm_companyName").sendKeys("updatedcompanyName");
		driver.findElementByClassName("smallSubmit").click();
		
		
		

	}

}
