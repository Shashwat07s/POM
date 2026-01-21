package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Browser.browser;

public class Page2Objects extends browser{
	static By checkAvailability = By.xpath("//html/body/div[2]/div[2]/form/div/div[4]/input");
	static By fullname=By.xpath("/html/body/div[2]/div[2]/form/div/div[2]/input");
	
	//static By mailID = By.xpath("//*[@id=\"loginabc97a38\"]");
	static By mailID= By.xpath("//html/body/div[2]/div[2]/form/div/div[3]/div/input");
	static By checkAvlMsg= By.xpath("//span[@class='success']");
	public static WebElement checkAvailability() {
		WebElement element = driver.findElement(checkAvailability);
		return element;
	}
	public static WebElement fullname() {
		WebElement element = driver.findElement(fullname);
		return element;
	}
	public static WebElement mailID() {
		WebElement element = driver.findElement(mailID);
		return element;
 	}
	public static WebElement checkAvlMsg() {
		WebElement element = driver.findElement(checkAvlMsg);
		return element;
	}
}
