package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abdul\\Desktop\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("file:///C:/Users/Abdul/Desktop/1.html");
		
		d.findElement(By.id("a")).sendKeys("abdul");  
		Thread.sleep(1000);
		
		d.switchTo().frame("b");            //by index
		d.findElement(By.id("b")).sendKeys("Nazreen");
		
		d.switchTo().defaultContent();
		d.findElement(By.id("c")).sendKeys("love");
		

	}

}
