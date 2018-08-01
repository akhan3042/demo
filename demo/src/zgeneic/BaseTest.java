package zgeneic;

import java.io.IOException;
import java.net.URL;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod; 
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public abstract  class BaseTest implements AutoConst
{
	public static RemoteWebDriver d;
	
	@Parameters("browser")
	@BeforeMethod
	public void preCondition(String browser) throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		URL url = new URL("http://192.168.1.29:4444/wd/hub/");
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setBrowserName(browser);
		d = new RemoteWebDriver(url, dc);
		d.get(Excel.readData("Sheet1", 0, 1));
	}

}
