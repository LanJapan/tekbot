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
	
	

}
