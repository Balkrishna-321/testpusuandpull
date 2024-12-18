package forTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import files.File1_Utility;

public class LaunchBrowserTest {
	
	@Test
	public void Vtiger() throws Throwable 
	{
		WebDriver driver;
		File1_Utility fil = new File1_Utility();
		//String BROWSER = fil.getKeyAndValueData("Browser");
		String BROWSER = System.getProperty("browser");
		
		if (BROWSER.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (BROWSER.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else if (BROWSER.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		} else {
			driver = new ChromeDriver();
		}
	}
	
	
	
}
