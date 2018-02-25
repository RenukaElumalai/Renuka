package testCases;

import org.junit.Test;
import org.openqa.selenium.WebElement;

import wdMethods.ProjectMethods;
import wdMethods.SeMethods;

public class MergeLeadSe extends ProjectMethods {

	@Test
	public void login() throws InterruptedException {	
		loginTestLeaf();
		WebElement lead=locateElement("link","Leads");
		click(lead);
		WebElement mergeLead=locateElement("link","Merge Leads");
		click(mergeLead);
		WebElement fromLead=locateElement("xpath","(//img[@src='/images/fieldlookup.gif'])[1]");
		click(fromLead);
		switchToWindow(1);
		WebElement fromid=locateElement("name","id");
		type(fromid,"10");
		WebElement findLead=locateElement("xpath","//button[text()='Find Leads']");
		click(findLead);
		Thread.sleep(2000);
		WebElement firstElement=locateElement("xpath","(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a) [1]");
		String fromid1=getAttribute(firstElement, "linkText");
		clickWithoutSnap(firstElement);
		switchToWindow(0);
		WebElement toLead=locateElement("xpath","(//img[@src='/images/fieldlookup.gif'])[2]");
		click(toLead);
		switchToWindow(1);
		WebElement toid=locateElement("name","id");
		type(toid,"11");
		WebElement findLead1=locateElement("xpath","//button[text()='Find Leads']");
		click(findLead1);
		Thread.sleep(2000);
		WebElement firstElement1=locateElement("xpath","(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a) [1]");
		clickWithoutSnap(firstElement1);
		switchToWindow(0);
		WebElement merge=locateElement("link","Merge");
		click(merge);
		acceptAlert();
		WebElement findlead1=locateElement("link","Find Leads");
		click(findlead1);
		WebElement id1=locateElement("name","id");
		type(id1,fromid1);
		WebElement findLead2=locateElement("xpath","//button[text()='Find Leads']");
		click(findLead2);
		Thread.sleep(2000);
		WebElement noRecords=locateElement("xpath","//div[text()='No records to display']");
		verifyExactText(noRecords,"No records to display");
		closeBrowser();
	}
}