package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumDriver {
	
	private static SeleniumDriver seleniumDriver;
	
	public static WebDriver driver;
	private static WebDriverWait waitDriver;
	public static final int TIMEOUT=30;
	public static final int PAGE_LOAD_TIMEOUT=50;
	
	private SeleniumDriver(){
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kpott\\SeleniumAutomatiom\\cucumberBDDFramework\\src\\test\\resources\\Driver\\chromedriver.exe");
		
		driver=new ChromeDriver();
		waitDriver=new WebDriverWait(driver,TIMEOUT);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		
		
	}
	public static void openPage(String url){
		
		driver.get(url);
	}
	
public static WebDriver getDriver(){
	
	return driver;
}
public static void setupDriver(){
	
	if(seleniumDriver==null){
		
		seleniumDriver=new SeleniumDriver();
	}
}

public static void tearDown(){
	
	if(driver!=null){
		
		driver.close();
		driver.quit();
	}
	
	seleniumDriver=null;
}

}
