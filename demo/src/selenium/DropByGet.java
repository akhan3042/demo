package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropByGet {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abdul\\Desktop\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("file:///C:/Users/Abdul/Desktop/drop.html");
		Select	s=new Select(d.findElement(By.id("abc")));
		List<WebElement> li = s.getOptions();
		for (WebElement e : li) {
			String s1=e.getText();
			System.out.println(s1);
		}

	}

}
