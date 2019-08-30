package talentwize.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import controller.WebActions;

public class Form_AddCategory extends WebActions {

	public Form_AddCategory(WebDriver _driver) {
		super(_driver);
		
	}
	
	By txtName = By.xpath("//input[contains(@ng-model,'jobTitle.name')]");
	By btnSave = By.xpath("//button[contains(.,'Save')]"); 
	
	public void AddCategory(String nameCategory)
	{
		waitForElementClickable(5, txtName);
		goTextOn(txtName, nameCategory);
		waitForElementClickable(5, btnSave);
		clickByJavaScript(btnSave);
	}

}
