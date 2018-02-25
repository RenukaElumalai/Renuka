package testNgLearning;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import wdMethods.ProjectMethods;

public class MergeLeadTestNg   extends ProjectMethods{

	//@Test(groups="regression",dependsOnGroups="sanity")
	@Test(groups="regression")
	public void MergeLeadTestNg1() throws InterruptedException {	
		WebElement lead=locateElement("link","Leads");
		click(lead);
		WebElement mergeLead=locateElement("link","Merge Leads");
		click(mergeLead);
		WebElement fromLead=locateElement("xpath","(//img[@src='/images/fieldlookup.gif'])[1]");
		click(fromLead);
		switchToWindow(1);
		WebElement fromid=locateElement("name","id");
		type(fromid,"10196");
		WebElement findLead=locateElement("xpath","//button[text()='Find Leads']");
		click(findLead);
		Thread.sleep(2000);
		WebElement firstElement=locateElement("xpath","(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a) [1]");
		String fromid1=getAttribute(firstElement, "linkText");
		System.out.println(fromid1);
		clickWithoutSnap(firstElement);
		switchToWindow(0);
		WebElement toLead=locateElement("xpath","(//img[@src='/images/fieldlookup.gif'])[2]");
		click(toLead);
		switchToWindow(1);
		WebElement toid=locateElement("name","id");
		type(toid,"10197");
		WebElement findLead1=locateElement("xpath","//button[text()='Find Leads']");
		click(findLead1);
		Thread.sleep(2000);
		WebElement firstElement1=locateElement("xpath","(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a) [1]");
		clickWithoutSnap(firstElement1);
		switchToWindow(0);
		WebElement merge=locateElement("link","Merge");
		clickWithoutSnap(merge);
		acceptAlert();
		WebElement findlead1=locateElement("link","Find Leads");
		click(findlead1);
		WebElement id1=locateElement("name","id");
		type(id1,fromid1);
		WebElement findLead2=locateElement("xpath","//button[text()='Find Leads']");
		click(findLead2);
		Thread.sleep(2000);
		WebElement noRecords=locateElement("xpath","//div[text()='No records to display']");
		
		if(verifyExactText(noRecords,"No records to display")==true)
		{
			System.out.println("Merge Success");
		}
		else
		{
			System.out.println("Please try again");
		}
	}
}
	
	
		