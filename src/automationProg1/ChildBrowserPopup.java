package automationProg1;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopup 
{
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shubham\\OneDrive\\Documents\\software testing\\automation\\driver1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();   
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// getwindow handle==> id  for main page only.
		// getwindowhandles()==> id for main page as well as for child pages.
		// String id = driver.getWindowHandle();
        // System.out.println(id);
		// for multiple windows.
		// itrate==> get respective window==> switch ==> action 
		
		Set<String> winds = driver.getWindowHandles();
		Iterator<String> iterate = winds.iterator();
		String first_window = iterate.next(); // 1 window is your parent window.
		System.out.println(first_window);
		driver.switchTo().window(first_window);
		driver.findElement(By.xpath("//a[@title='Learn more about Facebook Pay']")).click();
		
		
		// second will open second id will generate
		// itrate==> get respective window==> switch ==> action 
		winds = driver.getWindowHandles();
		iterate = winds.iterator();
		iterate.next();// 1 window is your parent window.
		String second_window = iterate.next(); // 2 window
		System.out.println(second_window);
		driver.switchTo().window(second_window);
		System.out.println("Title of second window :- "+ driver.getTitle());
		driver.findElement(By.xpath("//a[text()='Facebook Payments Privacy Policy']")).click();
		
		
		// third will open third id will generate
		// itrate==> get respective window==> switch ==> action 
		winds = driver.getWindowHandles();
		iterate = winds.iterator();
		iterate.next();// 1 window is your parent window.
		iterate.next(); // 2 window
		String third_window = iterate.next();  // 3 window
		System.out.println(third_window);
		driver.switchTo().window(third_window);
		System.out.println("Title of third window :- "+ driver.getTitle());
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("PQR");
		
		//driver.close();   // current focused. ==> 3
		//driver.quit();
	}

}
