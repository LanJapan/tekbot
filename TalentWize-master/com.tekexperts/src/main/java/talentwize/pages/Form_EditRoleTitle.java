package talentwize.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import controller.WebActions;

public class Form_EditRoleTitle extends WebActions {

	public Form_EditRoleTitle(WebDriver _driver) {
		super(_driver);
	}
	
	By txtName = By.xpath("//input[@ng-model='roleTitle.name']"); 
	By btnSave = By.xpath("//button[contains(.,'Save')]");
	
	public void editRoleTitle(String roleTitle)
	{
		waitForElementClickable(5, txtName);
		goTextOn(txtName, roleTitle);
		waitForElementClickable(5, btnSave);
		clickByJavaScript(btnSave);
		sleep(2);
	}	

}
