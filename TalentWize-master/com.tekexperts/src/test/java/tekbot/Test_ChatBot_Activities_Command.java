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
import tekbot.pages.HomePage_Client_Test;

public class Test_ChatBot_Activities_Command extends TestManager {

	HomePage_Client_Test homePage;
	WebDriver driver;
	PropertyManager propertyManager;

	@BeforeTest
	public void KhoiTaoCacNguonTaiNguyen() {

		propertyManager = new PropertyManager();
		propertyManager.loadData();

		driver = WebDriversManager.moTrinhDuyet("chrome");
		homePage = new HomePage_Client_Test(driver);

	}

	@BeforeMethod
	public void PrintNameTestCase(Method method) {
		TestLogger.info("====== Begin Testcase : " + method.getName() + " ========");
	}

	@Test(priority = 1)
	public void Welcome() throws InterruptedException {
		TestLogger.info("Verify home page client is displayed");
		if (homePage.istxtWelcometoTekBotDisplayed() == true) {
			setStatusTest("PASS", "Welcome to TekBot is displayed");
		} else {
			setStatusTest("FAIL", "Welcome to TekBot is NOT displayed");
		}
		if (homePage.isIconChatBotDisplayed() == true) {
			setStatusTest("PASS", "Icon TekBot is displayed");
		} else {
			setStatusTest("FAIL", "Icon TekBot is NOT displayed");
		}
		if (homePage.istxtHiTekBotDisplayed() == true) {
			setStatusTest("PASS", "Hi TekBot is displayed");
		} else {
			setStatusTest("FAIL", "Hi TekBot is NOT displayed");
		}
	}

	@Test(priority = 2)
	public void SignIn() throws InterruptedException {
		TestLogger.info("Type any command");
		homePage.typeMessage("hello");
		TestLogger.info("Click on Sign in button");
		homePage.clickButtonSignin();
		String code = homePage.openNewTabAndGetCode(driver);
		TestLogger.info("Paste code");
		homePage.typeMessage(code);
		homePage.waitForPageLoaded();
		if (homePage.isSetNickNameDisplayed() == true) {
			setStatusTest("PASS", "Set Nick Name is displayed");
		} else {
			setStatusTest("FAIL", "Set Nick Name is NOT displayed");
		}
		if (homePage.isCallNickNameDisplayed() == true) {
			setStatusTest("PASS", "Call Nick Name is displayed");
		} else {
			setStatusTest("FAIL", "Call Nick Name is NOT displayed");
		}
		if (homePage.isTxtNickNameDisplayed() == true) {
			setStatusTest("PASS", "Textbox Nick Name is displayed");
		} else {
			setStatusTest("FAIL", "Textbox Nick Name is NOT displayed");
		}
		if (homePage.isBtnSubmitDisplayed() == true) {
			setStatusTest("PASS", "Button Submit is displayed");
		} else {
			setStatusTest("FAIL", "Button Submit is NOT displayed");
		}
	}

	@Test(priority = 3)
	public void NickName() throws InterruptedException {
		homePage.waitForPageLoaded();
		TestLogger.info("Click on Submit button");
		homePage.clickButtonSubmit();
		if (homePage.isNiceMeetingYouDisplayed() == true) {
			setStatusTest("PASS", "Nice meeting you is displayed");
		} else {
			setStatusTest("FAIL", "Nice meeting you is NOT displayed");
		}
		if (homePage.isLblClockingInDisplayed() == true) {
			setStatusTest("PASS", "Clocking in is displayed");
		} else {
			setStatusTest("FAIL", "Clocking in is NOT displayed");
		}
		if (homePage.isTxtGoodMorningDisplayed() == true) {
			setStatusTest("PASS", "Good morning is displayed");
		} else {
			setStatusTest("FAIL", "Good morning is NOT displayed");
		}
		if (homePage.isBtnIminDisplayed() == true) {
			setStatusTest("PASS", "Button Imin is displayed");
		} else {
			setStatusTest("FAIL", "Button Imin is NOT displayed");
		}
	}

	@Test(priority = 4)
	public void Imin() throws InterruptedException {
		homePage.waitForPageLoaded();
		TestLogger.info("Click on I'min (#imin) button");
		homePage.clickButtonImin();
		TestLogger.info("Scroll to bottom page");
		homePage.scrollToBottomPage();
	}

