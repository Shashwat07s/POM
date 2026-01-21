package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import Browser.browser;
import Locators.Page1Objects;
import Locators.Page2Objects;

public class page2 extends browser {
	
	public static void fullname(String name) {
		try{//wait.until(ExpectedConditions.visibilityOf(Page2Objects.create()));
		WebElement element = Page2Objects.fullname();
		element.sendKeys(name);
		} catch (Exception e) {
			System.out.println("Entered");
		}
	}
	public static void mailID(String name) {
		try {
			wait.until(ExpectedConditions.visibilityOf(Page2Objects.mailID()));
			WebElement element = Page2Objects.mailID();
			element.sendKeys(name);
		}catch(Exception e){
			System.out.println("mailID" +e);
		}
	}
	public static void checkAvailability() {
		try {
			wait.until(ExpectedConditions.visibilityOf(Page2Objects.checkAvailability()));
			//WebElement element =Page2Objects.fullname().sendkeys("Shashwat");
			WebElement element = Page2Objects.checkAvailability();
			element.click();
		
		}catch (Exception e) {
			System.out.println("Create Account" + e);
		}
	}
	public static String checkAvlmsg() {
		String msg = null;
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("success")));
			msg= Page2Objects.checkAvlMsg().getText();
			System.out.println(msg);
		
		}catch(Exception e ) {
			System.out.println("No message " + e);
		}
		return msg;
	}
}
