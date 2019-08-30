package talentwize.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import controller.WebActions;

public class TrainingSettings extends WebActions {

	By btnTest = By.xpath("//button[contains(.,'Test')]"); 
	By btnEdit = By.xpath("//button[contains(.,'Edit')]"); 
	By btnSave = By.xpath("//button[contains(.,'Save')]"); 
	By msgUpdateSuccess = By.xpath("//span[contains(.,'Update successfully')]"); 
	
	public TrainingSettings(WebDriver _driver) {
		super(_driver);
		
	}
	
	public void clickButtonEdit()
	{
		sleep(2);
		clickByJavaScript(btnEdit);
	}
	
	public boolean isButtonTestDisplayed() {
		boolean flag = false;
		try {
			if (driver.findElement(btnTest).isDisplayed() == true) {
				flag = true;
			}
		} catch (Exception e) {
			return flag;
		}
		return flag;
	}
	
	public boolean isMsgUpdateSuccessDisplayed() {
		boolean flag = false;
		try {
			if (driver.findElement(msgUpdateSuccess).isDisplayed() == true) {
				flag = true;
			}
		} catch (Exception e) {
			return flag;
		}
		return flag;
	}
	
	public boolean isButtonEditDisplayed() {
		boolean flag = false;
		sleep(4);
		try {
			if (driver.findElement(btnEdit).isDisplayed() == true) {
				flag = true;
			}
		} catch (Exception e) {
			return flag;
		}
		return flag;
	}
	
	public void updateTrainingSettings()
	{
		clickButtonEdit();
		clickByJavaScript(btnSave);
	}
	
	
	
	

}
