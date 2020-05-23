package org.hcl.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Questtion1012Flipkart {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\Scanner1\\AKSHAYA\\Selenium-Day1-BrowserLaunch\\Day6 Task\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Actions a=new Actions(driver);
		WebElement btn = driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
		btn.click();
		WebElement firstItem = driver.findElement(By.xpath("//span[text()='Electronics']"));
		a.moveToElement(firstItem).perform();
		WebElement mi = driver.findElement(By.xpath("(//a[@title='Mi'])[1]"));
		a.contextClick(mi).perform();
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		
		
		
		
		
		
		/*WebElement login= driver.findElement(By.xpath("//a[text()='Login']"));
		Actions a = new Actions(driver);
	//	a.moveToElement(login).click().perform();
	//	login.click();
		Thread.sleep(3000);
		
		WebElement phno = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		a.moveToElement(phno).sendKeys(phno,"9600560816").perform();
		Thread.sleep(3000);
		Robot r=new Robot();
		a.doubleClick(phno).perform();
		a.contextClick(phno).perform();
		Thread.sleep(3000);
		for (int i = 0; i < 3; i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		}
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		a.contextClick(password).perform();
		Thread.sleep(3000);
		for (int i = 0; i < 4; i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		}
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);*/
	}

}
