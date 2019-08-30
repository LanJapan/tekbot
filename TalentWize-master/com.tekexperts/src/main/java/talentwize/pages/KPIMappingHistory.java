package talentwize.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import controller.WebActions;

public class KPIMappingHistory extends WebActions {
    
	By btnAdd = By.xpath("(//button[contains(@ng-click,'addMapping()')])[2]");
	By btnKPIBoard=By.xpath("//button[contains(.,'KPI Board')]");
	By lblKPIHistory=By.xpath("//div[contains(@class,'caption font-bold pull-left m-t-3 ng-binding')]");
	By btnYes=By.xpath("//button[contains(.,'Yes')]");
	By msgDeleteSuccessfully=By.xpath("(//div[contains(.,'Deleted successfully')])[2]");
	By btnBack=By.xpath("//button[contains(.,'Back')]");
	By chkKPIHistory=By.xpath("//span[contains(@ng-click,'period($index, item)')]");
	By btnDeleteKPIHistory=By.xpath("(//i[@class='icon icon-bin'])[2]");
	By msgUpdateSuccessfully=By.xpath("//span[contains(.,'Update Mapping successfully !')]");
	By chkPeriod=By.xpath("//label[@class='i-checkbox m-b-0 ng-scope']");
	
	public KPIMappingHistory(WebDriver _driver) {
		super(_driver);
	}
	
	public boolean isChkKPIHistoryDisplayed()
	{
		boolean flag = false;
		try {
			if (driver.findElements(chkKPIHistory).size() > 0) {
				flag = true;
			}
		} catch (Exception e) {
			return flag;
		}
		return flag;
	}
	
	public boolean ismsgUpdateSuccessfullyDisplayed()
	{
		boolean flag = false;
		try {
			if (driver.findElements(msgUpdateSuccessfully).size() > 0) {
				flag = true;
			}
		} catch (Exception e) {
			return flag;
		}
		return flag;
	}
	public boolean isbtnBackDisplayed()
	{
		boolean flag = false;
		try {
			if (driver.findElements(btnBack).size() > 0) {
				flag = true;
			}
		} catch (Exception e) {
			return flag;
		}
		return flag;
	}
	public boolean islblKPIHistoryDisplayed()
	{
		boolean flag = false;
		try {
			if (driver.findElements(lblKPIHistory).size() > 0) {
				flag = true;
			}
		} catch (Exception e) {
			return flag;
		}
		return flag;
	}

	public boolean ismsgDeleteSuccessfullyDisplayed()
	{
		boolean flag = false;
		try {
			if (driver.findElements(msgDeleteSuccessfully).size() > 0) {
				flag = true;
			}
		} catch (Exception e) {
			return flag;
		}
		return flag;
	}

	

	public boolean isbtnAddDisplayed()
	{
		boolean flag = false;
		try {
			if (driver.findElement(btnAdd).isDisplayed() == true) {
				flag = true;
			}
		} catch (Exception e) {
			return flag;
		}
		return flag;
	}
	public boolean isbtnKPIBoardDisplayed()
	{
		boolean flag = false;
		try {
			if (driver.findElement(btnKPIBoard).isDisplayed() == true) {
				flag = true;
			}
		} catch (Exception e) {
			return flag;
		}
		return flag;
	}
	public void clickbtnAdd()
	{
		waitForElementClickable(5, btnAdd);
		clickByJavaScript(btnAdd);
	}
	public void clickKPIBoard()
	{
		waitForElementClickable(5, btnKPIBoard);
		clickByJavaScript(btnKPIBoard);
	}
	
	public void clickbtnYes()
	{
		waitForElementClickable(5, btnYes);
		clickByJavaScript(btnYes);
	}
	public void clickbtnBack()
	{
		waitForElementClickable(5, btnBack);
		clickByJavaScript(btnBack);
	}
	public void clickchkKPIHistory()
	{
		waitForElementClickable(2,chkKPIHistory);
		clickByJavaScript(chkKPIHistory);
	}
	public void clickbtnDeleteKPIHistory()
	{
		waitForElementClickable(5, btnDeleteKPIHistory);
		clickByJavaScript(btnDeleteKPIHistory);
	}
	public void clickchkPeriod()
	{
		waitForElementClickable(5, chkPeriod);
		clickByJavaScript(chkPeriod);
	}
	
	public void deleteKPIMappingHistory()
	{
		sleep(3);
		clickchkPeriod();
		clickbtnDeleteKPIHistory();
		clickbtnYes();
	}

}
