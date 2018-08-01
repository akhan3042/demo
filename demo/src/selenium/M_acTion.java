package selenium;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class M_acTion {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abdul\\Desktop\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.amazon.in/");
		Thread.sleep(1000);
		
		
		WebElement e = d.findElement(By.xpath("//span[.='Category']"));
		Actions a=new Actions(d);
		a.contextClick(e).perform();
		
		Thread.sleep(1000);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_W);
		r.keyRelease(KeyEvent.VK_W);
		/*WebElement e=d.findElement(By.xpath("//span[.='Category']"));
		Actions a=new Actions(d);
		//a.moveToElement(e).perform();
		a.contextClick(e).perform();
		Thread.sleep(1000);
		
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_W);
		r.keyRelease(KeyEvent.VK_W);*/

	}

}
