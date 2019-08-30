package talentwize.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import controller.WebActions;

public class GoalReview extends WebActions
{

	public GoalReview(WebDriver _driver) {
		super(_driver);
	}

	By btnBack = By.xpath("//button[@type='button'][contains(.,'Back')]");
	
	public void clickBtnBack()
	{
		waitForElementClickable(5, btnBack);
		clickByJavaScript(btnBack);
		
	}
}
