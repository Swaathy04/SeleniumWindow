package org.hrt;

import java.net.InterfaceAddress;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindSel {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HAI\\eclipse-workspace\\SeleniumWindow\\hearts\\chromedriver.exe");
		
		WebDriver kart = new ChromeDriver();
		
		kart.get("https://www.flipkart.com/");

		Thread.sleep(4000);

		kart.manage().window().maximize();

		WebElement close = kart.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
		close.click();
		Actions fk = new Actions(kart);

		WebElement fur = kart.findElement(By.xpath("(//li[@class='Wbt_B2 _1YVU3_'])[6]"));

		fk.moveToElement(fur).perform();

		fur.click();

		WebElement dine = kart.findElement(By.xpath("//a[text()='Dining Tables & Chairs']"));

		fk.moveToElement(dine).perform();

		dine.click();
		
		Thread.sleep(4000);

		WebElement din = kart.findElement(By.xpath("(//a[@class='_2cLu-l'])[4]"));

		din.click();
		
		Thread.sleep(1000);

		// To get parentid

		  String prtid = kart.getWindowHandle();
		  
		  System.out.println(prtid);
		  
		  // To get allid
		  
		  Set<String> allid = kart.getWindowHandles();
		  
		  System.out.println(allid);
		  
		  for(String x:allid) {
		  
		  if(!prtid.equals(x)) {
		  
		  kart.switchTo().window(x); } }
		  
		  WebElement code = kart.findElement(By.id("pincodeInputId"));
		  
		  code.sendKeys("600128");
		 
		 
		 WebElement chk = kart.findElement(By.xpath("//span[@class='_2aK_gu']"));
		 
		 chk.click();
		 
		 JavascriptExecutor jk = (JavascriptExecutor) kart;
		 
		 WebElement dwn = kart.findElement(By.xpath("//button[@class='_2AkmmA _1wk2G8 _2HNZdt _7UHT_c']"));
		 
		  jk.executeScript("arguments[0].scrollIntoView(true)", dwn);
		  
		  WebElement cart = kart.findElement(By.xpath("//button[@class='_2AkmmA _2Npkh4 _2MWPVK']"));
		  
		 cart.click();
		 
		 Thread.sleep(4000);
		 

		
		
		
		
		
		
		
		
	}
	
}
