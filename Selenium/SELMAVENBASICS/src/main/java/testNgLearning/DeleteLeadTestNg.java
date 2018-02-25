package testNgLearning;

import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import wdMethods.ProjectMethods;

public class DeleteLeadTestNg  extends ProjectMethods {

	@Test(groups="smoke",dataProvider="fetchData")
	//@Test
	public void DeleteLead(String pNum) throws InterruptedException {

		WebElement lead =locateElement("link","Leads");
		click(lead);
		WebElement findLeads = locateElement("link", "Find Leads");
		click(findLeads);
		WebElement phone = locateElement("xpath", "//span[text()='Phone']");
		click(phone);
		WebElement phoneNum=locateElement("xpath", " //input[@name='phoneNumber']");
		type(phoneNum, pNum);
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

	}@DataProvider(name="fetchData")	
	public Object[][] getData(){
		
		Object[][] data=new Object[1][1];
		data[0][0]="1";


		return data;
	}
	
}