package wdMethods;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.xml.ws.WebServiceException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NotFoundException;
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
		try {
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
		} catch (NullPointerException e) {
			// TODO Auto-generated catch block
			System.err.println("Invalid browser");
		}
		catch (WebDriverException e) {
			// TODO Auto-generated catch block
			System.err.println(" Browser is not instantiated");
		}
		finally
		{
			takeSnap();
		}
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
			System.err.println("the element "+locValue+" not found");
		}
		catch (WebDriverException e) {
			// TODO Auto-generated catch block
			System.err.println("The Browser is not instantiated");
		}
		return null;

	}

	public WebElement locateElement(String locValue) {
		return locateElement("id", locValue);		
	}

	public void type(WebElement ele, String data) {
		try {
			ele.clear();
			ele.sendKeys(data);
			System.out.println("The text field is entered with data "+data);
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			System.err.println("Not Enabled");
		}
		finally
		{
			takeSnap();
		}
	}

	public void typeWithTab(WebElement ele, String data) {
		try {
			ele.clear();
			ele.sendKeys(data,Keys.TAB);
			System.out.println("The text field is entered with data "+data);
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			System.err.println("Not Enabled");
		}
		finally
		{
			takeSnap();
		}
	}
	public void typeWithEnter(WebElement ele, String data) {
		try {
			ele.clear();
			ele.sendKeys(data,Keys.ENTER);
			System.out.println("The text field is entered with data "+data);
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			System.err.println("Not Enabled");
		}
		finally
		{
			takeSnap();
		}
	}


	public void click(WebElement ele) {
		try {
			ele.click();
			System.out.println("The Element "+ele+" is clicked");
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			System.err.println("Button not found");
		}
		finally
		{
			takeSnap();
		}
	}

	public void clickWithoutSnap(WebElement ele) {
		try {
			ele.click();
			System.out.println("The Element "+ele+" is clicked");
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			System.err.println("Button not found");
		}

	}

	public String getText(WebElement ele) {
		String txt=ele.getText();
		System.out.println("The Element "+ele+" is Texted");
		return txt;
	}

	public void selectDropDownUsingText(WebElement ele, String value) {
		try {
			Select dropdown =new Select(ele);
			dropdown.selectByVisibleText(value);
		} catch (WebDriverException e ) 
		{
			System.err.println("Not Enabled");

		}
	}

	public void selectDropDownUsingIndex(WebElement ele, int index) {
		try {
			Select dropdown =new Select(ele);
			dropdown.selectByIndex(index);
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			System.err.println("Not Enabled");
		}

	}
	public void selectDropDownUsingValue(WebElement ele, String value) {
		try {
			Select dropdown =new Select(ele);
			dropdown.selectByValue(value);
		} catch (WebDriverException e) {
			System.err.println("Not Enabled");
		}

	}


	public boolean verifyTitle(String expectedTitle) {
		String Title=driver.getTitle();
		if(Title.equalsIgnoreCase(expectedTitle))
		{
			System.out.println("Title is Present");
			return true;
		}
		return false;
	}
	public boolean verifyPartialTitle(String expectedTitle) {
		String Title=driver.getTitle();
		if(Title.contains(expectedTitle))
		{
			System.out.println("Title is Present");
			return true;
		}
		return false;
	}
	public boolean verifyExactText(WebElement ele, String expectedText) {
		String actualText=ele.getText();
		if(actualText.equalsIgnoreCase(expectedText))
		{
			System.out.println(expectedText+ "is Present");
			return true;
		}
		return false;
	}

	public Boolean verifyPartialText(WebElement ele, String expectedText) {
		String actualText=ele.getText();
		if(actualText.contains(expectedText))
		{
			System.out.println(expectedText+ "is Present");
			return true;
		}
		return false;

	}

	public void verifyExactAttribute(WebElement ele, String attribute, String value) {
		String actValue=ele.getAttribute(attribute);
		if(actValue.equalsIgnoreCase(value))
		{
			System.out.println("Exact Attribute value is present");
		}

	}

	public void verifyPartialAttribute(WebElement ele, String attribute, String value) {
		String actValue=ele.getAttribute(attribute);
		if(actValue.contains(value))
		{
			System.out.println("Exact Attribute value is present");
		}
	}

	public void verifySelected(WebElement ele) {
		if(ele.isSelected()==true)
		{
			System.out.println(ele+" is Selected");
		}
		else
		{
			System.out.println(ele+" is not Selected");
		}
	}

	public void verifyDisplayed(WebElement ele) {
		if(ele.isDisplayed()==true)
		{
			System.out.println(ele+" is dispalyed");
		}
		else
		{
			System.out.println(ele+" is not dispalyed");
		}
	}

	public void switchToWindow(int index) {
		Set<String> allWin=driver.getWindowHandles();
		List<String> list=new ArrayList<String>();
		list.addAll(allWin);
		driver.switchTo().window(list.get(index));

	}



	public void switchToFrameByIndex(int index) {
		driver.switchTo().frame(index);
	}

	public void switchToFrameByIdOrName(String id) {
		driver.switchTo().frame(id);
	}

	public void switchBackFromFrame() {
		driver.switchTo().defaultContent();
	}

	public void acceptAlert() {
		driver.switchTo().alert().accept();

	}

	public void dismissAlert() {
		driver.switchTo().alert().dismiss();

	}

	public String getAlertText() {
		driver.switchTo().alert().getText();
		return null;
	}

	public void takeSnap() {
		File src=driver.getScreenshotAs(OutputType.FILE);
		File destFile=new File("./snaps/snap"+i+".jpeg");

		try {
			FileUtils.copyFile(src, destFile);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		i++;
	}

	public void closeBrowser() {
		driver.close();

	}

	public void closeAllBrowsers() {
		// TODO Auto-generated method stub
		driver.quit();

	}


	public void switchToFrame(WebElement ele) {
		driver.switchTo().frame(ele);

	}
	
	public String getAttribute(WebElement ele,String attribute)
	{
		String attributeValue =ele.getAttribute(attribute);
		return attributeValue;
	}



}
