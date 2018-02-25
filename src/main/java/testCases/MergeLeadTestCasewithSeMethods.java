package testCases;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import wdMethods.SeMethods;

public class MergeLeadTestCasewithSeMethods extends SeMethods{

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
		WebElement MergeLead = locateElement("link","Merge Leads");
		click(MergeLead);
		WebElement fromfieldlukup=locateElement("xpath","(//img[@src='/images/fieldlookup.gif'])[1]");
		clickWithoutSnap(fromfieldlukup);		
		switchToWindow(1);
		//WebElement FromLead = locateElement("xpath","(//input[@name='id']");
		WebElement fromleadvale= locateElement("name","id");
		type(fromleadvale, "10228");
		WebElement FindLeads = locateElement("xpath","//button[text()='Find Leads']");
		click(FindLeads);
		Thread.sleep(3000);
		WebElement FindedEleclick = locateElement("xpath","(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]");
		clickWithoutSnap(FindedEleclick);
		switchToWindow(0);			
		WebElement tofieldlukup=locateElement("xpath","(//img[@src='/images/fieldlookup.gif'])[2]");
		clickWithoutSnap(tofieldlukup);		
		switchToWindow(1);			
		//WebElement ToLead = locateElement("name","id");
		//type(ToLead, "10155");
		WebElement FindLeads1 = locateElement("xpath","(//button[text()='Find Leads'])");
		click(FindLeads1);
		Thread.sleep(3000);
		WebElement FindedtoEleclick = locateElement("xpath","(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]");
		clickWithoutSnap(FindedtoEleclick);
		switchToWindow(0);
		WebElement mergerleadbutton=locateElement("class","buttonDangerous");
		clickWithoutSnap(mergerleadbutton);
		acceptAlert();		
		WebElement FindLeadmainlink = locateElement("link","Find Leads");
		click(FindLeadmainlink);	
		WebElement findid= locateElement("name","id");
		type(findid,"10301");
		WebElement findleadbutton=locateElement("xpath","//button[text()= 'Find Leads']");
		click(findleadbutton);
		WebElement result = locateElement("xpath","//div[text()='No records to display']");
		verifyExactText(result,"No records to display");
		//closeBrowser();
		//closeAllBrowsers();
		





	}
}
















