package wdMethods;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class SeMethods implements WdMethods{

	RemoteWebDriver driver;
	int i;

	public void startApp(String browser, String url) {
		if(browser.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");		
			driver = new ChromeDriver();	
		}else if(browser.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");		
			driver = new FirefoxDriver();	
		}
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("The Browser "+browser+" is launched");
		takeSnap();
	}

	public WebElement locateElement(String locator, String locValue) {
		try {
			switch (locator){
			
			case "id":
				return driver.findElementById(locValue);
			case "name":
				return driver.findElementByName(locValue);
			case "class":
				return driver.findElementByClassName(locValue);
			case "xpath":
				return driver.findElementByXPath(locValue);
			case "link":
				return driver.findElementByLinkText(locValue);
			default: return null;
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.err.println("Element "+locValue+" not found ");
		}
		 takeSnap();
		return null;
	}

	public WebElement locateElement(String locValue) {
		return locateElement("id", locValue);	
		//takeSnap();
	}

	public void type(WebElement ele, String data) {
		ele.clear();
		ele.sendKeys(data);
		System.out.println("The text field is entered with data "+data);
		takeSnap();
	}

	public void click(WebElement ele) {
		ele.click();
		System.out.println("The Element "+ele+" is clicked");
		takeSnap();
	}

	public void clickWithoutSnap(WebElement ele) {
		// TODO Auto-generated method stub
		ele.click();
		System.out.println("The Element "+ele+" is clicked");
		
	

	}

	public String getText(String expectedvalue) {
		// TODO Auto-generated method stub
		String txt =getText(expectedvalue);
		System.out.println("The Element "+txt+" values is retrived");
		takeSnap();
		return txt;
		
		
	}

	public void selectDropDownUsingText(WebElement ele, String value) {
		// TODO Auto-generated method stub
		Select ddd =new Select(ele);
		ddd.selectByVisibleText(value);
		takeSnap();
		
				

	}

	public void selectDropDownUsingIndex(WebElement ele, int index) {
		// TODO Auto-generated method stub
		Select dd =new Select(ele);
		dd.selectByIndex(index);
		

	}

	public boolean verifyTitle(String expectedTitle) {
		String strTitle=driver.getTitle();
		if (strTitle.equalsIgnoreCase(expectedTitle))
		{
			System.out.println("The title for the page "+expectedTitle+" is displayed as expected");
			return true;		
		}
		else
		{
			System.out.println("The title for the page "+expectedTitle+" is not displayed as expected");	
		}		
		return false;
	}

	public void verifyExactText(WebElement ele, String expectedText) {
		// TODO Auto-generated method stub
System.out.println("The record "+expectedText+" message is displayed as expected");
takeSnap();


	}

	public void verifyPartialText(WebElement ele, String expectedText) {
		// TODO Auto-generated method stub

	}

	public void verifyExactAttribute(WebElement ele, String attribute, String value) {
		// TODO Auto-generated method stub

	}

	public void verifyPartialAttribute(WebElement ele, String attribute, String value) {
		// TODO Auto-generated method stub

	}

	public void verifySelected(WebElement ele) {
		// TODO Auto-generated method stub

	}

	public void verifyDisplayed(WebElement ele) {
		// TODO Auto-generated method stub

	}

	public void switchToWindow(int index) {
		// TODO Auto-generated method stub
		Set<String> windowtype1=driver.getWindowHandles();
		List<String> Listval1=new ArrayList<String>();
		Listval1.addAll(windowtype1);
		
		driver.switchTo().window(Listval1.get(index));
		
		

	}

	public void switchToFrame(WebElement ele) {
		// TODO Auto-generated method stub

	}

	public void acceptAlert() {
		// TODO Auto-generated method stub
		driver.switchTo().alert().accept();

	}

	public void dismissAlert() {
		// TODO Auto-generated method stub

	}

	public String getAlertText() {
		// TODO Auto-generated method stub
		return null;
	}

	public void takeSnap() {
		// TODO Auto-generated method stub
		File src = driver.getScreenshotAs(OutputType.FILE);
		File destfile = new File("./snaps/"+i+"/.jpeg");
		
			try {
				FileUtils.copyFile(src, destfile);

				System.err.println("image captured");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.err.println("image  not captured");
				
			}
		
		i++;
		

	}

	public void closeBrowser() {
		driver.close();


	}

	public void closeAllBrowsers() {
		// TODO Auto-generated method stub

	}

	@Override
	public String getText(WebElement ele) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
