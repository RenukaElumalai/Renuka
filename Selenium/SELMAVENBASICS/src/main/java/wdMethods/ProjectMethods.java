package wdMethods;


import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class ProjectMethods extends SeMethods {
	
	@Parameters({"browser","url","username","password"})
	@BeforeMethod(groups={"smoke","sanity","regression"})
	//BeforeMethod(groups="common")
	public void loginTestLeaf(String browser,String url,String username,String password)
	{
	startApp(browser, url);
	WebElement username1 = locateElement("id","username");
	type(username1,username);
	WebElement password1 = locateElement("id","password");
	type(password1,password);
	WebElement submit = locateElement("class","decorativeSubmit");
	click(submit);
	WebElement crmLink = locateElement("link","CRM/SFA");
	click(crmLink);
	}
	
	@AfterMethod(groups="common")
	public void closeApp()
	{
		closeBrowser();
	}
	
	

/*	@BeforeMethod(groups={"smoke","sanity","regression"})
	//BeforeMethod(groups="common")
	public void loginTestLeaf()
	{
	startApp("chrome", "http://leaftaps.com/opentaps");
	WebElement username = locateElement("id","username");
	type(username,"DemoSalesManager");
	WebElement password = locateElement("id","password");
	type(password,"crmsfa");
	WebElement submit = locateElement("class","decorativeSubmit");
	click(submit);
	WebElement crmLink = locateElement("link","CRM/SFA");
	click(crmLink);
	}
	
	@AfterMethod(groups="common")
	public void closeApp()
	{
		closeBrowser();
	}
	*/
	 
	

}
