package com.seleniumtraining.day1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadV1 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		//https://cgi-lib.berkeley.edu/ex/fup.html
		WebDriver driver=new ChromeDriver();
		 driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		 driver.manage().window().maximize();
		 Thread.sleep(4000);
		 JavascriptExecutor js= (JavascriptExecutor)driver;
		 js.executeScript("window.scrollBy(0,300)");
		 Thread.sleep(4000);
		 driver.findElement(By.xpath("//input[@name='upfile']")).sendKeys("C:\\Users\\Satee\\Downloads\\selenium.png");
		 driver.findElement(By.xpath("//input[@name='upfile']")).sendKeys(Keys.F10);
		 
		
		 

	}

}
