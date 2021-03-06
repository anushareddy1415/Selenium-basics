 package seldemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Implicitandexplicit {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.linkText("Dynamic Loading")).click();
		
		 driver.findElement(By.partialLinkText("Example 1")).click();
		 
		 driver.findElement(By.cssSelector("#start > button")).click();
		 
		 WebDriverWait wait = new WebDriverWait(driver,20);
		 wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("#finish > h4")));
				 
		 String actualText = driver.findElement(By.cssSelector("#finish > h4")).getText();
		  String expectedText = "Hello World!";
		 
		 if(actualText.equals(expectedText)){
			 System.out.println("test case is passed");}
			 else {
				 System.out.println("test case is failed");
				 
		 }
		 driver.close();
}
}