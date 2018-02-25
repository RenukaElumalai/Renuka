package testCases;

import java.util.Scanner;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class LearnAlertFrames {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe/");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name");
		String tempName=sc.next();
		driver.switchTo().frame("iframeResult");
		driver.findElementByXPath("//button[contains(text(),'Try it')]").click();
		Alert myAlert=driver.switchTo().alert();
		myAlert.sendKeys(tempName);
		String alertMessage= myAlert.getText();
		System.out.println(alertMessage);
		myAlert.accept();
		WebElement text1=driver.findElementByXPath("//p[contains(text(),'Hello')]");
		String appText=text1.getText();

		//String appText= driver.findElementById("demo").getText();

		if(appText.contains(tempName))
		{
			System.out.println("Text verification Passed");
		}
		else {
			System.out.println("verification failed");
		}
	}



}


