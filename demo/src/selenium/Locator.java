package selenium;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abdul\\Desktop\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.facebook.com/");
		//d.manage().window().maximize();
		/*WebElement	e=d.findElement(By.xpath("//table[@id='a']"));
		e.findElement(By.xpath("//tr[1]/td[3]"));*/
		//d.findElement(By.xpath("//a[.='Forgotten account?']")).click();
		//d.findElement(By.xpath("//input[@id='email']")).sendKeys("aajshh");
		//d.findElement(By.xpath("//a[text() = 'Forgotten account?']")).click();
		//d.findElement(By.xpath("//input[@name = 'email']")).sendKeys("abdulkhan");
		//WebElement	e=d.findElement(By.id("email"));
		//e.sendKeys("akhan3042");
		//d.findElement(By.name("pass")).sendKeys("abc");
		//d.findElement(By.className("inputtext")).sendKeys("akak");
		/*java.util.List<WebElement> li = d.findElements(By.className("inputtext"));
		for (WebElement e : li) {
			//e.clear();
			e.sendKeys("asd");
			Thread.sleep(1000);
		}*/
		}	

	}


