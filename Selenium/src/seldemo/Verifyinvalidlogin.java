package seldemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verifyinvalidlogin {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com");
		
	driver.findElement(By.id("email")).sendKeys("ironnnmNn213@hotmail.com");
	
	driver.findElement(By.id("pass")).sendKeys("pass12345");
	
	driver.findElement(By.name("login")).click();
	
	String actualerrormsg = driver.findElement(By.cssSelector("#email_container > div._9ay7")).getText();
	String expectederrormsg = "The email you entered isn’t connected to an account. Find your account and log in.";
	
	if(actualerrormsg.contains(expectederrormsg)) {
		
		System.out.println("Testcase is passed");}
		else { System.out.println("Testcase is failed");
	
	}
	
	}

}
