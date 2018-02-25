package wdMethods;

//import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class ProjectMethods extends SeMethods{
	@BeforeSuite
	public void suite()
	{
		System.out.println("Before Suite");
	}
	@BeforeTest
	public void test()
	{
		System.out.println("Before test");
	}
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before class");
	}
	
	
	@BeforeMethod
	public void LoginTestLeaf()
	{
		startApp("chrome", "http://leaftaps.com/opentaps");
		WebElement userName = locateElement("username");
		type(userName, "DemoSalesManager");
		WebElement password = locateElement("password");
		type(password, "crmsfa");
		WebElement submit = locateElement("class", "decorativeSubmit");
		click(submit);	
		WebElement CRMSFA = locateElement("link","CRM/SFA");
		click(CRMSFA);
		WebElement Lead = locateElement("link","Leads");
		click(Lead);
			
	}
	@AfterMethod
	public void closebrowser()
	{
		closeBrowser();
	}
	
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("After class");
	}
	@AfterTest
	public void afterTest()
	{
		System.out.println("After test");
	}
	@AfterSuite
	public void aftersuite()
	{
		System.out.println("after Suite");
	}
	
	
	}
	
	


