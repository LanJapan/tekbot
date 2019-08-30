package talentwize.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import controller.WebActions;

public class Form_AddRoleLevel extends WebActions {

	public Form_AddRoleLevel(WebDriver _driver) {
		super(_driver);
		
	}
     
	By txtName = By.xpath("//input[contains(@ng-model,'roleLevel.name')]"); 
	By btnSave = By.xpath("//button[contains(.,'Save')]");
	
	public void AddRoleTitle(String roleTitle)
	{
		waitForElementClickable(5, txtName);
		goTextOn(txtName,"%abc1" + roleTitle);
		waitForElementClickable(5, btnSave);
		clickByJavaScript(btnSave);
		sleep(2);
	}
}
