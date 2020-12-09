package org.hrt;


import java.time.Month;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Face {

	
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\HAI\\eclipse-workspace\\SeleniumWindow\\hearts\\chromedriver.exe");
	
	 WebDriver fb = new ChromeDriver();
	 
	 fb.get("https://www.facebook.com/");
	 
	 WebElement mail = fb.findElement(By.id("email"));
	 
	 mail.sendKeys("sweet123");
	 
	 WebElement pas = fb.findElement(By.id("pass"));
	 
	 pas.sendKeys("1234trd");
	 
	 WebElement st = fb.findElement(By.id("day"));
	 
	 Select sc = new Select(st);
	 
	 sc.selectByValue("11");
	 
	 Thread.sleep(2000);
	 
	 WebElement mon = fb.findElement(By.id("month"));
	 
	 Select sc1 = new Select(mon);
	 
	 sc1.selectByValue("9");
	
	Thread.sleep(2000);
	
	WebElement yr = fb.findElement(By.id("year"));
	
	 Select ft = new Select(yr);
	 
	 ft.selectByValue("1996");
		
		
		
		
	
		
		
		
		
	}
}
