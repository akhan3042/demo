package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithoutSendkeys {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abdul\\Desktop\\chromedriver.exe" );
		WebDriver d = new ChromeDriver();
		
		d.get("file:///C:/Users/Abdul/Desktop/1.html");
		
		JavascriptExecutor j=(JavascriptExecutor) d;
		j.executeScript("document.getElementById('a').value='shahj'", "");
		Thread.sleep(1000);
		WebElement e = d.findElement(By.xpath("//input[@id='c']"));
		j.executeScript("arguments[0].value=arguments[1]",e,"565555");
		

	}

}
