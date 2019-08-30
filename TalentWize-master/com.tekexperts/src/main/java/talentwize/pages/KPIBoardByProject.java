package talentwize.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import controller.WebActions;

public class KPIBoardByProject extends WebActions 
{
    
	By fistLinkOfKPIDetails = By.xpath("(//span[contains(@ng-click,'index,item)')])[1]");
	By itemUser1 = By.xpath("(//label[@ng-bind-html='::checkbox.htmlDisplay'])[2]");
	By filterEmployee = By.xpath("(//div[@class='selected ellipsis-text ng-binding'])[14]");
	
	public KPIBoardByProject(WebDriver _driver) {
		super(_driver);	
	}
	
	public void filterEmployee()
	{
		waitForElementClickable(5, filterEmployee);
		clickByJavaScript(filterEmployee);
		waitForElementClickable(5, itemUser1);
		clickByJavaScript(itemUser1);
		sleep(2);
	}
	
	public void clickKPIDetails()
	{
		//filterEmployee();
		waitForElementClickable(25, fistLinkOfKPIDetails);
		clickByJavaScript(fistLinkOfKPIDetails);
	}
}