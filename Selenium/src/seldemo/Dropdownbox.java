package seldemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownbox {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.findElement(By.partialLinkText("Create New Account")).click();
		 
	  WebElement monthdd = driver.findElement(By.id("month"));
	
	Select dd = new Select(monthdd);
	dd.selectByVisibleText("Jul");
	
 WebElement daydd = driver.findElement(By.id("day"));	
	
  Select d = new Select(daydd);
    d.selectByValue("22");
    
  
 
	 
		
	}
	}


