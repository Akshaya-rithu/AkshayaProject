package org.hcl.test;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Quest3greensTech {

	public static void main(String[] args) 
 {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\Scanner1\\AKSHAYA\\Selenium-Day1-BrowserLaunch\\Day6 Task\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		//Robot r=new Robot();
		//Actions a=new Actions(driver);
		WebElement cts = driver.findElement(By.xpath("(//a[@target='_blank'])[145]"));
		cts.click();
		
		
		
		
		/*
		 * WebElement greens = driver.findElement(By.xpath("//p[contains(text(),'Greens technology’s selenium training ')]"));
		a.doubleClick(greens).perform();
		a.contextClick(greens).perform();
		for (int i = 0; i < 3; i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		}
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);*/
	}

}
