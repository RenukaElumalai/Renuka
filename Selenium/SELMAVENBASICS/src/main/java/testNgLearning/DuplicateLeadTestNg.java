package testNgLearning;

import java.util.Scanner;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import wdMethods.ProjectMethods;

public class DuplicateLeadTestNg extends ProjectMethods {

	@Test(groups="sanity",dependsOnGroups="smoke")

	public  void DuplicateLead() throws InterruptedException {

		WebElement leads= locateElement("link","Leads");
		click(leads);
		WebElement findLead= locateElement("link","Find Leads");
		click(findLead);
		WebElement email= locateElement("link","Email");
		click(email);
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the email id");
		String email1=sc.next();
		WebElement eAddress= locateElement("name","emailAddress");
		type(eAddress,email1);
		Thread.sleep(2000);
		WebElement findLead1= locateElement("xpath","//button[text()='Find Leads']");
		click(findLead1);
		Thread.sleep(2000);
		WebElement noRecords=locateElement("class","x-paging-info");
		String noRecords1=getText(noRecords);
		if(noRecords1.equalsIgnoreCase("No Records to display"))
		{
			System.out.println("Enter the valid email id");
		}
		else
		{
			WebElement firstName= locateElement("xpath","//div[@class='x-grid3-cell-inner x-grid3-col-firstName'][1]");
			WebElement firstLink= locateElement("xpath","(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]");
			click(firstLink);
		}
		WebElement dupLead= locateElement("link","Duplicate Lead");
		click(dupLead);
		WebElement titleAct= locateElement("id","sectionHeaderTitle_leads");
		verifyExactText(titleAct,"Duplicate Lead");
		WebElement submit1= locateElement("class","smallSubmit");
		click(submit1);
		WebElement firstName1= locateElement("id","viewLead_firstName_sp");
		String dupFirst=getText(firstName1);
		verifyExactText(firstName1,dupFirst);
		System.out.println("Duplicate Lead success");




	}

}
