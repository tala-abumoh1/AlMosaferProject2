
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestCases {

	WebDriver driver = new ChromeDriver();
	String URL="https://www.almosafer.com/ar?ncr=1";
	Random rand=new Random();

	
	@BeforeTest
	public void MySetup() {
		driver.get(URL);
		driver.manage().window().maximize();
	}
	
	@Test
	public void chalets() {
		
		String [] website= {"https://global.almosafer.com/en","https://global.almosafer.com/ar"};
		 
		 int randomIndex=rand.nextInt(website.length);
		 driver.get(website[randomIndex]);
		 
		 WebElement activityButton=driver.findElement(By.id("uncontrolled-tab-example-tab-activities"));
		 activityButton.click();
		 
		 WebElement search=driver.findElement(By.id("Activities-SearchInput"));

		 if(driver.getCurrentUrl().contains("en")) {
			 String [] English = {"Tours","Attraction","Activities and Experiences"};
			 int RandomIndex= rand.nextInt(English.length);
			 search.sendKeys(English[RandomIndex]);

		 }
		 else if(driver.getCurrentUrl().contains("ar")) {
			 String [] Arabic= {"الجولات","المعالم"};
				int RandomIndex=rand.nextInt(Arabic.length);
				search.sendKeys(Arabic[RandomIndex]);
		 }
		 
	
	}	
}
