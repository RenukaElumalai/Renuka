package week2.day2.irctc;



import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class IrctcSignUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");	
		//launch Browser
		ChromeDriver driver = new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//Load the URL
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		//click on Signup
		driver.findElementByLinkText("Sign up").click();
		//Enter the Username and Password
		driver.findElementById("userRegistrationForm:userName").sendKeys("gbcdef");
		driver.findElementById("userRegistrationForm:password").sendKeys("Password123");
		driver.findElementById("userRegistrationForm:confpasword").sendKeys("Password123");
		//Security Question Selection
		WebElement secquesoptions=driver.findElementById("userRegistrationForm:securityQ");
		Select secdropdown=new Select(secquesoptions); 
		secdropdown.selectByVisibleText("What was the name of your first school?");
		driver.findElementById("userRegistrationForm:securityAnswer").sendKeys("Raj");
		//Language Selection
		WebElement language=driver.findElementById("userRegistrationForm:prelan");
		Select langdropdown=new Select(language);
		langdropdown.selectByVisibleText("English");
		//First Name-Middle Name-Last Name
		driver.findElementById("userRegistrationForm:firstName").sendKeys("Gayu	");
		driver.findElementById("userRegistrationForm:middleName").sendKeys("Bala");
		driver.findElementById("userRegistrationForm:lastName").sendKeys("Ammulu");
		//Gender Selection
		driver.findElementById("userRegistrationForm:gender:1").click();
		//Marital Status Selection
		driver.findElementById("userRegistrationForm:maritalStatus:0").click();
		//Date Selection
		WebElement dobday=driver.findElementById("userRegistrationForm:dobDay");
		Select dobday1=new Select(dobday);
		dobday1.selectByVisibleText("01");
		//Month Selection
		WebElement dobmonth=driver.findElementById("userRegistrationForm:dobMonth");
		Select dobmonth1=new Select(dobmonth);
		dobmonth1.selectByVisibleText("MAR");
		//Year Selection
		WebElement dobyear=driver.findElementById("userRegistrationForm:dateOfBirth");
		Select dobyear1=new Select(dobyear);
		dobyear1.selectByVisibleText("1988");
		//Ocupation Selection
		WebElement occupation=driver.findElementById("userRegistrationForm:occupation");
		Select occupation1=new Select(occupation);
		occupation1.selectByVisibleText("Government");
		//AAdhar No
		driver.findElementById("userRegistrationForm:uidno").sendKeys("1234");
		//Pan Card
		driver.findElementById("userRegistrationForm:idno").sendKeys("1234");
		//Country Slection
		WebElement country=driver.findElementById("userRegistrationForm:countries");
		Select country1=new Select(country);
		country1.selectByVisibleText("India");
		//Email
		driver.findElementById("userRegistrationForm:email").sendKeys("gayubala@love.com");
		//Phone number
		driver.findElementById("userRegistrationForm:mobile").sendKeys("8939972417");
		//driver.findElementById("userRegistrationForm:mobile").sendKeys("044");
		//Nationality Selection
		WebElement nationality=driver.findElementById("userRegistrationForm:nationalityId");
		Select nationality1=new Select(nationality);
		nationality1.selectByVisibleText("India");
		//Address
		driver.findElementById("userRegistrationForm:address").sendKeys("1/192");
		driver.findElementById("userRegistrationForm:street").sendKeys("Brindhaven Street");
		driver.findElementById("userRegistrationForm:area").sendKeys("Srinivaspuram");
		driver.findElementById("userRegistrationForm:pincode").sendKeys("609001",Keys.TAB);
		Thread.sleep(5000);
		//City
		WebElement city=driver.findElementById("userRegistrationForm:cityName");
		Select city1=new Select(city);
		city1.selectByIndex(1);
		Thread.sleep(5000); 
		//Post
		WebElement post=driver.findElementById("userRegistrationForm:postofficeName");
		Select post1=new Select(post);
		post1.selectByIndex(1);
		List<WebElement> allPoOptions=post1.getOptions();
		for(WebElement postselect:allPoOptions)
		{
			System.out.println(postselect.getText());
		}
		//phone
		driver.findElementById("userRegistrationForm:landline").sendKeys("8939975623");
		//Office Address
		driver.findElementById("userRegistrationForm:resAndOff:0").click();
		//Newsletter
		driver.findElementById("userRegistrationForm:newsletter:1").click();
		driver.findElementById("userRegistrationForm:commercialpromo:1").click();
		driver.findElementById("userRegistrationForm:irctcsbicard:0").click();
		
		
		
				

		
		
	}

}
