package week2.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps");
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Merge Leads").click();
		driver.findElementByXPath("(//img[@src='/images/fieldlookup.gif'])[1]").click();
		Set<String> windowtype=driver.getWindowHandles();
		List<String> Listval=new ArrayList<String>();
		Listval.addAll(windowtype);
		driver.switchTo().window(Listval.get(1));
		//driver.findElementByName("id").sendKeys("10254");
		driver.findElementByXPath("//input[@name='id']").sendKeys("11308");
		driver.findElementByXPath("//button[text()='Find Leads']").click();		
		Thread.sleep(3000);
		driver.findElementByLinkText("11308").click();
		driver.switchTo().window(Listval.get(0));
		driver.findElementByXPath("(//img[@src='/images/fieldlookup.gif'])[2]").click();
		Set<String> windowtype1=driver.getWindowHandles();
		List<String> Listval1=new ArrayList<String>();
		Listval1.addAll(windowtype1);
		driver.switchTo().window(Listval1.get(1));

		driver.findElementByXPath("//input[@name='id']").sendKeys("11309");
		driver.findElementByXPath("//button[text()='Find Leads']").click();		
		Thread.sleep(3000);
		driver.findElementByLinkText("11309").click();
		driver.switchTo().window(Listval1.get(0));
		driver.findElementByClassName("buttonDangerous").click();
		driver.switchTo().alert().accept();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByName("id").sendKeys("10308");
		driver.findElementByXPath("//button[text()= 'Find Leads']").click();

		WebElement result = driver.findElementByXPath("//div[text()='No records to display']");
		if (result.getText().equalsIgnoreCase("No records to display"))
			System.out.println("Data displayed as expected");
		else
			System.out.println("Data displayed not as expected");
		driver.close();






		//driver.close();











	}

}
