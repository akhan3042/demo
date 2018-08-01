package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class New {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abdul\\Desktop\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("file:///C:/Users/Abdul/Desktop/textbox.html");
		List<WebElement> li = d.findElements(By.tagName("input"));
		for (WebElement e : li) {
			e.clear();
			e.sendKeys("abdul");
			//Thread.sleep(1000);
		}
		
	}

}
