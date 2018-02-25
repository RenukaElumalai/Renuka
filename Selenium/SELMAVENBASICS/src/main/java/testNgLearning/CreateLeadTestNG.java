package testNgLearning;

import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import wdMethods.ProjectMethods;


public class CreateLeadTestNG extends ProjectMethods{

	@Test(groups="smoke",dataProvider="fetchData")
	//@Test(dataProvider="fetchData")

	public  void createLeadAll(String cName,String fName,String lName) throws InterruptedException 
	{
		WebElement lead=locateElement("link","Leads");
		click(lead);
		WebElement createLead=locateElement("link","Create Lead");
		click(createLead);
		WebElement companyName=locateElement("id","createLeadForm_companyName");
		type(companyName,cName);
		WebElement account=locateElement("xpath","(//img[@src='/images/fieldlookup.gif'])");
		click(account);
		switchToWindow(1);	
		WebElement id=locateElement("name","id");
		type(id,"democlass1");
		WebElement findAccount=locateElement("xpath","//button[text()='Find Accounts']");
		click(findAccount);
		Thread.sleep(2000);
		WebElement firstEle=locateElement("xpath","(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)");
		clickWithoutSnap(firstEle);
		switchToWindow(0);	
		WebElement firstName=locateElement("id","createLeadForm_firstName");
		type(firstName,fName);
		WebElement lastName=locateElement("id","createLeadForm_lastName");
		type(lastName,lName);
		WebElement source=locateElement("id","createLeadForm_dataSourceId");
		selectDropDownUsingIndex(source,1);
		WebElement industry=locateElement("id","createLeadForm_industryEnumId");
		selectDropDownUsingIndex(industry,6);
		WebElement currency=locateElement("id","createLeadForm_currencyUomId");
		selectDropDownUsingText(currency,"AFA - Afghani");
		WebElement submit1=locateElement("class","smallSubmit");
		click(submit1);
		System.out.println("Success");


	}
@DataProvider(name="fetchData")	
public Object[][] getData(){
	
	Object[][] data=new Object[1][3];
	data[0][0]="TCS";
	data[0][1]="Gayu";
	data[0][2]="Bala";

	return data;
}


}