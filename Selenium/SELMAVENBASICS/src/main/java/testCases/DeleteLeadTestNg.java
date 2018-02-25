package testCases;

import org.openqa.selenium.WebElement;

import wdMethods.ProjectMethods;

public class DeleteLeadTestNg  extends ProjectMethods {

	public  void deleteLeadTestNg()
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
		System.out.println("DeleteLead");

	}
}