package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Type_Fpop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abdul\\Desktop\\chromedriver.exe" );
		WebDriver d = new ChromeDriver();
		
		d.get("https://my.monsterindia.com/create_account.html?r=1481333332");
		d.findElement(By.id("wordresume")).sendKeys("C:\\Users\\Abdul\\Desktop\\Application Form.pdf");
	}

}
