package week1.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.manage().window().maximize();

driver.get("http://leaftaps.com/opentaps");
driver.findElementById("username").sendKeys("DemoSalesManager");
driver.findElementById("password").sendKeys("crmsfa");
driver.findElementByClassName("decorativeSubmit").click();

driver.findElementByLinkText("CRM/SFA").click();
driver.findElementByLinkText("Leads").click();
driver.findElementByLinkText("Create Lead").click();
driver.findElementById("createLeadForm_companyName").sendKeys("Infy");

driver.findElementById("createLeadForm_firstName").sendKeys("renu");
driver.findElementById("createLeadForm_lastName").sendKeys("Elu");
driver.findElementByName("submitButton").click();
}
}