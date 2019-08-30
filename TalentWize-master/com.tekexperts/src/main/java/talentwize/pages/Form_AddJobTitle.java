package talentwize.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import controller.WebActions;

public class Form_AddJobTitle extends WebActions {

	public Form_AddJobTitle(WebDriver _driver) {
		super(_driver);
		
	}
   
	By txtName = By.xpath("//input[@ng-model='jobTitle.name']");
	By btnSave = By.xpath("//button[contains(.,'Save')]"); 
	
	public void AddJobTitle(String roleTitle)
	{
		waitForElementClickable(5, txtName);
		goTextOn(txtName, ".aa12"+ roleTitle);
		waitForElementClickable(5, btnSave);
		clickByJavaScript(btnSave);
	}
	
	
}
