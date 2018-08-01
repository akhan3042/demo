package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abdul\\Desktop\\chromedriver.exe" );
		WebDriver d = new ChromeDriver();
		
		d.get("file:///C:/Users/Abdul/Desktop/1.html");
		
		JavascriptExecutor j=(JavascriptExecutor) d;
		j.executeScript("confirm('hello')", "");
		Thread.sleep(1000);
		
		Alert al=d.switchTo().alert();
		System.out.println(al.getText());
		al.dismiss();

	}

}
