package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiple {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Abdul\\Desktop\\geckodriver.exe");
		WebDriver d=new FirefoxDriver();
		d.get("file:///C:/Users/Abdul/Desktop/mulpitle.html");
		Select s=new Select(d.findElement(By.id("abc")));
		s.selectByVisibleText("A");
		Thread.sleep(1000);
		s.selectByVisibleText("C");

	}

}
