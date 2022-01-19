package week2.day1;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead 
{

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Javeed");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Shariff");
		
		WebElement source= driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select dropdown =new Select(source);
		dropdown.selectByIndex(4);
		
		WebElement marketcamp = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select dropdown1 = new Select(marketcamp);
		dropdown1.selectByIndex(1);
		
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Javeed");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("S");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("JS");
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("29/11/1999");
		
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Project Automation");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Computer Science");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("350000");
		
		WebElement currency =  driver.findElement(By.id("createLeadForm_currencyUomId"));
		Select dropdown2 = new Select(currency);
		dropdown2.selectByValue("INR");
		
		WebElement industry =  driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select dropdown3 = new Select(industry);
		dropdown3.selectByValue("IND_SOFTWARE");
		
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("115");
		
		WebElement ownership =  driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select dropdown4 = new Select(ownership);
		dropdown4.selectByValue("OWN_PUBLIC_CORP");
		
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("2431");
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("7207");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("A Simple Program to show about selenium");
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Understand, Learn, Practice, Learn again");
		
		      //Contact Information
				driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).clear();
				driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("+91");
				driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("04326");
				driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("8667577944");
				driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("+91");
				driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Javeed");
				driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("javeedshariff298@gmail.com");
				driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("https//www.twitter.com/javeed.jkbmv/");
		
            //primary address
				driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Javeed");
				driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("JS");
				driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("Chennai");
				driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Thiruvallur");
				driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("TamilNadu");
				
				WebElement country =  driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
				Select dropdown5 = new Select(country);
				dropdown5.selectByValue("IND");
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				WebElement state =  driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
				Select dropdown6 = new Select(state);
				dropdown6.selectByValue("IN-TN");
				
				driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("602024");
				driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("64");
				
				System.out.println("First name is "+driver.findElement(By.id("createLeadForm_firstName")).getAttribute("value"));
				driver.findElement(By.className("smallSubmit")).click();
				System.out.println("Titile of the page is "+driver.getTitle());

}
}
