package talentwize.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import controller.WebActions;

public class Form_AddCompetencyMapping extends WebActions {
	
	By chkJobTitle=By.xpath("(//span[contains(.,'Select Job Title...')])[1]");
	By chkFirstJobTitle=By.xpath("(//div[@ng-bind-html='jobTitle.name'])[1]");
	By chkUnit=By.xpath("//span[contains(.,'Select Units...')]");
	By chkFirstUnit=By.xpath("//span[contains(@class,'font-bold highlight-search')]");
	By txtSearchUnit = By.xpath("//input[@placeholder='Search unit...']");
	By chkCompetency=By.xpath("(//label[@class='i-checkbox'])[1]");
	By btnNext=By.xpath("//i[@class='icon icon-arrow-right']");
	By btnSave=By.xpath("//button[contains(.,'Save')]");
	
	public Form_AddCompetencyMapping(WebDriver _driver) {
		super(_driver);
	}
	public void clickChkJobTitle() {
		waitForElementClickable(5, chkJobTitle);
		clickByJavaScript(chkJobTitle);
	}
	public void clickChkFirstJobTitle() {
		waitForElementClickable(5, chkFirstJobTitle);
		clickByJavaScript(chkFirstJobTitle);
	}
	public void clickChkUnit() {
		waitForElementClickable(5, chkUnit);
		clickByJavaScript(chkUnit);
	}
	public void chooseUnit(String nameOfUnit) throws InterruptedException 
	{
		goTextOnNoEnter(txtSearchUnit, nameOfUnit);
		waitForElementPresent(10, chkFirstUnit);
		clickByJavaScript(chkFirstUnit);
	}
	public void clickChkCompetency() {
		clickByJavaScript(chkCompetency);
	}
	public void clickButtonNext() {
		clickByJavaScript(btnNext);
	}
	public void clickButtonSave() {
		clickByJavaScript(btnSave);
	}
	public void addCompetencyMapping(String nameOfUnit) throws InterruptedException 
	{
		clickChkJobTitle();
		clickChkFirstJobTitle();
		clickChkUnit();
		chooseUnit(nameOfUnit);
		clickChkCompetency();
		clickButtonNext();
		clickButtonSave();
	}

}
