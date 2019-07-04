import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AboutHris{

	WebDriver driver;
	String expectedhref="About HRIS";
    String expectedCelebrationtitle="Celebration";
    String expectedCalendartitle="QAIT Updates";
    String expectedHrPolicytitle="HR Policy";
    String expectedFoodMenutitle="Food Menu";
    String expectedDidYouKnowtitle="Did you know?";
	public void initializeWebDriver() {		
		System.setProperty("webdriver.chrome.driver","/home/himanshupandya/Downloads/chromedriver");
		driver=new ChromeDriver();
	}	
	
	
	public  void LaunchUrl()
	{


		driver.navigate().to("https://hris.qainfotech.com/login.php");
		String url="https://hris.qainfotech.com/login.php";
	}

	public void HrisClick()
	{
		driver.findElement(By.xpath("//i[@class='icon-user']/following-sibling::span")).click();
	}
	public void AboutHrisCheck()
	{
		String actualTitle=driver.findElement(By.xpath("//i[@class='icon-user']/following-sibling::span")).getText().toString();
		Assert.assertEquals(actualTitle	, expectedhref);
	}
	
	public void CelebrationsClick()
	{
		driver.findElement(By.xpath("//i[@class='icon-star']/following-sibling::span")).click();
	}
	public void CelebrationsLinkCheck()
	{
	 String actualCelebrationtitle=driver.findElement(By.xpath("//i[@class='icon-star']/following-sibling::span")).getText().toString();	
	 Assert.assertEquals(actualCelebrationtitle, expectedCelebrationtitle);
	}
	
	public void QAITUpdateClick()
	{
		driver.findElement(By.xpath("//i[@class='icon-calendar']/following-sibling::span")).click();
	}
	public void QAITUpdateCheck()
	{
	 String actualCalendartitle=driver.findElement(By.xpath("//i[@class='icon-calendar']/following-sibling::span")).getText().toString();	
	 Assert.assertEquals(actualCalendartitle, actualCalendartitle);
	}
	public void HRPolicyClick()
	{
		driver.findElement(By.xpath("//i[@class='icon-info-sign']/following-sibling::span")).click();
	}
	public void HRPolicyCheck()
	{
	 String actualHRPolicytitle=driver.findElement(By.xpath("//i[@class='icon-info-sign']/following-sibling::span")).getText().toString();	
	 Assert.assertEquals(actualHRPolicytitle, expectedHrPolicytitle);
	}
	public void FoodMenuClick()
	{
		driver.findElement(By.xpath("//i[@class='icon-food']/following-sibling::span")).click();
	}
	public void FoodMenuCheck()
	{
	 String actualFoodMenutitle=driver.findElement(By.xpath("//i[@class='icon-food']/following-sibling::span")).getText().toString();	
	 Assert.assertEquals(actualFoodMenutitle, expectedFoodMenutitle);
	}
	public void DidYouKnowClick()
	{
		driver.findElement(By.xpath("//i[@class='icon-question-sign']/following-sibling::span")).click();
	}
	public void DidYouKnowCheck()
	{
	 String actualDidYouKnowtitle=driver.findElement(By.xpath("//i[@class='icon-question-sign']/following-sibling::span")).getText().toString();	
	 Assert.assertEquals(actualDidYouKnowtitle, expectedDidYouKnowtitle);
	}
}
