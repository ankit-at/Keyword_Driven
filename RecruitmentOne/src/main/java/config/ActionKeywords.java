package config;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import static executionEngine.DriverScript.OR;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import executionEngine.DriverScript;
import utility.Log;

public class ActionKeywords {
	public ActionKeywords() {
	// TODO Auto-generated constructor stub
	}

		public static WebDriver driver;
		public static WebDriverWait wait;
		public static DesiredCapabilities capabilities = new DesiredCapabilities();
	//This block of code will decide which browser type to start
	public static void openBrowser(String object,String data){		
		Log.info("Opening Browser");
		try{
			//If value of the parameter is Mozilla, this will execute
			if(data.equals("Mozilla")){
				driver=new FirefoxDriver();
				Log.info("Mozilla browser started");
				}
			else if(data.equals("IE")){
				//You may need to change the code here to start IE Driver
				driver=new InternetExplorerDriver();
				Log.info("IE browser started");
				}
			else if(data.equals("Chrome")){
				System.setProperty("webdriver.chrome.driver", "/home/ankitt/eclipse-workapce_one/Intro/chromedriver_linux64_new/chromedriver");
				driver=new ChromeDriver();
				driver.manage().window().maximize();
				capabilities.setCapability("acceptInsecureCerts", "true");

				Log.info("Chrome browser started");
				}
			int implicitWaitTime=(10);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(implicitWaitTime));
		}catch (Exception e){
			Log.info("Not able to open the Browser --- " + e.getMessage());
			System.out.println("\"Not able to open the Browser --- \" + e.getMessage()");
			DriverScript.bResult = false;
		}
	}

	public static void navigate(String object, String data){
		try{
			Log.info("Navigating to URL");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			//Constant Variable is used in place of URL
			driver.get(data);
		}catch(Exception e){
			Log.info("Not able to navigate --- " + e.getMessage());
			DriverScript.bResult = false;
			}
		}

	public static void click(String object, String data){
		try{
			Log.info("Clicking on Webelement "+ object);
			driver.findElement(By.xpath(OR.getProperty(object))).click();	
			System.out.println("clicked");
		 }catch(Exception e){
 			Log.error("Not able to click --- " + e.getMessage());
			System.out.println(e.getMessage());

 			DriverScript.bResult = false;
         	}
		}
	//Now this method accepts two value (Object name & Data)
	public static void input(String object, String data){
		try{
			Log.info("Entering the text in " + object);
			driver.findElement(By.xpath(OR.getProperty(object))).sendKeys(data);
		 }catch(Exception e){
			 Log.error("Not able to Enter UserName --- " + e.getMessage());
			 DriverScript.bResult = false;
		 	}
		}

	public static void waitFor(String object, String data) throws Exception{
		try{
			Log.info("Wait for 5 seconds");
			Thread.sleep(5000);
		 }catch(Exception e){
			 Log.error("Not able to Wait --- " + e.getMessage());
			 DriverScript.bResult = false;
         	}
		}

	public static void closeBrowser(String object, String data){
		try{
			Log.info("Closing the browser");
			driver.quit();
		 }catch(Exception e){
			 Log.error("Not able to Close the Browser --- " + e.getMessage());
			 DriverScript.bResult = false;
         	}
		}

	}