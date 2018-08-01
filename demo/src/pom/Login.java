package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.BasePage;

public class Login extends BasePage
{
	@FindBy(id="email")
	private WebElement username;
	
	@FindBy(name="pass")
	private WebElement password;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement login;

	public Login(WebDriver d) {
		super(d);
		PageFactory.initElements(d,this);
	}
	public WebElement username()
	{
		return username;
	}
	public WebElement password()
	{
		return password;
	}
	public WebElement login()
	{
		return login;
	}

}
