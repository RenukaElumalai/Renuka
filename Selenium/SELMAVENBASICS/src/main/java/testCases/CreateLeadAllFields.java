package testCases;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLeadAllFields {

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
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("TCS");
		driver.findElementByXPath("(//img[@src='/images/fieldlookup.gif'])").click();
		Set<String> allWin=driver.getWindowHandles();
		List<String> list=new ArrayList<String>();
		list.addAll(allWin);
		driver.switchTo().window(list.get(1));
		driver.findElementByName("id").sendKeys("10102");
		driver.findElementByXPath("//button[text()='Find Accounts']").click();
		Thread.sleep(2000);
		System.out.println("success");
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)").click();
		driver.switchTo().window(list.get(0));
		driver.findElementById("createLeadForm_firstName").sendKeys("GayuBala");
		driver.findElementById("createLeadForm_lastName").sendKeys("GayuBala");
		Select source=new Select(driver.findElementById("createLeadForm_dataSourceId"));
		source.selectByIndex(1);
		//driver.findElementById("createLeadForm_birthDate-button").click();
		//driver.findElementByClassName("today day selected").click();
		Select industry=new Select(driver.findElementById("createLeadForm_industryEnumId"));
		industry.selectByIndex(5);
		Select currency=new Select(driver.findElementById("createLeadForm_currencyUomId"));
		currency.selectByVisibleText("AFA - Afghani");
		driver.findElementByClassName("smallSubmit").click();
		System.out.println("Hurrah!!!!!!!project is sucessful");
	}

}
