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
import tekbot.pages.HomePage_Client;

public class Test_ChatBot_Activities extends TestManager {

	HomePage_Client homePage;
	WebDriver driver;
	PropertyManager propertyManager;

	@BeforeTest
	public void KhoiTaoCacNguonTaiNguyen() {

		propertyManager = new PropertyManager();
		propertyManager.loadData();

		driver = WebDriversManager.moTrinhDuyet("chrome");
		homePage = new HomePage_Client(driver);

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
