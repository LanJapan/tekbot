package tekbot.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Ulties.PropertyManager;
import controller.WebActions;

public class HomePage_Client extends WebActions {

	By btnSignin = By.xpath("//button[contains(@aria-label,'Sign In')]");
	By txtFillMessage = By.xpath("//input[@aria-label='Type your message']");
	By txtWelcometoTekBot1=By.xpath("//p[contains(.,'Welcome to TekBot')]");
	By txtWelcometoTekBot2=By.xpath("//p[contains(.,'Hi, We are in the process of updating the Tekbot.')]");
	By iconChatBot=By.xpath("//img[contains(@class,'ac-image')]");
	

	public HomePage_Client(WebDriver driver) {
		super(driver);
		moLinkWeb(PropertyManager.URL_CHATBOT);
        phongToCuaSoTrinhDuyet();
	}

	
	public void clickButtonSignin() {
		try {
			waitForElementPresent(20, btnSignin);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(btnSignin).click();
	}

	public void SignInWith(String code) {

		clickButtonSignin();
		waitForPageLoaded();
		
		
		
		
	}
	
	public void typeMessage(String contentMessage)
	{
		goTextOn(txtFillMessage, contentMessage);
	}
	public boolean istxtWelcometoTekBotDisplayed()
	{
		try {
			waitForElementPresent(5, txtWelcometoTekBot1);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		boolean flag = false;
		try {
			if (driver.findElements(txtWelcometoTekBot1).size() > 0) {
				flag = true;
			}
		} catch (Exception e) {
			return flag;
		}
		return flag;
	}
	public boolean istxtHiTekBotDisplayed()
	{
		try {
			waitForElementPresent(5, txtWelcometoTekBot2);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		boolean flag = false;
		try {
			if (driver.findElements(txtWelcometoTekBot2).size() > 0) {
				flag = true;
			}
		} catch (Exception e) {
			return flag;
		}
		return flag;
	}
	public boolean isIconChatBotDisplayed()
	{
		boolean flag = false;
		try {
			if (driver.findElements(iconChatBot).size() > 0) {
				flag = true;
			}
		} catch (Exception e) {
			return flag;
		}
		return flag;
	}

}
