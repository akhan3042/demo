package selenium;

import org.apache.xalan.xsltc.compiler.SyntaxTreeNode;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import net.sourceforge.htmlunit.corejs.javascript.tools.debugger.treetable.TreeTableModelAdapter;

public class Demo 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abdul\\Desktop\\chromedriver.exe" );
		WebDriver d = new ChromeDriver();
		
		d.get("file:///C:/Users/Abdul/Desktop/mulpitle.html");
		
		Select s=new Select(d.findElement(By.id("abc")));
		//s.selectByIndex(0);
		//Thread.sleep(1000);
		//s.selectByValue("b");
		Thread.sleep(1000);
		s.selectByVisibleText("D");
		s.selectByVisibleText("C");
		
		/*d.get("file:///C:/Users/Abdul/Downloads/1.html");
		d.findElement(By.id("a")).sendKeys("abd");
		Thread.sleep(1000);
		d.switchTo().frame(0);
		d.findElement(By.id("b")).sendKeys("znxnxn");
		Thread.sleep(1000);
		d.switchTo().defaultContent();
		d.findElement(By.id("c")).sendKeys("wewe");*/
		/*Thread.sleep(1000);
		d.get("http://www.sarkariresult.com/");
		d.manage().window().maximize();
		System.out.println(d.getCurrentUrl());
		System.out.println(d.getPageSource());
		System.out.println(d.getTitle());
		d.close();
		
		d.quit();*/
		//d.get("file:///C:/Users/Abdul/Desktop/table1.html");
		//WebElement e = d.findElement(By.xpath("//table[@id='a']"));
		//e.findElement(By.xpath("//tr[4]/td[3]")).click();
		//d.findElement(By.xpath("//td[.='python']/..//a[.='Download']")).click();
		
		//WebElement e=d.findElement(By.id("email"));
		//e.sendKeys("king");
		//d.findElement(By.name("pass")).sendKeys("akjjdjksajkf");
		//d.findElement(By.linkText("actiTIME")).click();
		//d.findElement(By.partialLinkText("Inc")).click();
		//d.findElement(By.tagName("a")).click();
		//d.findElement(By.xpath("//table[@id='a']"));
		//e.findElement(By.xpath("//tr[1]/td[3]"));
		

	}

}
