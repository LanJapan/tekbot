package tekbot;

import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Ulties.PropertyManager;
import Ulties.TestLogger;
import Ulties.TestManager;
import controller.WebDriversManager;
import tekbot.pages.HomePage_Client_Test1;

public class Test_ChatBot_Activities_only_command extends TestManager {

	HomePage_Client_Test1 homePage;
	WebDriver driver;
	PropertyManager propertyManager;

	@BeforeTest
	public void KhoiTaoCacNguonTaiNguyen() {

		propertyManager = new PropertyManager();
		propertyManager.loadData();
		driver = WebDriversManager.moTrinhDuyet("chrome");
		homePage = new HomePage_Client_Test1(driver);
		TestLogger.info("Type any command");
		homePage.typeMessage("hello");
		TestLogger.info("Click on Sign in button");
		homePage.clickButtonSignin();
		String code=homePage.openNewTabAndGetCode(driver);
		TestLogger.info("Paste code");
		homePage.typeMessage(code);
		homePage.waitForPageLoaded();
		TestLogger.info("Click on Submit button");
		homePage.clickButtonSubmit();
		TestLogger.info("Click on I'min (#imin) button");
		homePage.clickButtonImin();
		TestLogger.info("Scroll to bottom page");
		homePage.scrollToBottomPage();
		
	}

	@BeforeMethod
	public void PrintNameTestCase(Method method) {
		TestLogger.info("====== Begin Testcase : " + method.getName() + " ========");
	}
		@Test(priority = 1)
		public void TT_797() throws InterruptedException {
			TestLogger.info("Type command: #lunch");
			homePage.typeMessage("#lunch");
			if (homePage.isTxtCommandLunchDisplayed()== true) {
				setStatusTest("PASS", "Lunch command is displayed");
			} else {
				setStatusTest("FAIL", "Lunch command  is NOT displayed");
			}
			if (homePage.isLblLunchDisplayed()== true) {
				setStatusTest("PASS", "Lunch title is displayed");
			} else {
				setStatusTest("FAIL", "Lunch title  is NOT displayed");
			}
			if (homePage.isTxtLunchDisplayed()== true) {
				setStatusTest("PASS", "Lunch content is displayed");
			} else {
				setStatusTest("FAIL", "Lunch content  is NOT displayed");
			}
			if (homePage.isBtnFinishLunchDisplayed()== true) {
				setStatusTest("PASS", "Finish Lunch button is displayed");
			} else {
				setStatusTest("FAIL", "Finish Lunch button  is NOT displayed");
			}
			TestLogger.info("Type command: #lunch");
			homePage.typeMessage("#lunch");
			TestLogger.info("Click on Finish Lunch button");
			homePage.clickButtonFinishLunchActivityFirst();
			if (homePage.isTxtFinishLunchDisplayed()== true) {
				setStatusTest("PASS", "Don’t go sleepy on me now Test 1 Staff ;) is displayed");
			} else {
				setStatusTest("FAIL", "Don’t go sleepy on me now Test 1 Staff ;) is NOT displayed");
			}
	}
	//	@Test(priority = 8)
		public void TT_6847() throws InterruptedException {
			TestLogger.info("Scroll to Break button");
			homePage.scrolltoActivityCategory();
			TestLogger.info("Click Break (#break) button");
			homePage.clickButtonBreak();
			TestLogger.info("Scroll to bottom page");
			homePage.scrollToBottomPage();
			if (homePage.isLblBreakDisplayed()== true) {
				setStatusTest("PASS", "Break title is displayed");
			} else {
				setStatusTest("FAIL", "Break title  is NOT displayed");
			}
			if (homePage.isTxtBreakDisplayed()== true) {
				setStatusTest("PASS", "Break content is displayed");
			} else {
				setStatusTest("FAIL", "Break content  is NOT displayed");
			}
			if (homePage.isBtnFinishBreakDisplayed()== true) {
				setStatusTest("PASS", "Finish Break button is displayed");
			} else {
				setStatusTest("FAIL", "Finish Break button  is NOT displayed");
			}
			//==================================
			TestLogger.info("Type command: #meeting");
			homePage.typeMessage("#meeting");
			if (homePage.isTxtCommandMeetingDisplayed()== true) {
				setStatusTest("PASS", "Meeting command is displayed");
			} else {
				setStatusTest("FAIL", "Meeting command  is NOT displayed");
			}
			if (homePage.isLblFinishYourActivityFirst_BreakDisplayed()== true) {
				setStatusTest("PASS", "Finish Your Activity First title is displayed");
			} else {
				setStatusTest("FAIL", "Finish Your Activity First title  is NOT displayed");
			}
			if (homePage.isTxtFinishYourActivityFirst_BreakDisplayed()== true) {
				setStatusTest("PASS", "Finish Your Activity First content is displayed");
			} else {
				setStatusTest("FAIL", "Finish Your Activity First content  is NOT displayed");
			}
			if (homePage.isBtnFinishBreakActivityFirstDisplayed()== true) {
				setStatusTest("PASS", "Finish Break button is displayed");
			} else {
				setStatusTest("FAIL", "Finish Break button  is NOT displayed");
			}
			TestLogger.info("Click on Finish Break button");
			homePage.clickButtonFinishBreakActivityFirst();
			if (homePage.isTxtFinishBreakDisplayed()== true) {
				setStatusTest("PASS", "Hey did you close the door? I hate that buzzer :s is displayed");
			} else {
				setStatusTest("FAIL", "Hey did you close the door? I hate that buzzer :s is NOT displayed");
			}
	}
	
