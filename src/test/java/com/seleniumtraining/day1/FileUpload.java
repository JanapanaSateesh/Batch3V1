package com.seleniumtraining.day1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		 driver.get("https://demoqa.com/automation-practice-form");
		 driver.manage().window().maximize();
		 driver.findElement(By.id("firstName")).sendKeys("Sateesh M");
		 driver.findElement(By.id("userEmail")).sendKeys("Sateesh@gmail.com");
		 JavascriptExecutor js= (JavascriptExecutor)driver;
		 js.executeScript("window.scrollBy(0,300)");
		 
		 Thread.sleep(4000);

		 //driver.findElement(By.xpath("//input[@id='uploadPicture']")).click();
		 StringSelection str = new StringSelection("‪‪C:\\Users\\Satee\\Downloads\\selenium.png");
		 Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		 
		 
		 js.executeScript("arguments[0].click();",driver.findElement(By.xpath("//input[@id='uploadPicture']")));
		 Thread.sleep(4000);
		  // Robot object creation
	      Robot r = new Robot();
	      
	    
	      
	      //pressing enter
//	      r.keyPress(KeyEvent.VK_ENTER);
//	      //releasing enter
//	      r.keyRelease(KeyEvent.VK_ENTER);
	      //pressing ctrl+v
	      r.keyPress(KeyEvent.VK_CONTROL);
	      r.keyPress(KeyEvent.VK_V);
	      //releasing ctrl+v
	      r.keyRelease(KeyEvent.VK_CONTROL);
	      r.keyRelease(KeyEvent.VK_V);
	      //pressing enter
	      r.keyPress(KeyEvent.VK_ENTER);
	      //releasing enter
	      r.keyRelease(KeyEvent.VK_ENTER);
	}

}
