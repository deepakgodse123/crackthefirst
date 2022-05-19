package automationProg1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleElements 
{
	
		// we have located the elements but we havent performed any action.
		// method from interface ==>  webelement.
		// some methods ==> intraction with the webpage. ==> actions on web elements.
		
		public static void main(String[] args) throws InterruptedException {

			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shubham\\OneDrive\\Documents\\software testing\\automation\\driver1\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();  
			driver.get("https://www.facebook.com/");
			Thread.sleep(2000);
			List<WebElement> footerlinks = driver.findElements(By.xpath("//ul[contains(@class,'uiList pageFooterLinkList')]/li/a"));
			System.out.println(footerlinks.size());
			
			
			for (int i=0; i<footerlinks.size();i++) {
				String footerlink = footerlinks.get(i).getAttribute("href");
				
				System.out.println(i+" "+footerlink);
			}
		}

}