	//	@Test(priority = 9)
		public void TT_6848() throws InterruptedException {
			TestLogger.info("Scroll to Break button");
			homePage.scrolltoActivityCategory();
			TestLogger.info("Click Break (#break) button");
			homePage.clickButtonBreak();
			TestLogger.info("Scroll to bottom page");
			homePage.scrollToBottomPage();
			//=====================================
			if (homePage.isLblBreakDisplayed()== true) {
				setStatusTest("PASS", "Break title is displayed");
			} else {
				setStatusTest("FAIL", "Break title  is NOT displayed");
			}
			if (homePage.isTxtBreakDisplayed()== true) {
				setStatusTest("PASS", "Break content is displayed");
			} else {
				setStatusTest("FAIL", "Break content  is NOT displayed");
			}
			if (homePage.isBtnFinishBreakDisplayed()== true) {
				setStatusTest("PASS", "Finish Break button is displayed");
			} else {
				setStatusTest("FAIL", "Finish Break button  is NOT displayed");
			}
			//==================================
			TestLogger.info("Type command: #meeting");
			homePage.typeMessage("#meeting");
			if (homePage.isTxtCommandMeetingDisplayed()== true) {
				setStatusTest("PASS", "Meeting command is displayed");
			} else {
				setStatusTest("FAIL", "Meeting command  is NOT displayed");
			}
			if (homePage.isLblFinishYourActivityFirst_BreakDisplayed()== true) {
				setStatusTest("PASS", "Finish Your Activity First title is displayed");
			} else {
				setStatusTest("FAIL", "Finish Your Activity First title  is NOT displayed");
			}
			if (homePage.isTxtFinishYourActivityFirst_BreakDisplayed()== true) {
				setStatusTest("PASS", "Finish Your Activity First content is displayed");
			} else {
				setStatusTest("FAIL", "Finish Your Activity First content  is NOT displayed");
			}
			if (homePage.isBtnFinishBreakActivityFirstDisplayed()== true) {
				setStatusTest("PASS", "Finish Break button is displayed");
			} else {
				setStatusTest("FAIL", "Finish Break button  is NOT displayed");
			}
			TestLogger.info("Click on Finish Break button");
			homePage.clickButtonFinishBreakActivityFirst();
			if (homePage.isTxtFinishBreakDisplayed()== true) {
				setStatusTest("PASS", "Hey did you close the door? I hate that buzzer :s is displayed");
			} else {
				setStatusTest("FAIL", "Hey did you close the door? I hate that buzzer :s is NOT displayed");
			}
	}
	
