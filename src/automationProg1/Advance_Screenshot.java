package automationProg1;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Advance_Screenshot 
{
	public static WebDriver driver;
	public static void getScreenshot() throws IOException
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Date d=new Date();
	    System.out.println(d);
	    String filename=d.toString().replace(" ", "_").replace(":", "_")+".jpg";
	    File dest=new File("C:\\Users\\Shubham\\OneDrive\\Documents\\velocity\\automation\\Screenshots\\uk_"+filename);
	    FileUtils.copyFile(src, dest);
	}
	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shubham\\OneDrive\\Documents\\velocity\\automation\\driver1\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.next.co.uk/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		getScreenshot();
		driver.get("https://www.cricbuzz.com/");
		getScreenshot();

	}
}
