package week2.day1;

import org.openqa.selenium.Alert;
//import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
		
				String text="RenuShamilee";
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				ChromeDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
				driver.switchTo().frame("iframeResult");
				driver.findElementByXPath("//Button[text()='Try it']").click();
				//String txt= driver.switchTo().alert().getText();
				//System.out.println(txt);
				Alert myalert=driver.switchTo().alert();
				myalert.sendKeys(text);
				//driver.switchTo().alert().sendKeys("RenuShamilee");
				//System.out.println(txt);
				driver.switchTo().alert().accept();
//				WebElement text= driver.findElementByXPath("//p[contains(text()='RenuShamilee')]");
				
				String myText=driver.findElementById("demo").getText();
				
				if(myText.contains(text))
				{
					System.out.println("Text Matched");
				}
				else {
					System.out.println("Text mismatch");
				}
				
				
				
			

				
				
		
				
				
				
				


	}

}
