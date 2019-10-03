package tekbot.pages;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Ulties.PropertyManager;
import controller.WebActions;

public class HomePage_Client_Test extends WebActions {

	By btnSignin = By.xpath("//button[contains(@aria-label,'Sign In')]");
	By txtFillMessage = By.xpath("//input[@aria-label='Type your message']");
	By txtWelcometoTekBot1 = By.xpath("//p[contains(.,'Welcome to TekBot')]");
	By txtWelcometoTekBot2 = By.xpath("//p[contains(.,'Hi, We are in the process of updating the Tekbot.')]");
	By iconChatBot = By.xpath("//img[contains(@class,'ac-image')]");
	By lblSetNickName = By.xpath("//p[contains(.,'Set nickname')]");
	By txtCallNickName = By.xpath("//p[contains(.,'How would you like me to call you?')]");
	By txtNickName = By.xpath("//input[@placeholder='Enter your nickname']");
	By btnSubmit = By.xpath("//button[contains(.,'Submit')]");
	By txtNiceMeetingYou = By.xpath("//p[contains(.,'Nice meeting you Test 2 Staff.')]");
	By txtEmail = By.xpath("//input[contains(@type,'email')]");
	By btnNext = By.xpath("//input[contains(@value,'Next')]");
	By txtPassword = By.xpath("//input[@placeholder='Password']");
	By btnSigninAD = By.xpath("//input[contains(@value,'Sign in')]");
	By btnYes = By.xpath("//input[contains(@value,'Yes')]");
	By lblClockingin = By.xpath("//p[contains(.,'Clocking in')]");
	By txtGoodMorning = By.xpath("//p[contains(.,'Good morning Test 2 Staff. Let’s start your day!')]");
	By btnImin = By.xpath("(//button[contains(@type,'button')])[3]");
	By txtHello = By.xpath("//p[contains(.,'Hello Test 2 Staff!')]");
	By lblHelp = By.xpath("//p[contains(.,'Help')]");
	By txtHelp = By.xpath(
			"//p[contains(.,'Here are the list of all possible commands’ categories. You can click on each category to discover the commands:')]");
	By btnActivity = By.xpath("//button[contains(.,'Activity (#activity)')]");
	By btnCase = By.xpath("//button[contains(.,'Case (#case)')]");
	By btnGuide = By.xpath("//button[contains(.,'Guide')]");
	// =========================Activity==========================
	By txtCommand_activity = By.xpath("//p[contains(.,'#activity')]");
	By lblActivitycategory = By.xpath("//p[contains(.,'Activity category')]");
	By txtActivity = By.xpath("//p[contains(.,'Here’s what you can do in Activities:')]");
	By btnLunch = By.xpath("//button[@aria-label='Lunch (#lunch)'][contains(.,'Lunch (#lunch)')]");
	By btnBreak = By.xpath("//button[contains(.,'Break (#break)')]");
	By btnMeeting = By.xpath("//button[contains(.,'Meeting (#meeting)')]");
	By btnTraining = By.xpath("//button[contains(.,'Training (#training)')]");
	By btn1on1 = By.xpath("//button[contains(.,'1 on 1 (#1on1)')]");
	By btnProject = By.xpath("//button[contains(.,'Project (#project)')]");
	By btnNesting = By.xpath("//button[contains(.,'Nesting (#nesting)')]");
	By btnImout = By.xpath("(//button[contains(@type,'button')])[14]");
	// =============================Lunch==========================
	By txtCommand_lunch = By.xpath("//p[contains(.,'#lunch')]");
	By lblLunch = By.xpath("//div[@class='ac-textBlock'][contains(.,'Lunch')]");
	By txtLunch = By.xpath("//div[@class='ac-textBlock'][contains(.,'Nom nom nom nom.')]");
	By btnFinishLunch = By.xpath("//button[contains(.,'Finish Lunch (#lunch)')]");
	By txtFinishLunch = By.xpath("//p[contains(.,'Don’t go sleepy on me now Test 2 Staff ;)')]");
	// ==========================Finish your activity first Lunch========
	By txtCommand_break = By.xpath("//p[contains(.,'#break')]");
	By lblFinishYourActivityFirst = By.xpath("//div[@class='ac-textBlock'][contains(.,'Finish your activity first')]");
	By txtFinishYourActivityFirst = By.xpath("//p[contains(.,'Close your previous action before doing anything else.\n"
			+ "In case you cannot check the chat history it was: #lunch')]");
	By btnFinishLunch_activityfirst = By.xpath("(//button[contains(.,'Finish Lunch (#lunch)')])[2]");
	// =============================Break==========================
	By lblBreak = By.xpath("//div[@class='ac-textBlock'][contains(.,'Break')]");
	By txtBreak = By.xpath("//div[@class='ac-textBlock'][contains(.,'Enjoy! See you in a bit Test 2 Staff.')]");
	By btnFinishBreak = By.xpath("//button[contains(.,'Finish Break (#break)')]");
	By txtFinishBreak = By.xpath("//p[contains(.,'Hey did you close the door? I hate that buzzer :s')]");
	// ==========================Finish your activity first Break========
	By txtCommand_meeting = By.xpath("//p[contains(.,'#meeting')]");
	By lblFinishYourActivityFirst_break = By
			.xpath("//div[@class='ac-textBlock'][contains(.,'Finish your activity first')]");
	By txtFinishYourActivityFirst_break = By
			.xpath("//p[contains(.,'Close your previous action before doing anything else.\n"
					+ "In case you cannot check the chat history it was: #break')]");
	By btnFinishBreak_activityfirst = By.xpath("(//button[contains(.,'Finish Break (#break)')])[2]");
	// =============================Meeting==========================
	By lblMeeting = By.xpath("//p[contains(.,'Meeting')]");
	By txtMeeting = By.xpath("//p[contains(.,'Bye. I’ll await your return.')]");
	By btnFinishMeeting = By.xpath("//button[contains(.,'Finish Meeting (#meeting)')]");
	By txtFinishMeeting = By.xpath("//p[contains(.,'Hope the meeting wasn’t boring.')]");
	// ==========================Finish your activity first Meeting========
	By lblFinishYourActivityFirst_meeting = By
			.xpath("//div[@class='ac-textBlock'][contains(.,'Finish your activity first')]");
	By txtFinishYourActivityFirst_meeting = By
			.xpath("//p[contains(.,'Close your previous action before doing anything else.\n"
					+ "In case you cannot check the chat history it was: #meeting')]");
	By btnFinishMeeting_activityfirst = By.xpath("(//button[contains(.,'Finish Meeting (#meeting)')])[2]");
	// =============================1 on 1==========================
	By txtCommand_1on1 = By.xpath("//p[contains(.,'#1on1')]");
	By lbl1on1 = By.xpath("//p[contains(.,'1 on 1')]");
	By txt1on1 = By.xpath("//p[contains(.,'May the Force be with you.')]");
	By btnFinish1on1 = By.xpath("//button[contains(.,'Finish 1 on 1 (#1on1)')]");
	By txtFinish1on1 = By.xpath("//p[contains(.,'Pretty sure it went well.')]");
	// ==========================Finish your activity first 1 on1 ========
	By lblFinishYourActivityFirst_1on1 = By.xpath("//p[contains(.,'Finish your activity first')]");
	By txtFinishYourActivityFirst_1on1 = By
			.xpath("//p[contains(.,'Close your previous action before doing anything else.\n"
					+ "In case you cannot check the chat history it was: #1on1')]");
	By btnFinishLunch_activityfirst_1on1 = By.xpath("//button[contains(.,'Finish 1on1 (#1on1)')]");
	// =============================Project==========================
	By txtCommand_project = By.xpath("//p[contains(.,'#project')]");
	By lblProject = By.xpath("//p[contains(.,'Project')]");
	By txtProject = By.xpath("//p[contains(.,'Duty calls Test 2 Staff.')]");
	By btnFinishProject = By.xpath("//button[contains(.,'Finish Project (#project)')]");
	By txtFinishProject = By.xpath("//p[contains(.,'Welcome back Test 2 Staff.')]");
	// ==========================Finish your activity first Project ========
	By lblFinishYourActivityFirst_project = By.xpath("//p[contains(.,'Finish your activity first')]");
	By txtFinishYourActivityFirst_project = By
			.xpath("//p[contains(.,'Close your previous action before doing anything else.\n"
					+ "In case you cannot check the chat history it was: #project')]");
	By btnFinishLunch_activityfirst_project = By.xpath("//button[contains(.,'Finish Project (#project)')]");
	// =============================Nesting==========================
	By txtCommand_Nesting = By.xpath("//p[contains(.,'#nesting')]");
	By lblNesting = By.xpath("//p[contains(.,'Nesting')]");
	By txtNesting = By.xpath("//p[contains(.,'Duty calls Test 2 Staff.')]");
	By btnFinishNesting = By.xpath("//button[contains(.,'Finish Nesting (#nesting)')]");
	By txtFinishNesting = By.xpath("//p[contains(.,'Welcome back Test 2 Staff.')]");
	// ==========================Finish your activity first Nesting ========
	By lblFinishYourActivityFirst_Nesting = By.xpath("//p[contains(.,'Finish your activity first')]");
	By txtFinishYourActivityFirst_Nesting = By
			.xpath("//p[contains(.,'Close your previous action before doing anything else.\n"
					+ "In case you cannot check the chat history it was: #nesting')]");
	By btnFinishLunch_activityfirst_Nesting = By.xpath("//button[contains(.,'Finish Nesting (#nesting)')]");
	// =============================Training==========================
	By txtCommand_Training = By.xpath("//p[contains(.,'#training')]");
	By lblTraining = By.xpath("//p[contains(.,'Training')]");
	By txtTraining = By.xpath("//p[contains(.,'Go learn young Padawan.')]");
	By btnFinishTraining = By.xpath("//button[contains(.,'Finish Training (#training)')]");
	By txtFinishTraining = By.xpath("//p[contains(.,'The future Jedi is back. Mace Test 2 Staff has a ring to it.')]");
	// ==========================Finish your activity first Nesting ========
	By lblFinishYourActivityFirst_Training = By.xpath("//p[contains(.,'Finish your activity first')]");
	By txtFinishYourActivityFirst_Training = By
			.xpath("//p[contains(.,'Close your previous action before doing anything else.\n"
					+ "In case you cannot check the chat history it was: #training')]");
	By btnFinishYourActivityfirst_Training = By.xpath("//button[contains(.,'Finish Training (#training)')]");
	// =========================First time login to chat bot================
	By txtFirstLoginContent = By.xpath(
			"//p[contains(.,'Rise and shine Test 2 Staff. Your shift’s has been clocked. Click ‘Activities’ or ‘Cases’ to explore what you can do with me. Click ‘Guide’ to open Tekbot guide.')]");
	//====================Im out =====================
	By lblClockingOut=By.xpath("//p[contains(.,'Clocking out')]");
	By txtClockingOutContent=By.xpath("//p[contains(.,'Are you sure you want to clock out now? You can only have 1 shift record per day so better double check!')]");
	By btnYesImout=By.xpath("(//button[contains(@type,'button')])[4]");
	By btnBackToActivityCategory=By.xpath("//button[contains(.,'Get me back to Activity Category (#activity)')]");
	By txtYesImout=By.xpath("//p[contains(.,'Time to get some deserved rest! See you tomorrow Test 2 Staff')]");
	
