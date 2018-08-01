package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest implements AutoConst
{
	public static WebDriver d;
	@BeforeMethod
	public void precoCondition()
	{
		System.setProperty(chrome_key, chrome_value);
		d=new ChromeDriver();
		d.get("https://www.facebook.com/");
	}
	@AfterMethod
	public void postCondition()
	{
		d.close();
	}
}
