package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM {
	@FindBy(id="username")
	private WebElement username;
	
	@FindBy(name="pwd")
	private WebElement password;
	
	@FindBy(xpath="//a[.='login ']")
	private WebElement login;
	
	public POM(WebDriver d)
	{
		PageFactory.initElements(d, this);
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
	
	

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abdul\\Desktop\\chromedriver.exe" );
		WebDriver d = new ChromeDriver();
		
		d.get("file:///C:/Users/Abdul/Desktop/mulpitle.html");
		
		POM p=new POM(d);
		p.username().sendKeys("asde");
		p.password().sendKeys("sax");
		p.login().click();
		Thread.sleep(2000);
		p.username().sendKeys("admin");
		p.password().sendKeys("manager");
		p.login().click();
		
		
	

	}

}