	public HomePage_Client_Test(WebDriver driver) {
		super(driver);
		moLinkWeb(PropertyManager.URL_CHATBOT);
		phongToCuaSoTrinhDuyet();
	}

	public void clickButtonActivity() {
		try {
			waitForElementPresent(15, btnActivity);

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		clickByJavaScript(btnActivity);
	}

	public void clickButtonCase() {
		try {
			waitForElementPresent(20, btnCase);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		clickByJavaScript(btnCase);
	}

	public void clickButtonGuide() {
		try {
			waitForElementPresent(20, btnGuide);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		clickByJavaScript(btnGuide);
	}

	public void clickButtonSignin() {
		try {
			waitForPageLoaded();
			waitForElementPresent(20, btnSignin);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		clickByJavaScript(btnSignin);
	}

	public void clickButtonImin() {
		try {
			waitForElementPresent(8, btnImin);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		clickByJavaScript(btnImin);
	}

	public void SignInWith(String code) {

		clickButtonSignin();
		waitForPageLoaded();
		// driver.switchTo().window(nameOrHandle)

	}

	public void typeMessage(String contentMessage) {
		try {
			waitForElementPresent(20, txtFillMessage);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		goTextOn(txtFillMessage, contentMessage);
	}

	public boolean istxtWelcometoTekBotDisplayed() {
		try {
			waitForElementPresent(20, txtWelcometoTekBot1);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		boolean flag = false;
		try {
			if (driver.findElements(txtWelcometoTekBot1).size() > 0) {
				flag = true;
			}
		} catch (Exception e) {
			return flag;
		}
		return flag;
	}

	public boolean istxtHiTekBotDisplayed() {
		try {
			waitForElementPresent(5, txtWelcometoTekBot2);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		boolean flag = false;
		try {
			if (driver.findElements(txtWelcometoTekBot2).size() > 0) {
				flag = true;
			}
		} catch (Exception e) {
			return flag;
		}
		return flag;
	}

	public boolean isIconChatBotDisplayed() {
		boolean flag = false;
		try {
			if (driver.findElements(iconChatBot).size() > 0) {
				flag = true;
			}
		} catch (Exception e) {
			return flag;
		}
		return flag;
	}

	public void clickButtonSubmit() {
		try {
			waitForElementPresent(15, btnSubmit);

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		clickByJavaScript(btnSubmit);
	}

	public boolean isNiceMeetingYouDisplayed() {
		boolean flag = false;
		try {
			if (driver.findElements(txtNiceMeetingYou).size() > 0) {
				flag = true;
			}
		} catch (Exception e) {
			return flag;
		}
		return flag;
	}

	public boolean isSetNickNameDisplayed() {
		boolean flag = false;
		try {
			waitForElementPresent(15, lblSetNickName);
			if (driver.findElements(lblSetNickName).size() > 0) {
				flag = true;
			}
		} catch (Exception e) {
			return flag;
		}
		return flag;
	}

	public boolean isCallNickNameDisplayed() {
		try {
			waitForElementPresent(20, txtCallNickName);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		boolean flag = false;
		try {
			if (driver.findElements(txtCallNickName).size() > 0) {
				flag = true;
			}
		} catch (Exception e) {
			return flag;
		}
		return flag;
	}

	public boolean isTxtNickNameDisplayed() {
		boolean flag = false;
		try {
			if (driver.findElements(txtNickName).size() > 0) {
				flag = true;
			}
		} catch (Exception e) {
			return flag;
		}
		return flag;
	}

	public boolean isBtnSubmitDisplayed() {
		boolean flag = false;
		try {
			if (driver.findElements(btnSubmit).size() > 0) {
				flag = true;
			}
		} catch (Exception e) {
			return flag;
		}
		return flag;
	}

	public String openNewTabAndGetCode(WebDriver driver) {
		WebElement code = null;
		String valueCode = "";
		String parentWindow = driver.getWindowHandle();
		Set<String> handles = driver.getWindowHandles();
		By txtCode = By.xpath("//div[contains(@style,'margin-top: 10px; font-size: larger; font-weight: bold;')]");
		for (String windowHandle : handles) {
			if (!windowHandle.equals(parentWindow)) {
				driver.switchTo().window(windowHandle);
				try {
					waitForElementPresent(10, txtEmail);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				typeEmail(PropertyManager.BOTADMIN);
				// clickButtonNext();
				try {
					waitForElementPresent(10, txtPassword);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				typePassword(PropertyManager.BOTPASSWORD_ADMIN);
				try {
					waitForElementPresent(10, btnYes);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				// clickButtonSigninAD();
				clickButtonYes();
				try {
					waitForElementPresent(15, txtCode);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				code = driver.findElement(txtCode);
				valueCode = code.getText();
				driver.close();
				driver.switchTo().window(parentWindow);

			}
		}

		return valueCode;

	}

	public void clicktxtEmail() {
		try {
			waitForElementPresent(5, txtEmail);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(txtEmail).click();
	}

	public void typeEmail(String Email) {
		goTextOn(txtEmail, Email);
	}

	public void clickButtonNext() {
		try {
			waitForElementPresent(5, btnNext);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(btnNext).click();
	}

	public void typePassword(String Password) {
		goTextOn(txtPassword, Password);
	}

	public void clickButtonSigninAD() {
		try {
			waitForElementPresent(5, btnSigninAD);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(btnSigninAD).click();
	}

	public void clickButtonYes() {
		try {
			waitForElementPresent(25, btnYes);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		clickByJavaScript(btnYes);
	}

	public boolean isLblClockingInDisplayed() {
		boolean flag = false;
		try {
			if (driver.findElements(lblClockingin).size() > 0) {
				flag = true;
			}
		} catch (Exception e) {
			return flag;
		}
		return flag;
	}

	public boolean isTxtGoodMorningDisplayed() {
		boolean flag = false;
		try {
			if (driver.findElements(txtGoodMorning).size() > 0) {
				flag = true;
			}
		} catch (Exception e) {
			return flag;
		}
		return flag;
	}

	public boolean isBtnIminDisplayed() {
		boolean flag = false;
		try {
			if (driver.findElements(btnImin).size() > 0) {
				flag = true;
			}
		} catch (Exception e) {
			return flag;
		}
		return flag;
	}

	public boolean isTxtHelloDisplayed() {
		boolean flag = false;
		try {
			if (driver.findElements(txtHello).size() > 0) {
				flag = true;
			}
		} catch (Exception e) {
			return flag;
		}
		return flag;
	}

	public boolean isLblHelpDisplayed() {
		boolean flag = false;
		try {
			if (driver.findElements(lblHelp).size() > 0) {
				flag = true;
			}
		} catch (Exception e) {
			return flag;
		}
		return flag;
	}

	public boolean isTxtHelpDisplayed() {
		boolean flag = false;
		try {
			if (driver.findElements(txtHelp).size() > 0) {
				flag = true;
			}
		} catch (Exception e) {
			return flag;
		}
		return flag;
	}

	public boolean isBtnActivityDisplayed() {
		boolean flag = false;
		try {
			if (driver.findElements(btnActivity).size() > 0) {
				flag = true;
			}
		} catch (Exception e) {
			return flag;
		}
		return flag;
	}

	public boolean isBtnCaseDisplayed() {
		boolean flag = false;
		try {
			if (driver.findElements(btnCase).size() > 0) {
				flag = true;
			}
		} catch (Exception e) {
			return flag;
		}
		return flag;
	}

	public boolean isBtnGuideDisplayed() {
		boolean flag = false;
		try {
			if (driver.findElements(btnGuide).size() > 0) {
				flag = true;
			}
		} catch (Exception e) {
			return flag;
		}
		return flag;
	}

	public boolean isTxtCommandActivityDisplayed() {
		boolean flag = false;
		try {
			if (driver.findElements(txtCommand_activity).size() > 0) {
				flag = true;
			}
		} catch (Exception e) {
			return flag;
		}
		return flag;
	}

	public boolean isLblActivityDisplayed() {
		boolean flag = false;
		try {
			if (driver.findElements(lblActivitycategory).size() > 0) {
				flag = true;
			}
		} catch (Exception e) {
			return flag;
		}
		return flag;
	}

	public boolean isTxtActivityDisplayed() {
		boolean flag = false;
		try {
			if (driver.findElements(txtActivity).size() > 0) {
				flag = true;
			}
		} catch (Exception e) {
			return flag;
		}
		return flag;
	}

	public boolean isBtnLunchDisplayed() {
		boolean flag = false;
		try {
			if (driver.findElements(btnLunch).size() > 0) {
				flag = true;
			}
		} catch (Exception e) {
			return flag;
		}
		return flag;
	}

	public boolean isBtnBreakDisplayed() {
		boolean flag = false;
		try {
			if (driver.findElements(btnBreak).size() > 0) {
				flag = true;
			}
		} catch (Exception e) {
			return flag;
		}
		return flag;
	}

	public boolean isBtnMeetingDisplayed() {
		boolean flag = false;
		try {
			if (driver.findElements(btnMeeting).size() > 0) {
				flag = true;
			}
		} catch (Exception e) {
			return flag;
		}
		return flag;
	}

	public boolean isBtnTrainingDisplayed() {
		boolean flag = false;
		try {
			if (driver.findElements(btnTraining).size() > 0) {
				flag = true;
			}
		} catch (Exception e) {
			return flag;
		}
		return flag;
	}

	public boolean isBtn1on1Displayed() {
		boolean flag = false;
		try {
			if (driver.findElements(btn1on1).size() > 0) {
				flag = true;
			}
		} catch (Exception e) {
			return flag;
		}
		return flag;
	}

	public boolean isBtnProjectDisplayed() {
		boolean flag = false;
		try {
			if (driver.findElements(btnProject).size() > 0) {
				flag = true;
			}
		} catch (Exception e) {
			return flag;
		}
		return flag;
	}

	public boolean isBtnNestingDisplayed() {
		boolean flag = false;
		try {
			if (driver.findElements(btnNesting).size() > 0) {
				flag = true;
			}
		} catch (Exception e) {
			return flag;
		}
		return flag;
	}

	public boolean isBtnImoutDisplayed() {
		boolean flag = false;
		try {
			waitForElementPresent(10, btnImout);
			if (driver.findElements(btnImout).size() > 0) {
				flag = true;
			}
		} catch (Exception e) {
			return flag;
		}
		return flag;
	}

	public void clickButtonLunch() {
		try {
			waitForElementPresent(15, btnLunch);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		clickByJavaScript(btnLunch);
	}

	public void clickButtonBreak() {
		try {
			waitForElementPresent(5, btnBreak);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		clickByJavaScript(btnBreak);
	}

	public void clickButtonMeeting() {
		try {
			waitForElementPresent(10, btnMeeting);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		clickByJavaScript(btnMeeting);
	}

	public void clickButtonTraining() {
		try {
			waitForElementPresent(5, btnTraining);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		clickByJavaScript(btnTraining);
	}

	public void clickButton1on1() {
		try {
			waitForElementPresent(5, btn1on1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		clickByJavaScript(btn1on1);
	}

	public void clickButtonProject() {
		try {
			waitForElementPresent(5, btnProject);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		clickByJavaScript(btnProject);
	}

	public void clickButtonNesting() {
		try {
			waitForElementPresent(5, btnNesting);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		clickByJavaScript(btnNesting);
	}

	public void clickButtonImout() {
		try {
			waitForElementPresent(5, btnImout);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		clickByJavaScript(btnImout);
	}

	// =================Lunch================
	public boolean isTxtCommandLunchDisplayed() {
		boolean flag = false;
		try {
			if (driver.findElements(txtCommand_lunch).size() > 0) {
				flag = true;
			}
		} catch (Exception e) {
			return flag;
		}
		return flag;
	}

	public boolean isLblLunchDisplayed() {
		boolean flag = false;
		try {
			if (driver.findElements(lblLunch).size() > 0) {
				flag = true;
			}
		} catch (Exception e) {
			return flag;
		}
		return flag;
	}

	public boolean isTxtLunchDisplayed() {
		boolean flag = false;
		try {
			if (driver.findElements(txtLunch).size() > 0) {
				flag = true;
			}
		} catch (Exception e) {
			return flag;
		}
		return flag;
	}

	public boolean isBtnFinishLunchDisplayed() {
		boolean flag = false;
		try {
			if (driver.findElements(btnFinishLunch).size() > 0) {
				flag = true;
			}
		} catch (Exception e) {
			return flag;
		}
		return flag;
	}

	public void clickButtonFinishLunch() {
		try {
			waitForElementPresent(5, btnFinishLunch);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(btnFinishLunch).click();
	}

	public boolean isTxtFinishLunchDisplayed() {
		boolean flag = false;
		try {
			if (driver.findElements(txtFinishLunch).size() > 0) {
				flag = true;
			}
		} catch (Exception e) {
			return flag;
		}
		return flag;
	}

	// =================Lunch: Finish your activity first================
	public boolean isTxtCommandBreakDisplayed() {
		boolean flag = false;
		try {
			if (driver.findElements(txtCommand_break).size() > 0) {
				flag = true;
			}
		} catch (Exception e) {
			return flag;
		}
		return flag;
	}

	public boolean isLblFinishYourActivityFirstDisplayed() {
		boolean flag = false;
		try {
			if (driver.findElements(lblFinishYourActivityFirst).size() > 0) {
				flag = true;
			}
		} catch (Exception e) {
			return flag;
		}
		return flag;
	}

	public boolean isTxtFinishYourActivityFirstDisplayed() {
		boolean flag = false;
		try {
			if (driver.findElements(txtFinishYourActivityFirst).size() > 0) {
				flag = true;
			}
		} catch (Exception e) {
			return flag;
		}
		return flag;
	}

	public boolean isBtnFinishLunchActivityFirstDisplayed() {
		boolean flag = false;
		try {
			if (driver.findElements(btnFinishLunch_activityfirst).size() > 0) {
				flag = true;
			}
		} catch (Exception e) {
			return flag;
		}
		return flag;
	}

	public void clickButtonFinishLunchActivityFirst() {
		try {
			waitForElementPresent(20, btnFinishLunch_activityfirst);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(btnFinishLunch_activityfirst).click();
	}

	public void scrolltoActivityCategory() {
		scrollToElement(driver.findElement(btnBreak));
		try {
			waitForElementPresent(10, btnBreak);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void scrolltoBtnLunch() {
		clickTxtCommand_Break();
		scrollToElement(driver.findElement(btnLunch));
		try {
			waitForElementPresent(10, btnLunch);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// =================Break================
	public boolean isLblBreakDisplayed() {
		boolean flag = false;
		try {
			if (driver.findElements(lblBreak).size() > 0) {
				flag = true;
			}
		} catch (Exception e) {
			return flag;
		}
		return flag;
	}

	public boolean isTxtBreakDisplayed() {
		boolean flag = false;
		try {
			if (driver.findElements(txtBreak).size() > 0) {
				flag = true;
			}
		} catch (Exception e) {
			return flag;
		}
		return flag;
	}

	public boolean isBtnFinishBreakDisplayed() {
		boolean flag = false;
		try {
			if (driver.findElements(btnFinishBreak).size() > 0) {
				flag = true;
			}
		} catch (Exception e) {
			return flag;
		}
		return flag;
	}

	public void clickButtonFinishBreak() {
		try {
			waitForElementPresent(5, btnFinishBreak);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(btnFinishBreak).click();
	}

	public boolean isTxtFinishBreakDisplayed() {
		boolean flag = false;
		try {
			if (driver.findElements(txtFinishBreak).size() > 0) {
				flag = true;
			}
		} catch (Exception e) {
			return flag;
		}
		return flag;
	}

	// =================Break: Finish your activity first================
	public boolean isTxtCommandMeetingDisplayed() {
		boolean flag = false;
		try {
			if (driver.findElements(txtCommand_meeting).size() > 0) {
				flag = true;
			}
		} catch (Exception e) {
			return flag;
		}
		return flag;
	}

	public boolean isLblFinishYourActivityFirst_BreakDisplayed() {
		boolean flag = false;
		try {
			if (driver.findElements(lblFinishYourActivityFirst_break).size() > 0) {
				flag = true;
			}
		} catch (Exception e) {
			return flag;
		}
		return flag;
	}

	public boolean isTxtFinishYourActivityFirst_BreakDisplayed() {
		boolean flag = false;
		try {
			if (driver.findElements(txtFinishYourActivityFirst_break).size() > 0) {
				flag = true;
			}
		} catch (Exception e) {
			return flag;
		}
		return flag;
	}

	public boolean isBtnFinishBreakActivityFirstDisplayed() {
		boolean flag = false;
		try {
			if (driver.findElements(btnFinishBreak_activityfirst).size() > 0) {
				flag = true;
			}
		} catch (Exception e) {
			return flag;
		}
		return flag;
	}

	public void clickButtonFinishBreakActivityFirst() {
		try {
			waitForElementPresent(10, btnFinishBreak_activityfirst);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		clickByJavaScript(btnFinishBreak_activityfirst);
	}

	// =================Meeting================
	public boolean isLblMeetingDisplayed() {
		boolean flag = false;
		try {
			if (driver.findElements(lblMeeting).size() > 0) {
				flag = true;
			}
		} catch (Exception e) {
			return flag;
		}
		return flag;
	}

	public boolean isTxtMeetingDisplayed() {
		boolean flag = false;
		try {
			waitForElementPresent(10, txtMeeting);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			if (driver.findElements(txtMeeting).size() > 0) {
				flag = true;
			}
		} catch (Exception e) {
			return flag;
		}
		return flag;
	}

	public boolean isBtnFinishMeetingDisplayed() {
		boolean flag = false;
		try {
			if (driver.findElements(btnFinishMeeting).size() > 0) {
				flag = true;
			}
		} catch (Exception e) {
			return flag;
		}
		return flag;
	}

	public void clickButtonFinishMeeting() {
		try {
			waitForElementPresent(5, btnFinishMeeting);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		clickByJavaScript(btnFinishMeeting);
	}

	public boolean isTxtFinishMeetingDisplayed() {
		boolean flag = false;
		try {
			if (driver.findElements(txtFinishMeeting).size() > 0) {
				flag = true;
			}
		} catch (Exception e) {
			return flag;
		}
		return flag;
	}

	// =================Break: Finish your activity first================
	public boolean isLblFinishYourActivityFirst_MeetingDisplayed() {
		boolean flag = false;
		try {
			if (driver.findElements(lblFinishYourActivityFirst_meeting).size() > 0) {
				flag = true;
			}
		} catch (Exception e) {
			return flag;
		}
		return flag;
	}

	public boolean isTxtFinishYourActivityFirst_MeetingDisplayed() {
		boolean flag = false;
		try {
			if (driver.findElements(txtFinishYourActivityFirst_meeting).size() > 0) {
				flag = true;
			}
		} catch (Exception e) {
			return flag;
		}
		return flag;
	}

	public boolean isBtnFinishMeetingActivityFirstDisplayed() {
		boolean flag = false;
		try {
			if (driver.findElements(btnFinishMeeting_activityfirst).size() > 0) {
				flag = true;
			}
		} catch (Exception e) {
			return flag;
		}
		return flag;
	}

	public void clickButtonFinishMeetingActivityFirst() {
		try {
			waitForElementPresent(5, btnFinishMeeting_activityfirst);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		clickByJavaScript(btnFinishMeeting_activityfirst);
	}

	public void clickTxtCommand_Break() {
		try {
			waitForElementPresent(5, txtCommand_break);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		clickByJavaScript(btnFinishMeeting_activityfirst);
	}

	// =================1 ON 1================
	public boolean isLbl1on1Displayed() {
		boolean flag = false;
		try {
			if (driver.findElements(lbl1on1).size() > 0) {
				flag = true;
			}
		} catch (Exception e) {
			return flag;
		}
		return flag;
	}

	public boolean isTxt1on1Displayed() {
		boolean flag = false;
		try {
			waitForElementPresent(10, txt1on1);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			if (driver.findElements(txt1on1).size() > 0) {
				flag = true;
			}
		} catch (Exception e) {
			return flag;
		}
		return flag;
	}

	public boolean isBtnFinish1on1Displayed() {
		boolean flag = false;
		try {
			if (driver.findElements(btnFinish1on1).size() > 0) {
				flag = true;
			}
		} catch (Exception e) {
			return flag;
		}
		return flag;
	}

	public void clickButtonFinish1on1() {
		try {
			waitForElementPresent(5, btnFinish1on1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		clickByJavaScript(btnFinish1on1);
	}

	public boolean isTxtFinish1on1Displayed() {
		boolean flag = false;
		try {
			if (driver.findElements(txtFinish1on1).size() > 0) {
				flag = true;
			}
		} catch (Exception e) {
			return flag;
		}
		return flag;
	}

	// =================1 ON 1: Finish your activity first================
	public boolean isLblFinishYourActivityFirst_1on1Displayed() {
		boolean flag = false;
		try {
			if (driver.findElements(lblFinishYourActivityFirst_1on1).size() > 0) {
				flag = true;
			}
		} catch (Exception e) {
			return flag;
		}
		return flag;
	}

	public boolean isTxtFinishYourActivityFirst_1on1Displayed() {
		boolean flag = false;
		try {
			if (driver.findElements(txtFinishYourActivityFirst_1on1).size() > 0) {
				flag = true;
			}
		} catch (Exception e) {
			return flag;
		}
		return flag;
	}

	public boolean isBtnFinish1on1ActivityFirstDisplayed() {
		boolean flag = false;
		try {
			if (driver.findElements(btnFinishLunch_activityfirst_1on1).size() > 0) {
				flag = true;
			}
		} catch (Exception e) {
			return flag;
		}
		return flag;
	}

	public void clickButtonFinish1on1ActivityFirst() {
		try {
			waitForElementPresent(5, btnFinishLunch_activityfirst_1on1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		clickByJavaScript(btnFinishLunch_activityfirst_1on1);
	}

	// =================Project================
	public boolean isLblProjectDisplayed() {
		boolean flag = false;
		try {
			if (driver.findElements(lblProject).size() > 0) {
				flag = true;
			}
		} catch (Exception e) {
			return flag;
		}
		return flag;
	}

	public boolean isTxtProjectDisplayed() {
		boolean flag = false;
		try {
			waitForElementPresent(10, txtProject);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			if (driver.findElements(txtProject).size() > 0) {
				flag = true;
			}
		} catch (Exception e) {
			return flag;
		}
		return flag;
	}

	public boolean isBtnFinishProjectDisplayed() {
		boolean flag = false;
		try {
			if (driver.findElements(btnFinishProject).size() > 0) {
				flag = true;
			}
		} catch (Exception e) {
			return flag;
		}
		return flag;
	}

	public void clickButtonFinishProject() {
		try {
			waitForElementPresent(5, btnFinishProject);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		clickByJavaScript(btnFinishProject);
	}

	public boolean isTxtFinishProjectDisplayed() {
		boolean flag = false;
		try {
			if (driver.findElements(txtFinishProject).size() > 0) {
				flag = true;
			}
		} catch (Exception e) {
			return flag;
		}
		return flag;
	}

	// =================Project: Finish your activity first================
	public boolean isLblFinishYourActivityFirst_ProjectDisplayed() {
		boolean flag = false;
		try {
			if (driver.findElements(lblFinishYourActivityFirst).size() > 0) {
				flag = true;
			}
		} catch (Exception e) {
			return flag;
		}
		return flag;
	}

	public boolean isTxtFinishYourActivityFirst_ProjectDisplayed() {
		boolean flag = false;
		try {
			if (driver.findElements(txtFinishYourActivityFirst_project).size() > 0) {
				flag = true;
			}
		} catch (Exception e) {
			return flag;
		}
		return flag;
	}

	public boolean isBtnFinishProjectActivityFirstDisplayed() {
		boolean flag = false;
		try {
			if (driver.findElements(btnFinishLunch_activityfirst_project).size() > 0) {
				flag = true;
			}
		} catch (Exception e) {
			return flag;
		}
		return flag;
	}

	public void clickButtonFinishProjectActivityFirst() {
		try {
			waitForElementPresent(5, btnFinishLunch_activityfirst_project);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		clickByJavaScript(btnFinishLunch_activityfirst_project);
	}

	// =================Nesting================
	public boolean isLblNestingDisplayed() {
		boolean flag = false;
		try {
			if (driver.findElements(lblNesting).size() > 0) {
				flag = true;
			}
		} catch (Exception e) {
			return flag;
		}
		return flag;
	}

	public boolean isTxtNestingDisplayed() {
		boolean flag = false;
		try {
			waitForElementPresent(10, txtNesting);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			if (driver.findElements(txtNesting).size() > 0) {
				flag = true;
			}
		} catch (Exception e) {
			return flag;
		}
		return flag;
	}

	public boolean isBtnFinishNestingDisplayed() {
		boolean flag = false;
		try {
			if (driver.findElements(btnFinishNesting).size() > 0) {
				flag = true;
			}
		} catch (Exception e) {
			return flag;
		}
		return flag;
	}

	public void clickButtonFinishNesting() {
		try {
			waitForElementPresent(5, btnFinishNesting);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		clickByJavaScript(btnFinishNesting);
	}

	public boolean isTxtFinishNestingDisplayed() {
		boolean flag = false;
		try {
			if (driver.findElements(txtFinishNesting).size() > 0) {
				flag = true;
			}
		} catch (Exception e) {
			return flag;
		}
		return flag;
	}

	// =================Project: Finish your activity first================
	public boolean isLblFinishYourActivityFirst_NestingDisplayed() {
		boolean flag = false;
		try {
			if (driver.findElements(lblFinishYourActivityFirst).size() > 0) {
				flag = true;
			}
		} catch (Exception e) {
			return flag;
		}
		return flag;
	}

	public boolean isTxtFinishYourActivityFirst_NestingDisplayed() {
		boolean flag = false;
		try {
			if (driver.findElements(txtFinishYourActivityFirst_Nesting).size() > 0) {
				flag = true;
			}
		} catch (Exception e) {
			return flag;
		}
		return flag;
	}

	public boolean isBtnFinishNestingActivityFirstDisplayed() {
		boolean flag = false;
		try {
			if (driver.findElements(btnFinishLunch_activityfirst_Nesting).size() > 0) {
				flag = true;
			}
		} catch (Exception e) {
			return flag;
		}
		return flag;
	}

	public void clickButtonFinishNestingActivityFirst() {
		try {
			waitForElementPresent(5, btnFinishLunch_activityfirst_Nesting);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		clickByJavaScript(btnFinishLunch_activityfirst_Nesting);
	}

	// =================Training================
	public boolean isLblTrainingDisplayed() {
		boolean flag = false;
		try {
			if (driver.findElements(lblTraining).size() > 0) {
				flag = true;
			}
		} catch (Exception e) {
			return flag;
		}
		return flag;
	}

	public boolean isTxtTrainingDisplayed() {
		boolean flag = false;
		try {
			waitForElementPresent(10, txtTraining);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			if (driver.findElements(txtTraining).size() > 0) {
				flag = true;
			}
		} catch (Exception e) {
			return flag;
		}
		return flag;
	}

	public boolean isBtnFinishTrainingDisplayed() {
		boolean flag = false;
		try {
			if (driver.findElements(btnFinishTraining).size() > 0) {
				flag = true;
			}
		} catch (Exception e) {
			return flag;
		}
		return flag;
	}

	public void clickButtonFinishTraining() {
		try {
			waitForElementPresent(5, btnFinishTraining);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		clickByJavaScript(btnFinishTraining);
	}

	public boolean isTxtFinishTrainingDisplayed() {
		boolean flag = false;
		try {
			if (driver.findElements(txtFinishTraining).size() > 0) {
				flag = true;
			}
		} catch (Exception e) {
			return flag;
		}
		return flag;
	}

	// =================Project: Finish your activity first================
	public boolean isLblFinishYourActivityFirst_TrainingDisplayed() {
		boolean flag = false;
		try {
			if (driver.findElements(lblFinishYourActivityFirst).size() > 0) {
				flag = true;
			}
		} catch (Exception e) {
			return flag;
		}
		return flag;
	}

	public boolean isTxtFinishYourActivityFirst_TrainingDisplayed() {
		boolean flag = false;
		try {
			if (driver.findElements(txtFinishYourActivityFirst_Training).size() > 0) {
				flag = true;
			}
		} catch (Exception e) {
			return flag;
		}
		return flag;
	}

	public boolean isBtnFinishTrainingActivityFirstDisplayed() {
		boolean flag = false;
		try {
			if (driver.findElements(btnFinishYourActivityfirst_Training).size() > 0) {
				flag = true;
			}
		} catch (Exception e) {
			return flag;
		}
		return flag;
	}

	public void clickButtonFinishTrainingActivityFirst() {
		try {
			waitForElementPresent(5, btnFinishYourActivityfirst_Training);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		clickByJavaScript(btnFinishYourActivityfirst_Training);
	}

	public boolean isTxtFirstLoginContentDisplayed() {
		boolean flag = false;
		try {
			if (driver.findElements(txtFirstLoginContent).size() > 0) {
				flag = true;
			}
		} catch (Exception e) {
			return flag;
		}
		return flag;
	}
	public boolean isLblClockingOutDisplayed() {
		boolean flag = false;
		try {
			if (driver.findElements(lblClockingOut).size() > 0) {
				flag = true;
			}
		} catch (Exception e) {
			return flag;
		}
		return flag;
	}
	public boolean isTxtClockingOutContentDisplayed() {
		boolean flag = false;
		try {
			if (driver.findElements(txtClockingOutContent).size() > 0) {
				flag = true;
			}
		} catch (Exception e) {
			return flag;
		}
		return flag;
	}
	public boolean isBtnYesImoutDisplayed() {
		boolean flag = false;
		try {
			if (driver.findElements(btnYesImout).size() > 0) {
				flag = true;
			}
		} catch (Exception e) {
			return flag;
		}
		return flag;
	}
	public boolean isBtnBackToActivityCategoryDisplayed() {
		boolean flag = false;
		try {
			if (driver.findElements(btnBackToActivityCategory).size() > 0) {
				flag = true;
			}
		} catch (Exception e) {
			return flag;
		}
		return flag;
	}
	public boolean isTxtYesImoutDisplayed() {
		boolean flag = false;
		try {
			if (driver.findElements(txtYesImout).size() > 0) {
				flag = true;
			}
		} catch (Exception e) {
			return flag;
		}
		return flag;
	}
	public void clickBtnYesImout() {
		try {
			waitForElementPresent(5, btnYesImout);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		clickByJavaScript(btnYesImout);
	}
	public void clickBtnBackToActivityCategory() {
		try {
			waitForElementPresent(5, btnBackToActivityCategory);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		clickByJavaScript(btnBackToActivityCategory);
	}
}
