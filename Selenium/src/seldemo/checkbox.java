package seldemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbox {
	public static void main(String[] args) {
		  WebDriver driver = new ChromeDriver();
			driver.get("https://the-internet.herokuapp.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			driver.findElement(By.linkText("Checkboxes")).click();
			
		boolean checkboxSelected = driver.findElement(By.cssSelector("#checkboxes > input[type=checkbox]:nth-child(3)")).isSelected();
		if(checkboxSelected == true)
		{ driver.findElement(By.cssSelector("#checkboxes > input[type=checkbox]:nth-child(3)")).click();
		}
		driver.findElement(By.cssSelector("#checkboxes > input[type=checkbox]:nth-child(3)")).click();
		
}}