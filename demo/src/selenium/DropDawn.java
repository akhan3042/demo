package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDawn {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abdul\\Desktop\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("file:///C:/Users/Abdul/Desktop/drop.html");
		Select s=new Select(d.findElement(By.id("abc")));
		Thread.sleep(1000);
		s.selectByVisibleText("D");
		Thread.sleep(1000);
		s.selectByValue("f");
		Thread.sleep(1000);
		s.selectByIndex(7);

	}

}
