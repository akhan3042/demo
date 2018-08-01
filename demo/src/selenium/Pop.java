package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abdul\\Desktop\\chromedriver.exe" );
		WebDriver d = new ChromeDriver();
		
		d.get("https://www.cleartrip.com/");
		d.findElement(By.id("DepartDate")).click();
		
		Thread.sleep(1000);
		d.findElement(By.xpath("//span[.='July']/../../..//a[.='12']")).click();

	}

}
