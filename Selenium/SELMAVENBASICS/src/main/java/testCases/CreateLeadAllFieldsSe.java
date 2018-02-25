package testCases;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.junit.Test;

import wdMethods.ProjectMethods;
import wdMethods.SeMethods;

public class CreateLeadAllFieldsSe extends ProjectMethods {
	@Test
	public  void createLeadAll() throws InterruptedException 
	{
		public void loginTestLeaf();
		WebElement lead=locateElement("link","Leads");
		click(lead);
		WebElement createLead=locateElement("link","Create Lead");
		click(createLead);
		WebElement companyName=locateElement("id","createLeadForm_companyName");
		type(companyName,"TCS");
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
		type(firstName,"GAYU");
		WebElement lastName=locateElement("id","createLeadForm_lastName");
		type(lastName,"BALA");
		WebElement source=locateElement("id","createLeadForm_dataSourceId");
		selectDropDownUsingIndex(source,1);
		WebElement industry=locateElement("id","createLeadForm_industryEnumId");
		selectDropDownUsingIndex(industry,6);
		WebElement currency=locateElement("id","createLeadForm_currencyUomId");
		selectDropDownUsingText(currency,"AFA - Afghani");
		WebElement submit1=locateElement("class","smallSubmit");
		click(submit1);
		System.out.println("Success");
		closeApp();



	}

	
		
	}


