package testCases;

import org.junit.Test;
import org.openqa.selenium.WebElement;
import wdMethods.ProjectMethods;

public class DeleteLead extends ProjectMethods{
	@Test

	public void Dlead () {
		LoginTestLeaf();
		WebElement FindLeadmainlink = locateElement("link","Find Leads");
		click(FindLeadmainlink);
		


	}
}