	@Test(priority = 5)
	public void TT_797() throws InterruptedException {
		TestLogger.info("Type command: #lunch");
		homePage.typeMessage("#lunch");
		if (homePage.isTxtCommandLunchDisplayed() == true) {
			setStatusTest("PASS", "Lunch command is displayed");
		} else {
			setStatusTest("FAIL", "Lunch command  is NOT displayed");
		}
		if (homePage.isLblLunchDisplayed() == true) {
			setStatusTest("PASS", "Lunch title is displayed");
		} else {
			setStatusTest("FAIL", "Lunch title  is NOT displayed");
		}
		if (homePage.isTxtLunchDisplayed() == true) {
			setStatusTest("PASS", "Lunch content is displayed");
		} else {
			setStatusTest("FAIL", "Lunch content  is NOT displayed");
		}
		if (homePage.isBtnFinishLunchDisplayed() == true) {
			setStatusTest("PASS", "Finish Lunch button is displayed");
		} else {
			setStatusTest("FAIL", "Finish Lunch button  is NOT displayed");
		}
		TestLogger.info("Type command: #lunch");
		homePage.typeMessage("#lunch");
		if (homePage.isTxtFinishLunchDisplayed() == true) {
			setStatusTest("PASS", "Don�t go sleepy on me now Test 1 Staff ;) is displayed");
		} else {
			setStatusTest("FAIL", "Don�t go sleepy on me now Test 1 Staff ;) is NOT displayed");
		}
	}

	@Test(priority = 6)
	public void TT_795() throws InterruptedException {
		TestLogger.info("Type command: #break");
		homePage.typeMessage("#break");
		if (homePage.isLblBreakDisplayed() == true) {
			setStatusTest("PASS", "Break title is displayed");
		} else {
			setStatusTest("FAIL", "Break title  is NOT displayed");
		}
		if (homePage.isTxtBreakDisplayed() == true) {
			setStatusTest("PASS", "Break content is displayed");
		} else {
			setStatusTest("FAIL", "Break content  is NOT displayed");
		}
		if (homePage.isBtnFinishBreakDisplayed() == true) {
			setStatusTest("PASS", "Finish Break button is displayed");
		} else {
			setStatusTest("FAIL", "Finish Break button  is NOT displayed");
		}
		TestLogger.info("Type command: #break");
		homePage.typeMessage("#break");
		if (homePage.isTxtFinishBreakDisplayed() == true) {
			setStatusTest("PASS", "Hey did you close the door? I hate that buzzer :s is displayed");
		} else {
			setStatusTest("FAIL", "Hey did you close the door? I hate that buzzer :s is NOT displayed");
		}
	}

	@Test(priority = 7)
	public void TT_802() throws InterruptedException {
		TestLogger.info("Type command: #meeting");
		homePage.typeMessage("#meeting");
		// =====================================
		if (homePage.isLblMeetingDisplayed() == true) {
			setStatusTest("PASS", "Meeting title is displayed");
		} else {
			setStatusTest("FAIL", "Meeting title  is NOT displayed");
		}
		if (homePage.isTxtMeetingDisplayed() == true) {
			setStatusTest("PASS", "Meeting content is displayed");
		} else {
			setStatusTest("FAIL", "Meeting content  is NOT displayed");
		}
		if (homePage.isBtnFinishMeetingDisplayed() == true) {
			setStatusTest("PASS", "Finish Meeting button is displayed");
		} else {
			setStatusTest("FAIL", "Finish Meeting button  is NOT displayed");
		}
		// ==================================
		TestLogger.info("Type command: #meeting");
		homePage.typeMessage("#meeting");
		if (homePage.isTxtFinishMeetingDisplayed() == true) {
			setStatusTest("PASS", "Hope the meeting wasn�t boring. is displayed");
		} else {
			setStatusTest("FAIL", "Hope the meeting wasn�t boring. is NOT displayed");
		}
	}

