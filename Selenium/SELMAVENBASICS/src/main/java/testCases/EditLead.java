package testCases;

import java.util.Scanner;

import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");	
		//launch Browser
		ChromeDriver driver = new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//Load the URL
		driver.get("http://leaftaps.com/opentaps");
		//enter username;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Companay name");
		String companyName=sc.next();
		driver.findElementById("username").clear();
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("(//div[@class='x-form-element']/input)[14]").sendKeys("Yuvi");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000);
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").click();
	    String title=driver.getTitle();
	    System.out.println(title);
	    if(title.contains("View Lead"))
	    {
	    	System.out.println("We are Landing in the correct page ");
	    	driver.findElementByLinkText("Edit").click();
	    	driver.findElementById("updateLeadForm_companyName").clear();
	    	driver.findElementById("updateLeadForm_companyName").sendKeys(companyName);
	    	driver.findElementByXPath("(//input[@value='Update'])").click();
	    	String actualName=driver.findElementById("viewLead_companyName_sp").getText();
	    	if(actualName.contains(companyName))
	    	{
	    		System.out.println("Edit Lead success");
	    		driver.close();
	    	}
	    	else
	    	{
	    		System.out.println("Edit Lead is not success!!Try Again");
	    	}
	    	
	    	
	    	
	    }
	    {
	    	System.out.println("We are not Landing in the correct page ");
	    }
	}

}