	//	@Test(priority = 10)
		public void TT_6849() throws InterruptedException {
			homePage.waitForPageLoaded();
			TestLogger.info("User type random thing to the bot.");
			homePage.typeMessage("help");
			TestLogger.info("Click Activity (#activity) button");
			homePage.clickButtonActivity();
			TestLogger.info("Click Meeting (#meeting) button");
			homePage.clickButtonMeeting();
			//=====================================
			if (homePage.isLblMeetingDisplayed()== true) {
				setStatusTest("PASS", "Meeting title is displayed");
			} else {
				setStatusTest("FAIL", "Meeting title  is NOT displayed");
			}
			if (homePage.isTxtMeetingDisplayed()== true) {
				setStatusTest("PASS", "Meeting content is displayed");
			} else {
				setStatusTest("FAIL", "Meeting content  is NOT displayed");
			}
			if (homePage.isBtnFinishMeetingDisplayed()== true) {
				setStatusTest("PASS", "Finish Meeting button is displayed");
			} else {
				setStatusTest("FAIL", "Finish Meeting button  is NOT displayed");
			}
			//==================================
			TestLogger.info("Type command: #lunch");
			homePage.typeMessage("#lunch");
			if (homePage.isTxtCommandLunchDisplayed()== true) {
				setStatusTest("PASS", "Lunch command is displayed");
			} else {
				setStatusTest("FAIL", "Lunch command  is NOT displayed");
			}
			if (homePage.isLblFinishYourActivityFirst_MeetingDisplayed()== true) {
				setStatusTest("PASS", "Finish Your Activity First title is displayed");
			} else {
				setStatusTest("FAIL", "Finish Your Activity First title  is NOT displayed");
			}
			if (homePage.isTxtFinishYourActivityFirst_MeetingDisplayed()== true) {
				setStatusTest("PASS", "Finish Your Activity First content is displayed");
			} else {
				setStatusTest("FAIL", "Finish Your Activity First content  is NOT displayed");
			}
			if (homePage.isBtnFinishMeetingActivityFirstDisplayed()== true) {
				setStatusTest("PASS", "Finish Meeting button is displayed");
			} else {
				setStatusTest("FAIL", "Finish Meeting button  is NOT displayed");
			}
			TestLogger.info("Click on Finish Meeting button");
			homePage.clickButtonFinishMeetingActivityFirst();
			if (homePage.isTxtFinishMeetingDisplayed()== true) {
				setStatusTest("PASS", "Hope the meeting wasn’t boring. is displayed");
			} else {
				setStatusTest("FAIL", "Hope the meeting wasn’t boring. is NOT displayed");
			}
	}
		//@Test(priority = 11)
		public void TT_6850() throws InterruptedException {
			homePage.waitForPageLoaded();
			TestLogger.info("User type random thing to the bot.");
			homePage.typeMessage("help");
			TestLogger.info("Click Activity (#activity) button");
			homePage.clickButtonActivity();
			TestLogger.info("Click 1 on 1 (#1on1) button");
			homePage.clickButton1on1();
			//=====================================
			if (homePage.isLbl1on1Displayed()== true) {
				setStatusTest("PASS", "1 on 1 title is displayed");
			} else {
				setStatusTest("FAIL", "1 on 1  title  is NOT displayed");
			}
			if (homePage.isTxt1on1Displayed()== true) {
				setStatusTest("PASS", "1 on 1  content is displayed");
			} else {
				setStatusTest("FAIL", "1 on 1  content  is NOT displayed");
			}
			if (homePage.isBtnFinish1on1Displayed()== true) {
				setStatusTest("PASS", "Finish 1 on 1  button is displayed");
			} else {
				setStatusTest("FAIL", "Finish 1 on 1  button  is NOT displayed");
			}
			//==================================
			homePage.waitForPageLoaded();
			TestLogger.info("Type command: #lunch");
			homePage.typeMessage("#lunch");
			if (homePage.isTxtCommandLunchDisplayed()== true) {
				setStatusTest("PASS", "Lunch command is displayed");
			} else {
				setStatusTest("FAIL", "Lunch command  is NOT displayed");
			}
			if (homePage.isLblFinishYourActivityFirst_1on1Displayed()== true) {
				setStatusTest("PASS", "Finish Your Activity First title is displayed");
			} else {
				setStatusTest("FAIL", "Finish Your Activity First title  is NOT displayed");
			}
			if (homePage.isTxtFinishYourActivityFirst_1on1Displayed()== true) {
				setStatusTest("PASS", "Finish Your Activity First content is displayed");
			} else {
				setStatusTest("FAIL", "Finish Your Activity First content  is NOT displayed");
			}
			if (homePage.isBtnFinish1on1ActivityFirstDisplayed()== true) {
				setStatusTest("PASS", "Finish 1 on 1  button is displayed");
			} else {
				setStatusTest("FAIL", "Finish 1 on 1  button  is NOT displayed");
			}
			TestLogger.info("Click on Finish 1 on 1  button");
			homePage.clickButtonFinish1on1ActivityFirst();
			if (homePage.isTxtFinish1on1Displayed()== true) {
				setStatusTest("PASS", "Pretty sure it went well. is displayed");
			} else {
				setStatusTest("FAIL", "Pretty sure it went well. is NOT displayed");
			}
	}
	//	@Test(priority = 12)
		public void TT_6851() throws InterruptedException {
			homePage.waitForPageLoaded();
			TestLogger.info("User type random thing to the bot.");
			homePage.typeMessage("help");
			TestLogger.info("Click Activity (#activity) button");
			homePage.clickButtonActivity();
			TestLogger.info("Click Project (#project) button");
			homePage.clickButtonProject();
			//=====================================
			if (homePage.isLblProjectDisplayed()== true) {
				setStatusTest("PASS", "Project title is displayed");
			} else {
				setStatusTest("FAIL", "Project  title  is NOT displayed");
			}
			if (homePage.isTxtProjectDisplayed()== true) {
				setStatusTest("PASS", "Project  content is displayed");
			} else {
				setStatusTest("FAIL", "Project  content  is NOT displayed");
			}
			if (homePage.isBtnFinishProjectDisplayed()== true) {
				setStatusTest("PASS", "Finish Project  button is displayed");
			} else {
				setStatusTest("FAIL", "Finish Project  button  is NOT displayed");
			}
			//==================================
			homePage.waitForPageLoaded();
			TestLogger.info("Type command: #lunch");
			homePage.typeMessage("#lunch");
			if (homePage.isTxtCommandLunchDisplayed()== true) {
				setStatusTest("PASS", "Lunch command is displayed");
			} else {
				setStatusTest("FAIL", "Lunch command  is NOT displayed");
			}
			if (homePage.isLblFinishYourActivityFirst_ProjectDisplayed()== true) {
				setStatusTest("PASS", "Finish Your Activity First title is displayed");
			} else {
				setStatusTest("FAIL", "Finish Your Activity First title  is NOT displayed");
			}
			if (homePage.isTxtFinishYourActivityFirst_ProjectDisplayed()== true) {
				setStatusTest("PASS", "Finish Your Activity First content is displayed");
			} else {
				setStatusTest("FAIL", "Finish Your Activity First content  is NOT displayed");
			}
			if (homePage.isBtnFinishProjectActivityFirstDisplayed()== true) {
				setStatusTest("PASS", "Finish Project  button is displayed");
			} else {
				setStatusTest("FAIL", "Finish Project  button  is NOT displayed");
			}
			TestLogger.info("Click on Finish Project  button");
			homePage.clickButtonFinishProjectActivityFirst();
			if (homePage.isTxtFinishProjectDisplayed()== true) {
				setStatusTest("PASS", "Welcome back Test 1 Staff. is displayed");
			} else {
				setStatusTest("FAIL", "Welcome back Test 1 Staff. is NOT displayed");
			}
	}
		//@Test(priority = 13)
		public void TT_6852() throws InterruptedException {
			homePage.waitForPageLoaded();
			TestLogger.info("User type random thing to the bot.");
			homePage.typeMessage("help");
			TestLogger.info("Click Activity (#activity) button");
			homePage.clickButtonActivity();
			TestLogger.info("Click Nesting (#nesting) button");
			homePage.clickButtonNesting();
			//=====================================
			if (homePage.isLblNestingDisplayed()== true) {
				setStatusTest("PASS", "Nesting title is displayed");
			} else {
				setStatusTest("FAIL", "Nesting  title  is NOT displayed");
			}
			if (homePage.isTxtNestingDisplayed()== true) {
				setStatusTest("PASS", "Nesting  content is displayed");
			} else {
				setStatusTest("FAIL", "Nesting  content  is NOT displayed");
			}
			if (homePage.isBtnFinishNestingDisplayed()== true) {
				setStatusTest("PASS", "Finish Nesting  button is displayed");
			} else {
				setStatusTest("FAIL", "Finish Nesting  button  is NOT displayed");
			}
			//==================================
			homePage.waitForPageLoaded();
			TestLogger.info("Type command: #lunch");
			homePage.typeMessage("#lunch");
			if (homePage.isTxtCommandLunchDisplayed()== true) {
				setStatusTest("PASS", "Lunch command is displayed");
			} else {
				setStatusTest("FAIL", "Lunch command  is NOT displayed");
			}
			if (homePage.isLblFinishYourActivityFirst_NestingDisplayed()== true) {
				setStatusTest("PASS", "Finish Your Activity First title is displayed");
			} else {
				setStatusTest("FAIL", "Finish Your Activity First title  is NOT displayed");
			}
			if (homePage.isTxtFinishYourActivityFirst_NestingDisplayed()== true) {
				setStatusTest("PASS", "Finish Your Activity First content is displayed");
			} else {
				setStatusTest("FAIL", "Finish Your Activity First content  is NOT displayed");
			}
			if (homePage.isBtnFinishNestingActivityFirstDisplayed()== true) {
				setStatusTest("PASS", "Finish Nesting  button is displayed");
			} else {
				setStatusTest("FAIL", "Finish Nesting  button  is NOT displayed");
			}
			TestLogger.info("Click on Finish Nesting  button");
			homePage.clickButtonFinishNestingActivityFirst();
			if (homePage.isTxtFinishNestingDisplayed()== true) {
				setStatusTest("PASS", "Welcome back Test 1 Staff. is displayed");
			} else {
				setStatusTest("FAIL", "Welcome back Test 1 Staff. is NOT displayed");
			}
	}
	@AfterMethod(alwaysRun = true)
	public void finishTestCase(Method method) throws InterruptedException {

		TestLogger.info("====== End Testcase : " + method.getName() + " ======");

	}

	@AfterTest(alwaysRun = true)
	public void dongTrinhDuyet() {
		driver.close();
	}
}
