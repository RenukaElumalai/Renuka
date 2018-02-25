package testCases;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class MergeLead {

	public static void main(String[] args) throws InterruptedException {
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
		driver.findElementByLinkText("Merge Leads").click();
		driver.findElementByXPath("(//img[@src='/images/fieldlookup.gif'])[1]").click();
		Set<String> allWin=driver.getWindowHandles();
		List<String> list=new ArrayList<String>();
		list.addAll(allWin);
		driver.switchTo().window(list.get(1));
		driver.findElementByName("id").sendKeys("10418");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000);
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a) [1]").click();
		driver.switchTo().window(list.get(0));
		Thread.sleep(2000);
		driver.findElementByXPath("(//img[@src='/images/fieldlookup.gif'])[2]").click();
		Set<String> allWin1=driver.getWindowHandles();
		List<String> list1=new ArrayList<String>();
		list1.addAll(allWin1);
		driver.switchTo().window(list1.get(1));
		driver.findElementByName("id").sendKeys("111");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000);
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a) [1]").click();
		driver.switchTo().window(list.get(0));
		driver.findElementByLinkText("Merge").click();
		driver.switchTo().alert().accept();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByName("id").sendKeys("10418"); 
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000);
		String S1=driver.findElementByXPath("//div[text()='No records to display']").getText();
		if(S1.equalsIgnoreCase("No records to display"))
		{
			driver.close();
		}
	}
}