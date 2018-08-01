package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sync {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abdul\\Desktop\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.facebook.com/");
		d.findElement(By.id("email")).sendKeys("akhan3042@gmail.com");
		d.findElement(By.name("pass")).sendKeys("kingkhan");
		d.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(1000);
		
	}

}
