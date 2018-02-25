package week1.day0;
// import java.awt.List;
// import org.apache.bcel.generic.Select;
// import org.openqa.selenium.support.ui.Select;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class GetAllValuesInDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");	
		//launch Browser
		ChromeDriver driver = new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//Load the URL
		driver.get("http://leaftaps.com/opentaps");
		//enter username
		driver.findElementById("username").clear();
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("TestLeaf");
		driver.findElementById("createLeadForm_firstName").sendKeys("GayuShan");
		driver.findElementById("createLeadForm_lastName").sendKeys("Priya");
		WebElement source=driver.findElementById("createLeadForm_dataSourceId");
		Select dropdown=new Select(source); 
		List<WebElement> allSourceOptions = dropdown.getOptions();
		for(WebElement eachSource :allSourceOptions)
		{
		System.out.println(eachSource.getText());
		}
		dropdown.selectByValue("LEAD_EMPLOYEE");
	}
}
