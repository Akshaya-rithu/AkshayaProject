package org.hcl.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ques5DoubleClickCore {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\Scanner1\\AKSHAYA\\Selenium-Day1-BrowserLaunch\\Day6 Task\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		Actions a = new Actions(driver);
		WebElement download = driver.findElement(By.xpath("//strong[text()='WRAPPER CLASS']"));
		a.moveToElement(download).perform();

		a.contextClick(download).perform();
		Robot r = new Robot();
		Thread.sleep(3000);
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

}




/*
 * QUESTION 6 WebElement fullwebpage =
 * driver.findElement(By.xpath("//div[@id='body-wrapper']")); Actions a=new
 * Actions(driver); Robot r=new Robot(); a.contextClick(fullwebpage).perform();
 * for (int i = 0; i < 3; i++) { r.keyPress(KeyEvent.VK_DOWN);
 * r.keyRelease(KeyEvent.VK_DOWN); } r.keyPress(KeyEvent.VK_ENTER);
 * r.keyRelease(KeyEvent.VK_ENTER);
 */

/*
 * QUESTION 6 WebElement fullwebpage =
 * driver.findElement(By.xpath("//div[@id='body-wrapper']")); Actions a=new
 * Actions(driver); Robot r=new Robot(); a.contextClick(fullwebpage).perform();
 * for (int i = 0; i < 3; i++) { r.keyPress(KeyEvent.VK_DOWN);
 * r.keyRelease(KeyEvent.VK_DOWN); } r.keyPress(KeyEvent.VK_ENTER);
 * r.keyRelease(KeyEvent.VK_ENTER);
 */

/*
 * QUESTION 5 Actions a=new Actions(driver);
 * 
 * Robot r=new Robot(); WebElement core =
 * driver.findElement(By.xpath("(//a[@target='_blank'])[184]")); core.click();
 */