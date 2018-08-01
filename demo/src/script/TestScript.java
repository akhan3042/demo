package script;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel;
import pom.Login;

@Listeners(generic.Listeners.class)
public class TestScript extends BaseTest
{
	@Test
	public void validLogin() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		Login l=new Login(d);
		l.username().sendKeys(Excel.readData("Sheet1", 1, 1));
		Thread.sleep(1000);
		l.password().sendKeys(Excel.readData("Sheet1", 2, 1));
		l.login().click();
	}
	@Test
	public void InvalidLogin() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		Login l=new Login(d);
		l.username().sendKeys(Excel.readData("Sheet1", 1, 1));
		Thread.sleep(1000);
		l.password().sendKeys(Excel.readData("Sheet1", 2, 1));
		Assert.fail();
		l.login().click();
	}
	
}
