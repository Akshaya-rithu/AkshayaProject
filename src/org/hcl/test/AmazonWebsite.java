package org.hcl.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonWebsite {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\Scanner1\\AKSHAYA\\Selenium-Day1-BrowserLaunch\\Day6 Task\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Actions a = new Actions(driver);
		Robot r = new Robot();
		// sign in arrow
		WebElement signin = driver.findElement(By.xpath("(//span[@class='nav-icon nav-arrow'])[2]"));
		a.moveToElement(signin).click().perform();
		
		// after clicking login page open and inspect..
		WebElement phno = driver.findElement(By.id("ap_email"));
		a.sendKeys(phno, "9600560816").perform();
		
		//doubleclick to select
		a.doubleClick(phno).perform();
		
		//rightclick to cut phno
		a.contextClick(phno).perform();
		
		//downarrow press for cut
		for (int i = 0; i < 3; i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		}
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
			
		WebElement cont = driver.findElement(By.id("continue"));
		a.moveToElement(cont).click().perform();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		Thread.sleep(3000);
		
		WebElement login = driver.findElement(By.id("signInSubmit"));
		a.moveToElement(login).click().perform();;
	}

}