	@Test(priority = 8)
	public void TT_798() throws InterruptedException {
		TestLogger.info("Type command: #training");
		homePage.typeMessage("#training");
		// =====================================
		if (homePage.isLblTrainingDisplayed() == true) {
			setStatusTest("PASS", "Training title is displayed");
		} else {
			setStatusTest("FAIL", "Training  title  is NOT displayed");
		}
		if (homePage.isTxtTrainingDisplayed() == true) {
			setStatusTest("PASS", "Training  content is displayed");
		} else {
			setStatusTest("FAIL", "Training  content  is NOT displayed");
		}
		if (homePage.isBtnFinishTrainingDisplayed() == true) {
			setStatusTest("PASS", "Finish Training  button is displayed");
		} else {
			setStatusTest("FAIL", "Finish Training  button  is NOT displayed");
		}
		// ==================================
		TestLogger.info("Type command: #training");
		homePage.typeMessage("#training");
		if (homePage.isTxtFinishTrainingDisplayed() == true) {
			setStatusTest("PASS", "Msg is displayed");
		} else {
			setStatusTest("FAIL", "Msg is NOT displayed");
		}
	}

	@Test(priority = 9)
	public void TT_801() throws InterruptedException {
		homePage.waitForPageLoaded();
		TestLogger.info("Type command: #1on1");
		homePage.typeMessage("#1on1");
		// =====================================
		if (homePage.isLbl1on1Displayed() == true) {
			setStatusTest("PASS", "1 on 1 title is displayed");
		} else {
			setStatusTest("FAIL", "1 on 1  title  is NOT displayed");
		}
		if (homePage.isTxt1on1Displayed() == true) {
			setStatusTest("PASS", "1 on 1  content is displayed");
		} else {
			setStatusTest("FAIL", "1 on 1  content  is NOT displayed");
		}
		if (homePage.isBtnFinish1on1Displayed() == true) {
			setStatusTest("PASS", "Finish 1 on 1  button is displayed");
		} else {
			setStatusTest("FAIL", "Finish 1 on 1  button  is NOT displayed");
		}
		// ==================================
		TestLogger.info("Type command: #1on1");
		homePage.typeMessage("#1on1");
		if (homePage.isTxtFinish1on1Displayed() == true) {
			setStatusTest("PASS", "Pretty sure it went well. is displayed");
		} else {
			setStatusTest("FAIL", "Pretty sure it went well. is NOT displayed");
		}
	}

	@Test(priority = 10)
	public void TT_6615() throws InterruptedException {
		TestLogger.info("Type command: #project");
		homePage.typeMessage("#project");
		if (homePage.isLblProjectDisplayed() == true) {
			setStatusTest("PASS", "Project title is displayed");
		} else {
			setStatusTest("FAIL", "Project  title  is NOT displayed");
		}
		if (homePage.isTxtProjectDisplayed() == true) {
			setStatusTest("PASS", "Project  content is displayed");
		} else {
			setStatusTest("FAIL", "Project  content  is NOT displayed");
		}
		if (homePage.isBtnFinishProjectDisplayed() == true) {
			setStatusTest("PASS", "Finish Project  button is displayed");
		} else {
			setStatusTest("FAIL", "Finish Project  button  is NOT displayed");
		}
		TestLogger.info("Type command: #project");
		homePage.typeMessage("#project");
		if (homePage.isTxtFinishProjectDisplayed() == true) {
			setStatusTest("PASS", "Welcome back Test 2 Staff. is displayed");
		} else {
			setStatusTest("FAIL", "Welcome back Test 2 Staff. is NOT displayed");
		}
	}

	@Test(priority = 11)
	public void TT_6616() throws InterruptedException {
		TestLogger.info("Type command: #nesting");
		homePage.typeMessage("#nesting");
		// =====================================
		if (homePage.isLblNestingDisplayed() == true) {
			setStatusTest("PASS", "Nesting title is displayed");
		} else {
			setStatusTest("FAIL", "Nesting  title  is NOT displayed");
		}
		if (homePage.isTxtNestingDisplayed() == true) {
			setStatusTest("PASS", "Nesting  content is displayed");
		} else {
			setStatusTest("FAIL", "Nesting  content  is NOT displayed");
		}
		if (homePage.isBtnFinishNestingDisplayed() == true) {
			setStatusTest("PASS", "Finish Nesting  button is displayed");
		} else {
			setStatusTest("FAIL", "Finish Nesting  button  is NOT displayed");
		}
		// ==================================
		TestLogger.info("Type command: #nesting");
		homePage.typeMessage("#nesting");
		if (homePage.isTxtFinishNestingDisplayed() == true) {
			setStatusTest("PASS", "Welcome back Test 2 Staff. is displayed");
		} else {
			setStatusTest("FAIL", "Welcome back Test 2 Staff. is NOT displayed");
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