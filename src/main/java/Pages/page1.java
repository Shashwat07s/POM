package Pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import Browser.browser;
import Locators.Page1Objects;

public class page1 extends browser{
	public static void click(String text) {
		try {
			wait.until(ExpectedConditions.visibilityOf(Page1Objects.logo()));
			List<WebElement> element = Page1Objects.link();
			for(int i=0;i<=element.size();i++) {
				if(element.get(i).getText().equalsIgnoreCase(text)) {
					element.get(i).click();
					break;
				}
			} 
		}catch(Exception e) {
			System.out.println("Page1 - create Account Link");
		}
	}
}
