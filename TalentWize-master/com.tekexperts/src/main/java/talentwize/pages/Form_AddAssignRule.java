package talentwize.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import controller.WebActions;

public class Form_AddAssignRule extends WebActions {
	By drbRuleCode=By.xpath("//span[contains(.,'Select Rule...')]");
	By first_RuleCode=By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Select Rule...'])[1]/following::div[5]");
	By txtDate=By.xpath("//input[contains(@date-type,'string')]");
	By chkName=By.xpath("(//label[@class='i-checkbox'])[1]");
	By btnNext=By.xpath("//button[@ng-click='select()']");
	By btnSave = By.xpath("//button[contains(.,'Save')]");
	By btnCancel = By.xpath("//button[contains(.,'Cancel')]");
	By iconCalendar = By.xpath("//i[@class='icon icon-calendar2']");
	By btnToday = By.xpath("//button[contains(.,'Today')]");
	
	public Form_AddAssignRule(WebDriver _driver) {
		super(_driver);
	}
	public void filltxtDate(String _date) {
		clickByJavaScript(txtDate);
		goTextOn(txtDate, _date);
	}
	
	public void clickdrbRuleCode() {
		waitForElementClickable(10, drbRuleCode);
		clickByJavaScript(drbRuleCode);
	}
	public void clickfirst_RuleCode() {
		try {
			waitForElementPresent(10, first_RuleCode);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		clickByJavaScript(first_RuleCode);
	}
	public void clickchkName() {
		try {
			waitForElementPresent(15, chkName);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		clickByJavaScript(chkName);
	}

	public void clickbtnNext() {
		waitForElementClickable(3, btnNext);
		clickByJavaScript(btnNext);
	}
	public void clickBtnSave() {
		waitForElementClickable(3, btnSave);
		clickByJavaScript(btnSave);
	}

	public void clickBtnCancel() {
		waitForElementClickable(3, btnCancel);
		clickByJavaScript(btnCancel);
	}

	public void addAssignRuleToday() {
		clickdrbRuleCode();
		clickfirst_RuleCode();
		//filltxtDate(_date);
		clickByJavaScript(iconCalendar);
		clickByJavaScript(btnToday);
		clickchkName();
		clickbtnNext();
		clickBtnSave();
	}

}
