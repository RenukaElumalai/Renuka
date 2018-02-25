package testCases;

import java.util.Scanner;

import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");	
		//launch Browser
		ChromeDriver driver = new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//Load the URL
		driver.get("http://leaftaps.com/opentaps");
		//enter username;
				driver.findElementById("username").clear();
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByLinkText("Email").click();
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the email id");
		String email=sc.next();
		driver.findElementByName("emailAddress").sendKeys(email);
		Thread.sleep(2000);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000);
		String firstName=driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName'][1]").getText();
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").click();
		driver.findElementByLinkText("Duplicate Lead").click();
		String title=driver.findElementById("sectionHeaderTitle_leads").getText();
		if(title.equalsIgnoreCase("Duplicate Lead"))
		{
			driver.findElementByClassName("smallSubmit").click();
		}

		if(firstName.equalsIgnoreCase(driver.findElementById("viewLead_firstName_sp").getText()))
		{
			System.out.println("Duplicate Lead success");
			driver.close();
		}
	}
}


