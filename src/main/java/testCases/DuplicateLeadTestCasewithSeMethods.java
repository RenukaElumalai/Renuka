package testCases;


import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import wdMethods.SeMethods;

public class DuplicateLeadTestCasewithSeMethods extends SeMethods{
	@Test
	public void login() throws InterruptedException {		
		/*startApp("chrome", "http://leaftaps.com/opentaps");
		WebElement userName = locateElement("username");
		type(userName, "DemoSalesManager");
		WebElement password = locateElement("password");
		type(password, "crmsfa");
		WebElement submit = locateElement("class", "decorativeSubmit");
		click(submit);	
		WebElement CRMSFA = locateElement("link","CRM/SFA");
		click(CRMSFA);
		WebElement Lead = locateElement("link","Leads");
		click(Lead);*/
		WebElement FindLeadmainlink = locateElement("link","Find Leads");
		click(FindLeadmainlink);
		WebElement findid= locateElement("name","id");
		type(findid,"10886");
		WebElement findleadbutton=locateElement("xpath","//button[text()= 'Find Leads']");
		click(findleadbutton);
		WebElement findedresult=locateElement("xpath","//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a");
		
		//WebElement findedresult=locateElement("xpath","//a[@class='linktext'][1]");
		click(findedresult);
		WebElement DuplicateIcon=locateElement("class","subMenuButton");
		click(DuplicateIcon);
		WebElement submitbut = locateElement("name", "submitButton");
		click(submitbut);	
		WebElement Dupdata=locateElement("viewLead_companyName_sp");
		String text1 = getText(Dupdata);
		System.out.println(text1);
		if (text1.equalsIgnoreCase("10886")	)
		{
		System.out.println("Not Success");
		}
		else
		{
			System.out.println("Success");		
		}
		
		//closeBrowser();
		
		
		
		
		
		
		
		
		
	}

		
	}


