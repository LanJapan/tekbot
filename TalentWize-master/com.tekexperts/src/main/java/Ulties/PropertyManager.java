package Ulties;

public class PropertyManager {

	// URL_TalentWize

	private static String URL_TALENTWIZE = "https://beta.talentwize.com";

	// Full Name : I am Admin
	public static String ADMIN = "admin@tek-experts.com";
	public static String PASSWORD_ADMIN = "Test@1234";

	// Full Name : User One
	private static String USER1 = "user1@tek-experts.com";
	private static String PASSWORD_USER1 = "Test@1234";

	// Full Name : User Two
	private static String USER2 = "user2@tek-experts.com";
	private static String PASSWORD_USER2 = "Test@1234";
	
	public static String NAME_USER1 = "User One";
	
	public static String NAME_USER2 = "User Two";
	
	// User is Locked 
	public static String USER_LOCKED="userlock@tek-experts.com";
	
	public  String getEmailAdmin() {
		return ADMIN;
	}

	public  String getPasswordAdmin() {
		return PASSWORD_ADMIN;

	}
	public String getURL_TalentWize() {
		return URL_TALENTWIZE;
	}

	public void loadData() {
		
            TestLogger.info("You are using data in PropertyManager");
	}

	public String getEmailUserTW() {
		return USER1;
	}

	public String getPasswordUserTW() {
		return PASSWORD_USER1;
	}

	public String getEmailUserTW2() {
		return USER2;
	}

	public String getPasswordUserTW2() {
		return PASSWORD_USER2;
	}

	public String getSearchUserName1() {
		return NAME_USER1;

	}
	
	public String getSearchUserName2() {
		return NAME_USER2;

	}
	
	public String getEmailUserLock()
	{
		return USER_LOCKED;
	}
	
	public static String START_DATE="01-Jul-2019"; 
	public static String END_DATE="31-Sep-2019";
	
	//========================
	public static String URL_CHATBOT = "https://ams-api-tekbot-dev.azurewebsites.net/bot";
	
	// Full Name : I am Admin
	public static String BOTADMIN = "test2.staff@tek-experts.com";
	public static String BOTPASSWORD_ADMIN = "T2S@2019";
	
	public  String getEmailBotAdmin() {
		return BOTADMIN;
	}

	public  String getPasswordBotAdmin() {
		return BOTPASSWORD_ADMIN;

	}
	// Full Name : I am Admin
	public static String BOTTest1 = "test1.staff@tek-experts.com";
	public static String BOTPASSWORD_Test1= "T1S@2019";
	
	public  String getEmailBotTest1() {
		return BOTTest1;
	}

	public  String getPasswordBotTest1() {
		return BOTPASSWORD_Test1;

	}
	// Dev 1
	public static String BOTDev1 = "dev1.staff@tek-experts.com";
	public static String BOTPASSWORD_Dev1= "D1S@2019";
	
	public  String getEmailBotDev1() {
		return BOTDev1;
	}

	public  String getPasswordBotDev1() {
		return BOTPASSWORD_Dev1;

	}
	// Dev 2
	public static String BOTDev2 = "dev2.staff@tek-experts.com";
	public static String BOTPASSWORD_Dev2= "D2S@2019";
	
	public  String getEmailBotDev2() {
		return BOTDev2;
	}

	public  String getPasswordBotDev2() {
		return BOTPASSWORD_Dev2;

	}
	// UAT 1
	public static String BOTUAT1 = "uat1.staff@tek-experts.com";
	public static String BOTPASSWORD_UAT1= ")A53tW4U";
	// UAT 2
	public static String BOTUAT2 = "uat2.staff@tek-experts.com";
	public static String BOTPASSWORD_UAT2= "U2S@2019";
	
	// DEV 1 Azure
	public static String BOTDEVAD1 = "dev1.azure.manager@tek-experts.com";
	public static String BOTPASSWORD_DEVAD1= "D1AM@sw2019";
	
	// DEV 2 Azure
	public static String BOTDEVAD2 = "dev2.azure.manager@tek-experts.com";
	public static String BOTPASSWORD_DEVAD2= "D2AM@sw2019";
	
	
	// Test 1 Azure
		public static String BOTTESTAD1 = "test1.azure.manager@tek-experts.com";
		public static String BOTPASSWORD_TESTAD1= "T1AM@sw2019";
		
	// Test 2 Azure
		public static String BOTTESTAD2 = "uat1.azure.manager@tek-experts.com";
		public static String BOTPASSWORD_TESTAD2= "U1AM@sw2019";
		
}
