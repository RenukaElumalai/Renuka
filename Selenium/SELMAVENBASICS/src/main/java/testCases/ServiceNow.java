package testCases;

import org.junit.Test;
import org.openqa.selenium.WebElement;

import wdMethods.SeMethods;

public class ServiceNow extends SeMethods {
	@Test
	public void ServiceNowLogin() throws InterruptedException{

		startApp("Chrome","https://dev29605.service-now.com/");
		switchToFrameByIdOrName("gsft_main");
		WebElement userName=locateElement("id","user_name");
		type(userName,"admin");
		WebElement password=locateElement("id","user_password");
		type(password,"TestLeaf@2018");
		WebElement login=locateElement("id","sysverb_login");
		click(login);
		WebElement filter=locateElement("id","filter");
		type(filter,"incident");
		WebElement createNew=locateElement("xpath","//div[text()='Create New']");
		Thread.sleep(2000);
		click(createNew);
		switchToFrameByIdOrName("gsft_main");
		WebElement incNumber=locateElement("id","incident.number");
		Thread.sleep(2000);
		String incidentNumber=incNumber.getAttribute("value");
		System.out.println(incidentNumber);
		WebElement caller=locateElement("id","sys_display.incident.caller_id");
		type(caller,"Abel");
		WebElement searchid=locateElement("id","lookup.incident.caller_id");
		click(searchid);
		switchToWindow(1);
		WebElement firstele=locateElement("xpath","//a[@class='glide_ref_item_link']");
		clickWithoutSnap(firstele);
		switchToWindow(0);
		WebElement short1=locateElement("id","incident.short_description");
		type(short1,"This is automated");
		WebElement submit=locateElement("id","sysverb_insert");
		click(submit);
		WebElement search=locateElement("xpath", "(//input[@placeholder='Search'])[12]");
		typeWithEnter(search,incidentNumber);
		WebElement firstins=locateElement("xpath", "//td[@class='vt']");
		verifyExactText(firstins, incidentNumber);







	}

}
