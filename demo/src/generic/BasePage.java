package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class BasePage 
{
	public static WebDriver d;
	
	public BasePage(WebDriver d)
	{
		this.d=d;
	}
	public static  void pageVerify(String title)
	{
		WebDriverWait wait=new WebDriverWait(d, 20);
		try 
		{
			wait.until(ExpectedConditions.titleContains(title));
			Reporter.log("title is matching:pass",true);
		} catch (Exception e) 
		{
			Reporter.log("title is not matching:fail",true);
		}
	}
	public static  void eleVerify(String element)
	{
		WebDriverWait wait=new WebDriverWait(d, 20);
		try 
		{
			wait.until(ExpectedConditions.titleContains(element));
			Reporter.log("element is matching:pass",true);
		} catch (Exception e) 
		{
			Reporter.log("element is not matching:fail",true);
		}
	}
}
