package config;

public class Constants {

	//List of System Variables
	public static final String URL = "https://ta2.qa.darwinbox.io";
	public static final String Path_TestData = "/home/ankitt/eclipse-workapce_one/RecruitmentOne/src/main/java/dataEngine/DataEngine.xlsx";
	public static final String Path_OR = "/home/ankitt/eclipse-workapce_one/RecruitmentOne/src/main/java/config/OR.txt";
	public static final String File_TestData = "DataEngine.xlsx";
	public static final String Path_Log4j2 = "/home/ankitt/eclipse-workapce_one/RecruitmentOne/log4j2.xml";


	//List of Data Sheet Column Numbers
	public static final int Col_TestCaseID = 0;	
	public static final int Col_TestScenarioID =1 ;
	public static final int Col_PageObject =3 ;
	public static final int Col_ActionKeyword =4 ;
	public static final int Col_DataSet =5 ;

	//New entry in Constant variable
	public static final int Col_RunMode =2 ;

	//List of Data Engine Excel sheets
	public static final String Sheet_TestSteps = "Test Steps";
	//New entry in Constant variable
	public static final String Sheet_TestCases = "Test Cases";

	//List of Test Data
	public static final String UserName = "testuser_3";
	public static final String Password = "Test@123";
	
	//Result Column Numbers
	public static final int Col_Result =3 ;
	public static final int Col_TestStepResult =6 ;
	
	//Result Value
	public static final String KEYWORD_FAIL = "FAIL";
	public static final String KEYWORD_PASS = "PASS";

}