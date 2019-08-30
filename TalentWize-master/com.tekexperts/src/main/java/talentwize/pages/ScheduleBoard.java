package talentwize.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import controller.WebActions;

public class ScheduleBoard extends WebActions {

	By btnAddSchedule = By.xpath("//button[contains(.,'Add Schedule')]"); 
	By linkProjects = By.xpath("(//a[contains(@data-toggle,'tooltip-on-overflow')])");
	By fistLinkProject = By.xpath("(//a[contains(@class,'link-redirect ng-binding')])[1]"); 
	By btnEdit = By.xpath("(//button[contains(.,'Edit')])[1]"); 
	By btnSave = By.xpath("//button[contains(.,'Save As Draft')]"); 
	By msgUpdateSuccess = By.xpath("//span[contains(.,'Update schedule successfully')]"); 
	By tabWeek = By.xpath("//a[contains(.,'Week')]"); 
	By btnRecommendCoverage = By.xpath("(//a[contains(.,'Recommend Coverage')])[1]"); 
	By btnImportRecommendCoverage = By.xpath("//button[contains(.,'Import Recommend Coverage')]"); 
	By btnPublish = By.xpath("//button[contains(.,'Publish')]"); 
	By btnPublishConfirm = By.xpath("//button[@ng-click='ok()']"); 
	By btnArrowUp = By.xpath("(//i[@class='icon icon-arrow-up5'])[1]"); 
	By msgUpdateRecommend = By.xpath("//span[contains(.,'Update recommend coverage successfully')]");
	By btnExport = By.xpath("//button[contains(.,'Export Schedule')]");
	By btnWeek = By.xpath("//a[contains(.,'Week')]");
	
	public ScheduleBoard(WebDriver _driver) {
		super(_driver);
		
	}
	
	public boolean isMsgUpdateRecommendDispalyed() {
		boolean flag = false;

		try {
			if (driver.findElement(msgUpdateRecommend).isDisplayed() == true)
				flag = true;
		} catch (Exception e) {
			return flag;
		}

		return flag;
	}
	
	public boolean isBtnAddScheduleDispalyed() {
		boolean flag = false;

		try {
			if (driver.findElement(btnAddSchedule).isDisplayed() == true)
				flag = true;
		} catch (Exception e) {
			return flag;
		}

		return flag;
	}
	
	
	public void clickArrowUp()
	{
		clickByJavaScript(btnArrowUp);
		clickByJavaScript(btnArrowUp);
		clickByJavaScript(btnArrowUp);
	}
	
	
	
	public boolean isMsgUpdateSuccessDispalyed() {
		boolean flag = false;

		try {
			sleep(2);
			if (driver.findElement(msgUpdateSuccess).isDisplayed() == true)
				flag = true;
		} catch (Exception e) {
			return flag;
		}

		return flag;
	}
	
	public boolean isButtonImportRecommendCoverageDispalyed() {
		boolean flag = false;

		try {
			if (driver.findElement(btnImportRecommendCoverage).isDisplayed() == true)
				flag = true;
		} catch (Exception e) {
			return flag;
		}

		return flag;
	}
	
	public boolean isButtonRecommendCoverageDispalyed() {
		boolean flag = false;

		try {
			if (driver.findElement(btnRecommendCoverage).isDisplayed() == true)
				flag = true;
		} catch (Exception e) {
			return flag;
		}

		return flag;
	}
	
	public boolean isButtonExportDispalyed() {
		boolean flag = false;

		try {
			if (driver.findElement(btnExport).isDisplayed() == true)
				flag = true;
		} catch (Exception e) {
			return flag;
		}

		return flag;
	}
	
	public boolean isProjectDataTabelDispalyed() {
		boolean flag = false;
        sleep(15);
		try {
			if (driver.findElements(linkProjects).size() > 0 )
				flag = true;
		} catch (Exception e) {
			return flag;
		}

		return flag;
	}
	
	public void clickButtonPublish()
	{
		sleep(2);
		clickByJavaScript(btnPublish);
	}
	
	public void clickButtonPublishConfirm()
	{
		sleep(2);
		clickByJavaScript(btnPublishConfirm);
	}
	
	public void clickFistLinkProject()
	{
		sleep(7);
		clickByJavaScript(fistLinkProject);
	}
	
	public void clickButtonRecommendCoverage()
	{
		sleep(5);
		clickByJavaScript(btnRecommendCoverage);
	}
	
	
	public void clickButtonEdit()
	{
		sleep(2);
		clickByJavaScript(btnEdit);
	}

	public void clickButtonSave()
	{
		clickByJavaScript(btnSave);
	}
	
	public void clickTabWeek()
	{
		sleep(5);
		waitForElementClickable(10,tabWeek);
		clickByJavaScript(tabWeek);
	}
	
	
	public void clickBtnExport()
	{
		waitForElementClickable(10,btnExport);
		clickByJavaScript(btnExport);
	}
	
	public void clickBtnWeek()
	{
		waitForElementClickable(10,btnWeek);
		clickByJavaScript(btnWeek);
	}
}
