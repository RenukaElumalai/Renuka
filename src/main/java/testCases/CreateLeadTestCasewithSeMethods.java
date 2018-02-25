package testCases;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

//import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import wdMethods.ProjectMethods;
import wdMethods.SeMethods;

public class CreateLeadTestCasewithSeMethods extends ProjectMethods{

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
		WebElement CreateLead = locateElement("link","Create Lead");
		click(CreateLead);
		WebElement cmpanyname = locateElement("createLeadForm_companyName");
		type(cmpanyname,"Infy");
		WebElement fname = locateElement("createLeadForm_firstName");
		type(fname, "Renu");
		WebElement lname = locateElement("createLeadForm_lastName");
		type(lname, "Shamilee");
		WebElement sourcedrop = locateElement("id", "createLeadForm_dataSourceId");
		selectDropDownUsingIndex(sourcedrop,1);
		WebElement industry = locateElement("id", "createLeadForm_industryEnumId");
		selectDropDownUsingIndex(industry,1);	
		WebElement FnameLocal=locateElement("name","firstNameLocal");
		type(FnameLocal,"R");
		WebElement objpersonalTitle=locateElement("name","personalTitle");
		type(objpersonalTitle,"Test");
		WebElement objgeneralTitle=locateElement("name","generalProfTitle");
		type(objgeneralTitle,"Test");
		WebElement objannualReview=locateElement("id","createLeadForm_annualRevenue");
		type(objannualReview,"5000");
		WebElement objSicCode=locateElement("name","sicCode");
		type(objSicCode,"123");
		WebElement Ownership = locateElement("id", "createLeadForm_ownershipEnumId");
		selectDropDownUsingIndex(Ownership,1);
		WebElement objdescription = locateElement("id", "createLeadForm_description");
		type(objdescription,"Testing");
		WebElement objCLimpnote = locateElement("id", "createLeadForm_importantNote");
		type(objCLimpnote,"Testing");
		WebElement objPrimaryPhoneareacode = locateElement("id", "createLeadForm_primaryPhoneAreaCode");
		type(objPrimaryPhoneareacode,"123412");
		WebElement objPrimaryPhoneareaExtn = locateElement("id", "createLeadForm_primaryPhoneExtension");
		type(objPrimaryPhoneareaExtn,"123222");
		WebElement objPrimarymail = locateElement("id", "createLeadForm_primaryEmail");
		type(objPrimarymail,"R@R.com");
		WebElement objtoname = locateElement("id", "createLeadForm_generalToName");
		type(objtoname,"RR");
		WebElement objaddline = locateElement("id", "createLeadForm_generalAddress1");
		type(objaddline,"XYZS");
		WebElement Marketing = locateElement("id","createLeadForm_marketingCampaignId");
		selectDropDownUsingIndex(Marketing,1);
		WebElement objlastnameloc = locateElement("id", "createLeadForm_lastNameLocal");
		type(objlastnameloc,"lastname");
		WebElement objdepartname = locateElement("id", "createLeadForm_departmentName");
		type(objdepartname,"testing");
		WebElement objnoofemp = locateElement("id", "createLeadForm_numberEmployees");
		type(objnoofemp,"45");		
		WebElement objtickersymbol = locateElement("id", "createLeadForm_tickerSymbol");
		type(objtickersymbol,"test");	
		WebElement objcity = locateElement("id", "createLeadForm_generalCity");
		type(objcity,"test");
		WebElement objpostercode = locateElement("id", "createLeadForm_generalPostalCode");
		type(objpostercode,"test");
		WebElement objpostercodeextn = locateElement("id", "createLeadForm_generalPostalCodeExt");
		type(objpostercodeextn,"test");
		WebElement objprimayphnum = locateElement("id", "createLeadForm_primaryPhoneNumber");
		type(objprimayphnum,"11111");
		WebElement objprimayweburl= locateElement("id", "createLeadForm_primaryWebUrl");
		type(objprimayweburl,"https:\\");
		WebElement objgeneralatte = locateElement("id", "createLeadForm_generalAttnName");
		type(objgeneralatte,"test");
		
		WebElement pplask = locateElement("id", "createLeadForm_primaryPhoneAskForName");
		type(pplask,"test");		
		
		WebElement objstate = locateElement("id", "createLeadForm_generalStateProvinceGeoId");
		selectDropDownUsingIndex(objstate,1);
		
		WebElement objadline = locateElement("id", "createLeadForm_generalAddress2");
		type(objadline,"test");
		WebElement Parent = locateElement("xpath","(//img[@src='/images/fieldlookup.gif'])[1]");
		click(Parent);
		switchToWindow(1);
		System.out.println("sucess");
		//WebElement parentval = locateElement("xpath","(//input[@name='id']");
		WebElement Parenvalue=locateElement("name","id");
		type(Parenvalue,"Company");
		WebElement actno= locateElement("xpath","//button[text() ='Find Accounts']");
		click(actno);
		WebElement actnovalue= locateElement("link","Company");
		clickWithoutSnap(actnovalue);
		switchToWindow(0);		
		
		WebElement submitbut = locateElement("name", "submitButton");
		click(submitbut);	
		
		WebElement getidvalue=locateElement("id","viewLead_companyName_sp");
		System.out.println(getText(getidvalue));
	//	closeBrowser();
		
		
		
		
		
		
		
		
		
		
		
	}

		
	
	

}
