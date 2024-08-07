package com.seleniumtraining.day1;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLinks {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.get("https://demoqa.com/broken");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		List<WebElement> list= driver.findElements(By.tagName("a"));
		for(WebElement ele:list) {
			String linkvalue= ele.getAttribute("href");
			//System.out.println(linkvalue);
			if(linkvalue==null) {
				
			}
			else {
				URL hrefurl=new URL(linkvalue);
				HttpURLConnection con=(HttpURLConnection)hrefurl.openConnection();
				con.setConnectTimeout(3000);
				con.connect();
				
				if(con.getResponseCode()==200) {
					
				}
				else {
					System.out.println("Broken URL is:"+ linkvalue);
				}
				
			}
		}
		
		
		
		
	}

}
