package automationProg1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorProg 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shubham\\OneDrive\\Documents\\velocity\\automation\\driver1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();   
//		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.manage().window().maximize();
//		driver.switchTo().frame("iframeResult");
		
		// =====================================>>>>>> to border webelement

		
	//	WebElement tryittext = driver.findElement(By.xpath("//h2[text()='JavaScript Alert']"));
//		JavascriptExecutor js = ((JavascriptExecutor) driver);
//		js.executeScript("arguments[0].style.border='3px solid red'", tryittext);
		
		// ------->>>>> SELENIUM UTILS METHOD
		
        //		SeleniumUtils.borderbyJS(driver, tryittext);
		
	// =====================================>>>>>> to get title of page
		
//		JavascriptExecutor js = ((JavascriptExecutor) driver);
//		String titlebyjs = js.executeScript("return document.title;").toString();
//		System.out.println(titlebyjs);
		
        // 		System.out.println(SeleniumUtils.titlebyJS(driver));
		
		// =====================================>>>>>> to click on the webelemt
		
	//	WebElement TryItButton = driver.findElement(By.xpath("//button[text()='Try it']"));
//		JavascriptExecutor js = ((JavascriptExecutor) driver);
//		js.executeScript("arguments[0].click();", TryItButton);
		
		//       SeleniumUtils.clickbyJS(driver, TryItButton);
		
		// =====================================>>>>>> to create an alert after the action has been performed successfully
		
		driver.get("https://dev.mysql.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
//		JavascriptExecutor js = ((JavascriptExecutor) driver);
//		js.executeScript("alert('" + "The Sql Site is launched" + "')");	
		
		//       SeleniumUtils.alertbyJS(driver, "The Sql Site is launched");
		
		// =====================================>>>>>> to refresh a page

	
//		JavascriptExecutor js = ((JavascriptExecutor) driver);
//		js.executeScript("history.go(0)");
//		Thread.sleep(2000);
//		SeleniumUtils.refreshbyJS(driver);
		
		// =====================================>>>>>> to scroll down  a page

		
//		JavascriptExecutor js = ((JavascriptExecutor) driver);
//		js.executeScript("scroll(0,1000)");
//		Thread.sleep(2000);
//		js.executeScript("scroll(0,500)");
		
		// =====================================>>>>>> to scroll into view 

		
		
		WebElement link1 = driver.findElement(By.xpath("//a[text()='In-Database Machine Learning with MySQL HeatWave']"));
//		JavascriptExecutor js = ((JavascriptExecutor) driver);
//		js.executeScript("arguments[0].scrollIntoView(true);", link1);
//		Thread.sleep(2000);
//		link1.click();
		SeleniumUtils.scrollIntoViewbyJS(driver, link1);
	}
}
