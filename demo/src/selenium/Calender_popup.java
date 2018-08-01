package selenium;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender_popup {

	public static void main(String[] args) {
		Date date=new Date();
		SimpleDateFormat s1=new SimpleDateFormat("d");
		SimpleDateFormat s2=new SimpleDateFormat("MMM");
		String st1=s1.format(date);
		String st2=s2.format(date);

		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abdul\\Desktop\\chromedriver.exe" );
		WebDriver d = new ChromeDriver();
		
		
		d.get("https://www.cleartrip.com/");
		d.findElement(By.id("DepartDate")).click();
		d.findElement(By.id("//span[.='+st2+']/../../..//a[.='+st1+']")).click();

	}

}
