
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestCases {

	WebDriver driver = new ChromeDriver();
	String URL="https://www.almosafer.com/ar?ncr=1";
	
	
	@BeforeTest
	public void MySetup() {
		driver.get(URL);
		driver.manage().window().maximize();
	}
	
	@Test
	public void chalets() {
		WebElement carsButton=driver.findElement(By.xpath("//body/div[@id='__next']/div[@class='sc-iUVpnZ fESGpW']/div[1]/a[1]"));
		carsButton.click();
		
		List <WebElement>cars=driver.findElements(By.className("sc-bJazwb "));
		
		//not completed yet!!
		for(int i=0; i<cars.size();i++) {
		}
	}	
}
