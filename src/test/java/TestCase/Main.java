package TestCase;
import Browser.browser;
import Pages.page1;
import Pages.page2;
import Screenshot.capture;
public class Main {
	public static void main(String []args)throws Exception{
		browser.openBrowser();
		
		browser.navigate("Rediff.com: News | Rediffmail | Stock Quotes | Rediff Gurus");
		//browser.closeBrowser();
		capture.screenshot("Home");
		
		page1.click("Create Account");
		page2.fullname("Shantanu");
		page2.mailID("Shantanu.gg");
		page2.checkAvailability();
		page2.checkAvlmsg();
		capture.screenshot("MailCheck");
	}
	
}
