package testCases;

import org.openqa.selenium.WebElement;

import java.util.Scanner;

import org.junit.Test;
import org.openqa.selenium.WebDriverException;


import wdMethods.ProjectMethods;

public class EditLeadSe  extends ProjectMethods {
	@Test
	public void EditLead() throws InterruptedException
	{
		loginTestLeaf();
		WebElement lead =locateElement("link","Leads");
		click(lead);	
		WebElement findLeads = locateElement("link", "Find Leads");
		click(findLeads);
		WebElement name = locateElement("xpath", "(//div[@class='x-form-element']/input)[14]");
		type(name, "yuvi");
		WebElement findL =locateElement("xpath","//button[text()='Find Leads']");
		click(findL);
		Thread.sleep(4000);
		WebElement firstele =locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]");
		click(firstele);
		if(verifyPartialTitle("View Lead")==true)
		{
			System.out.println("We are Landing in the correct page ");
			WebElement edit =locateElement("link","Edit");
			click(edit);
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the Company Name to be entered");
			String cName=sc.next();
			WebElement companyName=locateElement("id", "updateLeadForm_companyName");
			type(companyName,cName);
			WebElement update=locateElement("xpath", "(//input[@value='Update'])");
			click(update);
			WebElement actualCName=locateElement("id", "viewLead_companyName_sp");
			String actualCoName=getText(actualCName);
			System.out.println(actualCoName);
			if((verifyPartialText(actualCName, cName))==true)
			{
				System.out.println("Congrats!!!!!!!!!Edit Lead success");
			}
			else
			{
				System.out.println("Edit Lead is not success!!!Please try Again");
			}

		}
		else
		{
			System.out.println("We are not  Landing in the correct page ");
		}
		closeBrowser();
	}	
}