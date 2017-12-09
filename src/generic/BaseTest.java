package generic;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.apache.commons.io.FileUtils;



public class BaseTest implements Iautoconstant  {

	public static WebDriver driver;
	static {
		System.setProperty(GECKO_KEY, GECKO_VALUE);
		System.setProperty(CHROME_KEY, CHROME_VALUE);
	}
	@BeforeMethod
	public void openApplication() {
		
		driver =new FirefoxDriver();
		driver =new ChromeDriver();
		
		String url= Lib.getproperties(config_path, "URL");
		System.out.println(url);
		driver.get(url);
		String ITO = Lib.getproperties(config_path, "ITO");
		int timeoutperiod = Integer.parseInt(ITO);
		
	
		
		
		driver.manage().timeouts().implicitlyWait(timeoutperiod, TimeUnit.SECONDS);
	}
	@AfterMethod
	void closeApplication() 
	{
		
		driver.close();
		
	}
    public void takescreenshot(String scrrenshotname) {
		
        Date d = new Date();
		
		String date1 = d.toString();
		System.out.println(date1);
		String date2 = date1.replaceAll(":", "_");
		System.out.println(date2);
		
		
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		
		//File srcFile = ts.getScreenshotAs(OutputType.FILE);
		
		File destFile = new File(".\\screenshot\\"+date2+scrrenshotname+"screenshot.png");

		//File destFile = new File("E:\\image.png");



		try {
			FileUtils.copyFile(screenshotAs, destFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

         System.out.println("workingfine");

	}




}


