package org.hrt;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FanList {
	
	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\HAI\\eclipse-workspace\\SeleniumWindow\\hearts\\chromedriver.exe");	
	
	WebDriver dri = new ChromeDriver();
	
	dri.get("https://www.homedepot.com/");
	
	WebElement search = dri.findElement(By.id("headerSearch"));
	
	search.sendKeys("celling fan");

	Robot a1 = new Robot();
	
	a1.keyPress(KeyEvent.VK_DOWN);
	a1.keyRelease(KeyEvent.VK_DOWN);
	
	a1.keyPress(KeyEvent.VK_ENTER);
	a1.keyRelease(KeyEvent.VK_ENTER);
	
	Thread.sleep(4000);
	
	JavascriptExecutor j1 = (JavascriptExecutor) dri;
	
	WebElement down = dri.findElement(By.xpath("(//div[@class='vis-nav__text'])[5]"));
	
	j1.executeScript("arguments[0].scrollIntoView(true)", down);
	
	WebElement brown = dri.findElement(By.xpath("(//div[@class='product-pod__title'])[1]"));
	
	brown.click();
	
	Thread.sleep(2000);
	
	String prt = dri.getWindowHandle();
	
	System.out.println(prt);
	
	Set<String> totalid = dri.getWindowHandles();
	
	System.out.println(totalid);
	
	for(String a : totalid) {
		
		if(!prt.equals(a)) {
			
			dri.switchTo().window(a);
		}
	}
	
	JavascriptExecutor jk = (JavascriptExecutor) dri;
	
	WebElement dwnele = dri.findElement(By.id("credit-promo-apply-now"));
	
	jk.executeScript("arguments[0].scrollIntoView(true)",dwnele);
	
	TakesScreenshot tf = (TakesScreenshot) dri;
	
	File defloc = tf.getScreenshotAs(OutputType.FILE);
	
	File newloc =new File("C:\\Users\\HAI\\eclipse-workspace\\SeleniumWindow\\My ScreenShots//fanprice.png");
	
	FileUtils.copyFile(defloc, newloc);

	WebElement cat= dri.findElement(By.xpath("//span[text()='Add to Cart']"));
		
		cat.click();
		
		Thread.sleep(4000);
		
			dri.quit();	
		
		
		
		
		
		
		
		
		
		
		
	}

}
