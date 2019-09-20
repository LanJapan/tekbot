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
import tekbot.pages.HomePage_Client_Test3;

public class Test_ChatBot_Activities_Test3 extends TestManager {

	HomePage_Client_Test3 homePage;
	WebDriver driver;
	PropertyManager propertyManager;

	@BeforeTest
	public void KhoiTaoCacNguonTaiNguyen() {

		propertyManager = new PropertyManager();
		propertyManager.loadData();

		WebDriversManager manager = new WebDriversManager();
		driver = manager.moTrinhDuyetMoi("chrome");
		homePage = new HomePage_Client_Test3(driver);

	}

	@BeforeMethod
	public void PrintNameTestCase(Method method) {
		TestLogger.info("====== Begin Testcase : " + method.getName() + " ========");
	}

	@Test(priority = 1)
	public void TT_6133() throws InterruptedException {
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
	public void TT_6135() throws InterruptedException {
		TestLogger.info("Type any command");
		homePage.typeMessage("hello");
		TestLogger.info("Click on Sign in button");
		homePage.clickButtonSignin();
		String code=homePage.openNewTabAndGetCode(driver);
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
	public void TT_6174() throws InterruptedException {
		//homePage.waitForPageLoaded();
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
	public void TT_6631() throws InterruptedException {
		//homePage.waitForPageLoaded();
		TestLogger.info("Click on I'min (#imin) button");
		homePage.clickButtonImin();
		TestLogger.info("Scroll to bottom page");
		homePage.scrollToBottomPage();
		if (homePage.isTxtHelloDisplayed()== true) {
			setStatusTest("PASS", "hello nick name is displayed");
		} else {
			setStatusTest("FAIL", "hello nick name is NOT displayed");
		}
	}
	//@Test(priority = 5)
	public void TT_6586() throws InterruptedException {
		TestLogger.info("User type random thing to the bot.");
		homePage.typeMessage("help");
		if (homePage.isLblHelpDisplayed()== true) {
			setStatusTest("PASS", "Help title is displayed");
		} else {
			setStatusTest("FAIL", "Help title  is NOT displayed");
		}
		if (homePage.isTxtHelpDisplayed()== true) {
			setStatusTest("PASS", "Help content is displayed");
		} else {
			setStatusTest("FAIL", "Help content  is NOT displayed");
		}
		if (homePage.isBtnActivityDisplayed()== true) {
			setStatusTest("PASS", "Activity button is displayed");
		} else {
			setStatusTest("FAIL", "Activity button  is NOT displayed");
		}
		if (homePage.isBtnCaseDisplayed()== true) {
			setStatusTest("PASS", "Case button is displayed");
		} else {
			setStatusTest("FAIL", "Case button  is NOT displayed");
		}
		if (homePage.isBtnGuideDisplayed()== true) {
			setStatusTest("PASS", "Guide button is displayed");
		} else {
			setStatusTest("FAIL", "Guide button  is NOT displayed");
		}
	}
	//	@Test(priority = 6)
		public void TT_6580() throws InterruptedException {
			homePage.waitForPageLoaded();
			TestLogger.info("Click Activity (#activity) button");
			homePage.clickButtonActivity();
			if (homePage.isTxtCommandActivityDisplayed()== true) {
				setStatusTest("PASS", "Activity command is displayed");
			} else {
				setStatusTest("FAIL", "Activity command  is NOT displayed");
			}
			if (homePage.isLblActivityDisplayed()== true) {
				setStatusTest("PASS", "Activity label is displayed");
			} else {
				setStatusTest("FAIL", "Activity label  is NOT displayed");
			}
			if (homePage.isTxtActivityDisplayed()== true) {
				setStatusTest("PASS", "Activity content is displayed");
			} else {
				setStatusTest("FAIL", "Activity content  is NOT displayed");
			}
			if (homePage.isBtnLunchDisplayed()== true) {
				setStatusTest("PASS", "Lunch button is displayed");
			} else {
				setStatusTest("FAIL", "Lunch button  is NOT displayed");
			}
			if (homePage.isBtnBreakDisplayed()== true) {
				setStatusTest("PASS", "Break button is displayed");
			} else {
				setStatusTest("FAIL", "Break button  is NOT displayed");
			}
			if (homePage.isBtnMeetingDisplayed()== true) {
				setStatusTest("PASS", "Meeting button is displayed");
			} else {
				setStatusTest("FAIL", "Meeting button  is NOT displayed");
			}
			if (homePage.isBtnTrainingDisplayed()== true) {
				setStatusTest("PASS", "Training button is displayed");
			} else {
				setStatusTest("FAIL", "Training button  is NOT displayed");
			}
			if (homePage.isBtn1on1Displayed()== true) {
				setStatusTest("PASS", "1 on 1 button is displayed");
			} else {
				setStatusTest("FAIL", "1 on 1 button  is NOT displayed");
			}
			if (homePage.isBtnProjectDisplayed()== true) {
				setStatusTest("PASS", "Project button is displayed");
			} else {
				setStatusTest("FAIL", "Project button  is NOT displayed");
			}
			if (homePage.isBtnNestingDisplayed()== true) {
				setStatusTest("PASS", "Nesting button is displayed");
			} else {
				setStatusTest("FAIL", "Nesting button  is NOT displayed");
			}
			if (homePage.isBtnImoutDisplayed()== true) {
				setStatusTest("PASS", "I'm out button is displayed");
			} else {
				setStatusTest("FAIL", "I'm out button  is NOT displayed");
			}
	}
		
	//	@Test(priority = 7)
		public void TT_6846() throws InterruptedException {
			TestLogger.info("Click Lunch (#lunch) button");
			homePage.clickButtonLunch();
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
			TestLogger.info("Type command: #break");
			homePage.typeMessage("#break");
			if (homePage.isTxtCommandBreakDisplayed()== true) {
				setStatusTest("PASS", "Break command is displayed");
			} else {
				setStatusTest("FAIL", "Break command  is NOT displayed");
			}
			if (homePage.isLblFinishYourActivityFirstDisplayed()== true) {
				setStatusTest("PASS", "Finish Your Activity First title is displayed");
			} else {
				setStatusTest("FAIL", "Finish Your Activity First title  is NOT displayed");
			}
			if (homePage.isTxtFinishYourActivityFirstDisplayed()== true) {
				setStatusTest("PASS", "Finish Your Activity First content is displayed");
			} else {
				setStatusTest("FAIL", "Finish Your Activity First content  is NOT displayed");
			}
			if (homePage.isBtnFinishLunchActivityFirstDisplayed()== true) {
				setStatusTest("PASS", "Finish Lunch button is displayed");
			} else {
				setStatusTest("FAIL", "Finish Lunch button  is NOT displayed");
			}
			TestLogger.info("Click on Finish Lunch button");
			homePage.clickButtonFinishLunchActivityFirst();
			if (homePage.isTxtFinishLunchDisplayed()== true) {
				setStatusTest("PASS", "Don’t go sleepy on me now Test 2 Staff ;) is displayed");
			} else {
				setStatusTest("FAIL", "Don’t go sleepy on me now Test 2 Staff ;) is NOT displayed");
			}
	}
		//@Test(priority = 8)
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
	//	@Test(priority = 10)
	public void TT_6849() throws InterruptedException {
			homePage.waitForPageLoaded();
			TestLogger.info("User type random thing to the bot.");
			homePage.typeMessage("help");
			TestLogger.info("Click Activity (#activity) button");
			homePage.clickButtonActivity();
			TestLogger.info("Click Training button");
			homePage.clickButtonTraining();
			//=====================================
			if (homePage.isLblTrainingDisplayed()== true) {
				setStatusTest("PASS", "Training title is displayed");
			} else {
				setStatusTest("FAIL", "Training  title  is NOT displayed");
			}
			if (homePage.isTxtTrainingDisplayed()== true) {
				setStatusTest("PASS", "Training  content is displayed");
			} else {
				setStatusTest("FAIL", "Training  content  is NOT displayed");
			}
			if (homePage.isBtnFinishTrainingDisplayed()== true) {
				setStatusTest("PASS", "Finish Training  button is displayed");
			} else {
				setStatusTest("FAIL", "Finish Training  button  is NOT displayed");
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
			if (homePage.isLblFinishYourActivityFirst_TrainingDisplayed()== true) {
				setStatusTest("PASS", "Finish Your Activity First title is displayed");
			} else {
				setStatusTest("FAIL", "Finish Your Activity First title  is NOT displayed");
			}
			if (homePage.isTxtFinishYourActivityFirst_TrainingDisplayed()== true) {
				setStatusTest("PASS", "Finish Your Activity First content is displayed");
			} else {
				setStatusTest("FAIL", "Finish Your Activity First content  is NOT displayed");
			}
			if (homePage.isBtnFinishTrainingActivityFirstDisplayed()== true) {
				setStatusTest("PASS", "Finish 1 on 1  button is displayed");
			} else {
				setStatusTest("FAIL", "Finish 1 on 1  button  is NOT displayed");
			}
			TestLogger.info("Click on Training  button");
			homePage.clickButtonFinishTrainingActivityFirst();
			if (homePage.isTxtFinishTrainingDisplayed()== true) {
				setStatusTest("PASS", "Msg is displayed");
			} else {
				setStatusTest("FAIL", "Msg is NOT displayed");
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
		//@Test(priority = 12)
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
				setStatusTest("PASS", "Welcome back Test 2 Staff. is displayed");
			} else {
				setStatusTest("FAIL", "Welcome back Test 2 Staff. is NOT displayed");
			}
	}
	//	@Test(priority = 13)
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
		//driver.close();
	}
}
