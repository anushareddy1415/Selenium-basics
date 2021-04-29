package seldemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Titlepage {
	public static void main(String[] args) {
		System.setProperty("webDriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
String actualTitle = driver.getTitle();
		
		String expectedTitle = "Facebook - Log In or Sign Up";
		if(actualTitle.contains(expectedTitle)) {
		
			System.out.println("Testcase is passed");
			
			}	
		else { System.out.println("Testcase is Failed");
		}
		driver.close();
		}

}



