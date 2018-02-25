package testCases;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import wdMethods.SeMethods;

public class CreateLead extends SeMethods{
	@Test
	public void leadCreation() 
	{

		//	leanrStatic.
		startApp("chrome", "http://leaftaps.com/opentaps");
		WebElement username = locateElement("id","username");
		type(username,"DemoSalesManager");
		WebElement password = locateElement("id","password");
		type(password,"crmsfa");
		WebElement submit = locateElement("class","decorativeSubmit");
		click(submit);
		WebElement crmLink = locateElement("link","CRM/SFA");
		click(crmLink);
		WebElement leads = locateElement("link","Leads");
		click(leads);
		WebElement createlead = locateElement("link","Create Lead");
		click(createlead);
		WebElement compName = locateElement("id","createLeadForm_companyName");
		type(compName,"TCS");
		WebElement fName = locateElement("id","createLeadForm_firstName");
		type(fName,"Shanthi");
		WebElement lName = locateElement("id","createLeadForm_lastName");
		type(lName,"Gayathri");
		WebElement smallSubmit = locateElement("class","smallSubmit");
		click(smallSubmit);
	}
}
