package testCases;

import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.junit.Test;

import wdMethods.ProjectMethods;

public class DeleteLeadSe extends ProjectMethods {

	//@Test(dependsOnMethods="testCases.CreateLead.leadCreation")
	@Test
	public void DeleteLead() throws InterruptedException {
		loginTestLeaf();
		WebElement lead =locateElement("link","Leads");
		click(lead);
		WebElement findLeads = locateElement("link", "Find Leads");
		click(findLeads);
		WebElement phone = locateElement("xpath", "//span[text()='Phone']");
		click(phone);
		WebElement phoneNum=locateElement("xpath", " //input[@name='phoneNumber']");
		type(phoneNum, "1234");
		WebElement findLeads1 =locateElement("xpath", "//button[text()='Find Leads']");
		click(findLeads1);
		Thread.sleep(4000);
		WebElement firstEle = locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]");
		String leadId=getText(firstEle);
		System.out.println(leadId);
		Thread.sleep(2000);
		click(firstEle);
		WebElement dele =locateElement("class", "subMenuButtonDangerous");
		click(dele);
		WebElement findLeads2 = locateElement("link", "Find Leads");
		click(findLeads2);
		WebElement leadId1 = locateElement("name", "id");
		type(leadId1, leadId);
		WebElement findLeads3 = locateElement("xpath", "//button[text()='Find Leads']");
		click(findLeads3);
		WebElement errDisp = locateElement("class", "x-paging-info");
		verifyPartialText(errDisp, "No records to display");
		closeBrowser();


	}

}
