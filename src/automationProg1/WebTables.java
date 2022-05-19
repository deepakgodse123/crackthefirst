package automationProg1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables
{
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shubham\\OneDrive\\Documents\\velocity\\automation\\driver1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();   
		driver.get("https://www.moneycontrol.com/markets/global-indices/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		int rows=driver.findElements(By.xpath("//table[@class=\"mctable1 n18_res_table responsive tbl_scroll_resp\"]//tr")).size();
		System.out.println(rows);
		
		int cols=driver.findElements(By.xpath("//table[@class=\"mctable1 n18_res_table responsive tbl_scroll_resp\"]//tr//td")).size();
		System.out.println(cols);
		
		
		// rows==> external loop
		// cols==> internal loop
		
		for (int r=1; r<=rows;r++) {
			for (int c=1;c<=cols;c++) {
	
			String value = driver.findElement(By.xpath("//table[@class=\"mctable1 n18_res_table responsive tbl_scroll_resp\"]//tr["+r+"]//td["+c+"]")).getText();
			System.out.print("==>"+ value);
			
			}
			System.out.println();
		}
		
	}

	

}
