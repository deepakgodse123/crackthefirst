package automationProg1;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SeleniumUtils 
{
	// creating the boarder.==> Method which accepts the parameter but will not return anything.
	
		public static void borderbyJS(WebDriver driver,WebElement element) {
			JavascriptExecutor js = ((JavascriptExecutor) driver);
			js.executeScript("arguments[0].style.border='3px solid red'", element);
		}
		
		
		// capturing the title. ==> Method which accepts the parameter but will return title
		
		public static String titlebyJS(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		String Title=js.executeScript("return document.title;").toString();
		return Title;

		}
		
		// click on element
		public static void clickbyJS(WebDriver driver,WebElement element) {
			JavascriptExecutor js = ((JavascriptExecutor) driver);
			js.executeScript("arguments[0].click();", element);
		}
		
		// generate userdefined alert.
		
		public static void alertbyJS(WebDriver driver, String message) {
			JavascriptExecutor js = ((JavascriptExecutor) driver);
			js.executeScript("alert('" + message + "')");
		}
		
		// refresh the page
		public static void refreshbyJS(WebDriver driver) {
			JavascriptExecutor js = ((JavascriptExecutor) driver);
			js.executeScript("history.go(0)");
		}
		
		// Scrolling the page.
		
		public static void scrolldownbyJS(WebDriver driver,int x, int y) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
			js.executeScript("scroll("+x+","+y+")");    // scroll down	
		}
		
		public static void scrollupbyJS(WebDriver driver,int x, int y) {
			JavascriptExecutor js = ((JavascriptExecutor) driver);
				js.executeScript("scroll("+x+","+y+")");    // scroll up
		}
		
		// scroll into view.

		public static void scrollIntoViewbyJS(WebDriver driver,WebElement element) {
			JavascriptExecutor js = ((JavascriptExecutor) driver);
			js.executeScript("arguments[0].scrollIntoView(true);", element);
		
		}
	}


