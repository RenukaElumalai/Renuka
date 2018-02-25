package testCases;

//import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import wdMethods.ProjectMethods;


public class EditLeadTestCasewithSeMethods extends ProjectMethods{

	@Test
	public void EditLead() throws InterruptedException
	{
		LoginTestLeaf();
		
		WebElement FindLeadmainlink = locateElement("link","Find Leads");
		click(FindLeadmainlink);
		//WebElement findfirstname=locateElement("name","firstName");
		WebElement findfirstname=locateElement("xpath","(//input[@name='firstName'])[3]");
		type(findfirstname,"Renu");
		WebElement findleadbutton=locateElement("xpath","//button[text()= 'Find Leads']");
		click(findleadbutton);
		Thread.sleep(3000);
		WebElement findedresult=locateElement("xpath","//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a");
		click(findedresult);
		verifyTitle("View Lead | opentaps CRM");
		WebElement editButton=locateElement("xpath","(//a[@class='subMenuButton'])[3]");
		click(editButton);
		WebElement cmpanyname = locateElement("xpath","(//input[@name='companyName'])[2]");
		type(cmpanyname,"CTS");
		WebElement clickUpdateButton=locateElement("name","submitButton");
		click(clickUpdateButton);
		WebElement upadtedCompanyData=locateElement("id","viewLead_companyName_sp");
		getText(upadtedCompanyData);
		if (getText(upadtedCompanyData).contains("CTS"))
		{
			System.out.println("Case Edited");
		}
		
		else
		{
			System.out.println("Case details not edited");
		}
			
		
		//closeBrowser();
		
		
	}

}
