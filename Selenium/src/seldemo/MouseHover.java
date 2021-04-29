   package seldemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {
	public static void main(String[] args) {
		  WebDriver driver = new ChromeDriver();
			 
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			driver.get("https://www.amazon.ca/");
			
		WebElement Signin = driver.findElement(By.cssSelector("#nav-link-accountList > span.nav-line-2.nav-long-width"));
	
		Actions hover = new Actions(driver);
		
		hover.moveToElement(Signin).perform();
		driver.findElement(By.linkText("Your Account")).click();
}
	
}