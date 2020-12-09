package org.hrt;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Greens {

	public static void main(String[] args) throws InterruptedException, IOException {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\HAI\\eclipse-workspace\\SeleniumWindow\\hearts\\chromedriver.exe");
	
	WebDriver gns = new ChromeDriver();
	
	gns.get("http://www.greenstechnologys.com/");
	
	JavascriptExecutor jk = (JavascriptExecutor) gns;
	
	WebElement down = gns.findElement(By.xpath("(//span[contains (text(),'+91- 89399 15577')])[2]"));
	
	jk.executeScript("arguments[0].scrollIntoView(true)", down);
	
	Thread.sleep(3000);
	
	TakesScreenshot tk = (TakesScreenshot) gns;
	
	File defloc = tk.getScreenshotAs(OutputType.FILE);
	
	File newloc = new File ("C:\\Users\\HAI\\eclipse-workspace\\SeleniumWindow\\My ScreenShots//GreenTech.png");
	
	FileUtils.copyFile(defloc, newloc);
		
		
	}
	
	
}
