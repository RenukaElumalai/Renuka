package week1.day0;

import org.openqa.selenium.chrome.ChromeDriver;

public class Week1day1Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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
		driver.findElementById("createLeadForm_firstName").sendKeys("Gayu");
		driver.findElementById("createLeadForm_lastName").sendKeys("Bala"); 
		driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("9655838694");
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByLinkText("Phone").click();
		driver.findElementByName("phoneCountryCode").clear();
		driver.findElementByName("phoneNumber").sendKeys("96");
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
		driver.findElementByLinkText("Edit").click();
		driver.findElementById("updateLeadForm_companyName").clear();
		driver.findElementById("updateLeadForm_companyName").sendKeys("TCS");
		driver.findElementByXPath("(//input[@name='submitButton'])[1]").click();
		driver.close();
		System.out.println("Congrats!!!!!!!!!!!!You have completed your task successfully!!!!!Hurrah!!!!!");
	
			
	}
}

	
