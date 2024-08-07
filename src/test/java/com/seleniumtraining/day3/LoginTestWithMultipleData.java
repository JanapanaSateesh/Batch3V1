package com.seleniumtraining.day3;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.seleniumtraining.day1.ReadExcelData;

public class LoginTestWithMultipleData {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		ReadExcelData exceldata=new ReadExcelData();
		String[][] data= exceldata.getData();
		String	url1=data[0][0];
		System.out.println(url1);
		
		String username1= data[0][1];
		String password1=data[0][2];
		
		String	url2=data[1][0];
		String username2= data[1][1];
		String password2=data[1][2];
		
		String	url3=data[2][0];
		String username3= data[2][1];
		String password3=data[2][2];
		
		
			WebDriver driver =new ChromeDriver();
			driver.get(url1);
			driver.manage().window().maximize();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username1);
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password1);
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			
			driver.get(url2);
			driver.manage().window().maximize();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username2);
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password2);
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			
			driver.get(url3);
			driver.manage().window().maximize();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username3);
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password3);
			driver.findElement(By.xpath("//button[@type='submit']")).click();
	
		

		
	}

}
