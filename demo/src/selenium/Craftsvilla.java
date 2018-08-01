package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Craftsvilla 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abdul\\Desktop\\chromedriver.exe" );
		WebDriver d = new ChromeDriver();
		
		d.get("https://www.craftsvilla.com/");
		Thread.sleep(1000);
		d.findElement(By.id("searchval")).sendKeys("patiala");
		d.findElement(By.xpath("//button[@class='btn btn-default search-button']")).click();
		
		

	}

}
