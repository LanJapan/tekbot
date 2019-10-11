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

public class Test_ChatBot_Activities7 extends TestManager {

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
	public void TT_851() throws InterruptedException {
		homePage.waitForPageLoaded();
		TestLogger.info("User type #imout");
		homePage.typeMessage("#imout");
		if (homePage.isLblClockingInDisplayed() == true) {
			setStatusTest("PASS", "Clocking In is displayed");
		} else {
			setStatusTest("FAIL", "Clocking In is NOT displayed");
		}
		if (homePage.isTxtRegisterIminDisplayed() == true) {
			setStatusTest("PASS", "Register as active on the chat bot is displayed");
		} else {
			setStatusTest("FAIL", "Register as active on the chat bot is NOT displayed");
		}
		if (homePage.isBtnIminDisplayed() == true) {
			setStatusTest("PASS", "Imin button is displayed");
		} else {
			setStatusTest("FAIL", "Imin button is NOT displayed");
		}
	}
	@Test(priority = 5)
	public void TT_7237() throws InterruptedException {
		homePage.waitForPageLoaded();
		TestLogger.info("User type #break");
		homePage.typeMessage("#break");
		if (homePage.isLblClockingInDisplayed() == true) {
			setStatusTest("PASS", "Clocking In is displayed");
		} else {
			setStatusTest("FAIL", "Clocking In is NOT displayed");
		}
		if (homePage.isTxtRegisterIminDisplayed() == true) {
			setStatusTest("PASS", "Register as active on the chat bot is displayed");
		} else {
			setStatusTest("FAIL", "Register as active on the chat bot is NOT displayed");
		}
		if (homePage.isBtnIminDisplayed() == true) {
			setStatusTest("PASS", "Imin button is displayed");
		} else {
			setStatusTest("FAIL", "Imin button is NOT displayed");
		}
	}
	@Test(priority = 6)
	public void TT_7238() throws InterruptedException {
		homePage.waitForPageLoaded();
		TestLogger.info("User type #lunch");
		homePage.typeMessage("#lunch");
		if (homePage.isLblClockingInDisplayed() == true) {
			setStatusTest("PASS", "Clocking In is displayed");
		} else {
			setStatusTest("FAIL", "Clocking In is NOT displayed");
		}
		if (homePage.isTxtRegisterIminDisplayed() == true) {
			setStatusTest("PASS", "Register as active on the chat bot is displayed");
		} else {
			setStatusTest("FAIL", "Register as active on the chat bot is NOT displayed");
		}
		if (homePage.isBtnIminDisplayed() == true) {
			setStatusTest("PASS", "Imin button is displayed");
		} else {
			setStatusTest("FAIL", "Imin button is NOT displayed");
		}
	}
	@Test(priority = 7)
	public void TT_7240() throws InterruptedException {
		homePage.waitForPageLoaded();
		TestLogger.info("User type #training");
		homePage.typeMessage("#training");
		if (homePage.isLblClockingInDisplayed() == true) {
			setStatusTest("PASS", "Clocking In is displayed");
		} else {
			setStatusTest("FAIL", "Clocking In is NOT displayed");
		}
		if (homePage.isTxtRegisterIminDisplayed() == true) {
			setStatusTest("PASS", "Register as active on the chat bot is displayed");
		} else {
			setStatusTest("FAIL", "Register as active on the chat bot is NOT displayed");
		}
		if (homePage.isBtnIminDisplayed() == true) {
			setStatusTest("PASS", "Imin button is displayed");
		} else {
			setStatusTest("FAIL", "Imin button is NOT displayed");
		}
	}
	@Test(priority = 8)
	public void TT_7241() throws InterruptedException {
		homePage.waitForPageLoaded();
		TestLogger.info("User type #1on1");
		homePage.typeMessage("#1on1");
		if (homePage.isLblClockingInDisplayed() == true) {
			setStatusTest("PASS", "Clocking In is displayed");
		} else {
			setStatusTest("FAIL", "Clocking In is NOT displayed");
		}
		if (homePage.isTxtRegisterIminDisplayed() == true) {
			setStatusTest("PASS", "Register as active on the chat bot is displayed");
		} else {
			setStatusTest("FAIL", "Register as active on the chat bot is NOT displayed");
		}
		if (homePage.isBtnIminDisplayed() == true) {
			setStatusTest("PASS", "Imin button is displayed");
		} else {
			setStatusTest("FAIL", "Imin button is NOT displayed");
		}
	}
	@Test(priority = 9)
	public void TT_7242() throws InterruptedException {
		homePage.waitForPageLoaded();
		TestLogger.info("User type #project");
		homePage.typeMessage("#project");
		if (homePage.isLblClockingInDisplayed() == true) {
			setStatusTest("PASS", "Clocking In is displayed");
		} else {
			setStatusTest("FAIL", "Clocking In is NOT displayed");
		}
		if (homePage.isTxtRegisterIminDisplayed() == true) {
			setStatusTest("PASS", "Register as active on the chat bot is displayed");
		} else {
			setStatusTest("FAIL", "Register as active on the chat bot is NOT displayed");
		}
		if (homePage.isBtnIminDisplayed() == true) {
			setStatusTest("PASS", "Imin button is displayed");
		} else {
			setStatusTest("FAIL", "Imin button is NOT displayed");
		}
	}
	@Test(priority =10)
	public void TT_7243() throws InterruptedException {
		homePage.waitForPageLoaded();
		TestLogger.info("User type #nesting");
		homePage.typeMessage("#nesting");
		if (homePage.isLblClockingInDisplayed() == true) {
			setStatusTest("PASS", "Clocking In is displayed");
		} else {
			setStatusTest("FAIL", "Clocking In is NOT displayed");
		}
		if (homePage.isTxtRegisterIminDisplayed() == true) {
			setStatusTest("PASS", "Register as active on the chat bot is displayed");
		} else {
			setStatusTest("FAIL", "Register as active on the chat bot is NOT displayed");
		}
		if (homePage.isBtnIminDisplayed() == true) {
			setStatusTest("PASS", "Imin button is displayed");
		} else {
			setStatusTest("FAIL", "Imin button is NOT displayed");
		}
	}
	@Test(priority = 11)
	public void TT_7244() throws InterruptedException {
		homePage.waitForPageLoaded();
		TestLogger.info("User type #yes");
		homePage.typeMessage("#yes");
		if (homePage.isLblClockingInDisplayed() == true) {
			setStatusTest("PASS", "Clocking In is displayed");
		} else {
			setStatusTest("FAIL", "Clocking In is NOT displayed");
		}
		if (homePage.isTxtRegisterIminDisplayed() == true) {
			setStatusTest("PASS", "Register as active on the chat bot is displayed");
		} else {
			setStatusTest("FAIL", "Register as active on the chat bot is NOT displayed");
		}
		if (homePage.isBtnIminDisplayed() == true) {
			setStatusTest("PASS", "Imin button is displayed");
		} else {
			setStatusTest("FAIL", "Imin button is NOT displayed");
		}
	}
	@Test(priority =12)
	public void TT_7245() throws InterruptedException {
		homePage.waitForPageLoaded();
		TestLogger.info("User type #activity");
		homePage.typeMessage("#activity");
		if (homePage.isLblClockingInDisplayed() == true) {
			setStatusTest("PASS", "Clocking In is displayed");
		} else {
			setStatusTest("FAIL", "Clocking In is NOT displayed");
		}
		if (homePage.isTxtRegisterIminDisplayed() == true) {
			setStatusTest("PASS", "Register as active on the chat bot is displayed");
		} else {
			setStatusTest("FAIL", "Register as active on the chat bot is NOT displayed");
		}
		if (homePage.isBtnIminDisplayed() == true) {
			setStatusTest("PASS", "Imin button is displayed");
		} else {
			setStatusTest("FAIL", "Imin button is NOT displayed");
		}
	}
	@Test(priority =13)
	public void TT_7246() throws InterruptedException {
		homePage.waitForPageLoaded();
		TestLogger.info("User type #assign");
		homePage.typeMessage("#assign");
		if (homePage.isLblClockingInDisplayed() == true) {
			setStatusTest("PASS", "Clocking In is displayed");
		} else {
			setStatusTest("FAIL", "Clocking In is NOT displayed");
		}
		if (homePage.isTxtRegisterIminDisplayed() == true) {
			setStatusTest("PASS", "Register as active on the chat bot is displayed");
		} else {
			setStatusTest("FAIL", "Register as active on the chat bot is NOT displayed");
		}
		if (homePage.isBtnIminDisplayed() == true) {
			setStatusTest("PASS", "Imin button is displayed");
		} else {
			setStatusTest("FAIL", "Imin button is NOT displayed");
		}
	}
	@Test(priority = 14)
	public void TT_7247() throws InterruptedException {
		homePage.waitForPageLoaded();
		TestLogger.info("User type #transfer");
		homePage.typeMessage("#transfer");
		if (homePage.isLblClockingInDisplayed() == true) {
			setStatusTest("PASS", "Clocking In is displayed");
		} else {
			setStatusTest("FAIL", "Clocking In is NOT displayed");
		}
		if (homePage.isTxtRegisterIminDisplayed() == true) {
			setStatusTest("PASS", "Register as active on the chat bot is displayed");
		} else {
			setStatusTest("FAIL", "Register as active on the chat bot is NOT displayed");
		}
		if (homePage.isBtnIminDisplayed() == true) {
			setStatusTest("PASS", "Imin button is displayed");
		} else {
			setStatusTest("FAIL", "Imin button is NOT displayed");
		}
	}
	@Test(priority = 15)
	public void TT_7248() throws InterruptedException {
		homePage.waitForPageLoaded();
		TestLogger.info("User type #view");
		homePage.typeMessage("#view");
		if (homePage.isLblClockingInDisplayed() == true) {
			setStatusTest("PASS", "Clocking In is displayed");
		} else {
			setStatusTest("FAIL", "Clocking In is NOT displayed");
		}
		if (homePage.isTxtRegisterIminDisplayed() == true) {
			setStatusTest("PASS", "Register as active on the chat bot is displayed");
		} else {
			setStatusTest("FAIL", "Register as active on the chat bot is NOT displayed");
		}
		if (homePage.isBtnIminDisplayed() == true) {
			setStatusTest("PASS", "Imin button is displayed");
		} else {
			setStatusTest("FAIL", "Imin button is NOT displayed");
		}
	}
	@Test(priority = 16)
	public void TT_807() throws InterruptedException {
		homePage.waitForPageLoaded();
		TestLogger.info("User type space before #imIN");
		homePage.typeMessage("     #imin");
		if (homePage.isLblClockingInDisplayed() == true) {
			setStatusTest("PASS", "Clocking In is displayed");
		} else {
			setStatusTest("FAIL", "Clocking In is NOT displayed");
		}
		if (homePage.isTxtRegisterIminDisplayed() == true) {
			setStatusTest("PASS", "Register as active on the chat bot is displayed");
		} else {
			setStatusTest("FAIL", "Register as active on the chat bot is NOT displayed");
		}
		if (homePage.isBtnIminDisplayed() == true) {
			setStatusTest("PASS", "Imin button is displayed");
		} else {
			setStatusTest("FAIL", "Imin button is NOT displayed");
		}
	}
	@Test(priority = 17)
	public void TT_808() throws InterruptedException {
		homePage.waitForPageLoaded();
		TestLogger.info("User type space after #imIN");
		homePage.typeMessage("#imin       ");
		if (homePage.isLblClockingInDisplayed() == true) {
			setStatusTest("PASS", "Clocking In is displayed");
		} else {
			setStatusTest("FAIL", "Clocking In is NOT displayed");
		}
		if (homePage.isTxtRegisterIminDisplayed() == true) {
			setStatusTest("PASS", "Register as active on the chat bot is displayed");
		} else {
			setStatusTest("FAIL", "Register as active on the chat bot is NOT displayed");
		}
		if (homePage.isBtnIminDisplayed() == true) {
			setStatusTest("PASS", "Imin button is displayed");
		} else {
			setStatusTest("FAIL", "Imin button is NOT displayed");
		}
	}
	@Test(priority = 18)
	public void TT_809() throws InterruptedException {
		homePage.waitForPageLoaded();
		TestLogger.info("User type html tag: <i>#imin</i>");
		homePage.typeMessage("<i>#imin</i>");
		if (homePage.isLblClockingInDisplayed() == true) {
			setStatusTest("PASS", "Clocking In is displayed");
		} else {
			setStatusTest("FAIL", "Clocking In is NOT displayed");
		}
		if (homePage.isTxtRegisterIminDisplayed() == true) {
			setStatusTest("PASS", "Register as active on the chat bot is displayed");
		} else {
			setStatusTest("FAIL", "Register as active on the chat bot is NOT displayed");
		}
		if (homePage.isBtnIminDisplayed() == true) {
			setStatusTest("PASS", "Imin button is displayed");
		} else {
			setStatusTest("FAIL", "Imin button is NOT displayed");
		}
	}
	@Test(priority = 19)
	public void TT_811() throws InterruptedException {
		homePage.waitForPageLoaded();
		TestLogger.info("User type java script: <script>alert('#imin')</script>");
		homePage.typeMessage("<script>alert('#imin')</script>");
		if (homePage.isLblClockingInDisplayed() == true) {
			setStatusTest("PASS", "Clocking In is displayed");
		} else {
			setStatusTest("FAIL", "Clocking In is NOT displayed");
		}
		if (homePage.isTxtRegisterIminDisplayed() == true) {
			setStatusTest("PASS", "Register as active on the chat bot is displayed");
		} else {
			setStatusTest("FAIL", "Register as active on the chat bot is NOT displayed");
		}
		if (homePage.isBtnIminDisplayed() == true) {
			setStatusTest("PASS", "Imin button is displayed");
		} else {
			setStatusTest("FAIL", "Imin button is NOT displayed");
		}
	}
	@Test(priority = 20)
	public void TT_805() throws InterruptedException {
		homePage.waitForPageLoaded();
		TestLogger.info("User type: #IMIN");
		homePage.typeMessage("#IMIN");
		if (homePage.isTxtHelloDisplayed() == true) {
			setStatusTest("PASS", "Hello nicknme is displayed");
		} else {
			setStatusTest("FAIL", "Hello nicknme is NOT displayed");
		}
	}
	@Test(priority = 21)
	public void TT_806() throws InterruptedException {
		homePage.waitForPageLoaded();
		TestLogger.info("User type: #imIN");
		homePage.typeMessage("#imIN");
		if (homePage.isTxtHelloDisplayed() == true) {
			setStatusTest("PASS", "Hello nicknme is displayed");
		} else {
			setStatusTest("FAIL", "Hello nicknme is NOT displayed");
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
