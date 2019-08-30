package talentwize.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import controller.WebActions;

public class TabLeaveBalance extends WebActions {
	
	By btnAdd = By.xpath("//button[contains(.,'Add')]");

	By iconDelete = By.xpath("//i[@class='icon icon-bin']");

	By IsLinksOfNamePolicyListClickable = By.xpath("(//a[@ng-if='permission.allowUpdating'])");
	
	public TabLeaveBalance(WebDriver _driver) {
		super(_driver);
		// TODO Auto-generated constructor stub
	}
	
	

	
	public boolean isBtnAddDisplayed() {
		boolean flag= false;
		try {
			if (!driver.findElement(btnAdd).getAttribute("style").contains("display: none"))
				flag = true;
		} catch (Exception e) {
			flag = false;
		}
		return flag;
	}

	public boolean isIconDeleteDisplayed() {
		boolean flag = false;
		try {
			if (driver.findElement(iconDelete).isDisplayed() == true)
				flag = true;
		} catch (Exception e) {
			flag = false;
		}
		return flag;
	}

	public boolean IsLinksOfNamePolicyListClickable() {
		boolean flag = false;
		try {
			if (driver.findElements(IsLinksOfNamePolicyListClickable).size() > 0)
				flag = true;
		} catch (Exception e) {
			flag = false;
			// TODO: handle exception
		}
		return flag;

	}


}
