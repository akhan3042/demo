package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pract {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abdul\\Desktop\\chromedriver.exe" );
		WebDriver d = new ChromeDriver();
		
		d.get("file:///C:/Users/Abdul/Desktop/1.html");
		d.findElement(By.id("a")).sendKeys("abdul");
		Thread.sleep(1000);
		d.switchTo().frame(0);
		d.findElement(By.id("b")).sendKeys("khan");
		Thread.sleep(1000);
		d.switchTo().defaultContent();
		d.findElement(By.id("c")).sendKeys("mumbai");

	}

}
